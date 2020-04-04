package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Edge {
	int from;
	int to;

	public Edge() {
	}

	public Edge(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + from;
		result = prime * result + to;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (from != other.from)
			return false;
		if (to != other.to)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Edge [from=" + from + ", to=" + to + "]";
	}

}

public class Main11403_sanghee {

	public static int[][] findPath(int arr[][]) {
		int n = arr.length;
		int result[][] = new int[n][n];

		for (int start = 0; start < n; start++) {

			Stack<Edge> stack = new Stack<Edge>();
			boolean visited[] = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (arr[start][i] == 1) {
					stack.push(new Edge(start, i));
				}
			}

			while (!stack.isEmpty()) {
				Edge v = stack.pop();
				if (visited[v.to])
					continue;
				visited[v.to] = true;
				result[start][v.to] = 1;

				for (int i = 0; i < n; i++) {
					if (arr[v.to][i] == 1) {
						stack.push(new Edge(v.to, i));
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int result[][] = findPath(arr);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					bw.write(Integer.toString(result[i][j]));
					bw.write(" ");
				}
				bw.write("\n");
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
