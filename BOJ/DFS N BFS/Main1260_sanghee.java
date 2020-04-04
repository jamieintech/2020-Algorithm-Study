package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1260_sanghee {

	static LinkedList<Integer> edge[];
	public static String dfs(int v, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		boolean visited[] = new boolean[n+1];
		StringBuilder sb = new StringBuilder();

		stack.push(v);

		while (!stack.isEmpty()) {
			int temp = stack.pop();
			if (visited[temp])
				continue;
			visited[temp] = true;
			sb.append(temp);
			sb.append(" ");
			for (int i = n; i >= 1; i--) {
				if (!visited[i] && edge[temp].contains(i)) {
					stack.push(i);
				}
			}
		}

		return sb.toString();
	}

	public static String bfs(int v, int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[n+1];
		StringBuilder sb = new StringBuilder();

		visited[v] = true;
		queue.add(v);

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			sb.append(temp);
			sb.append(" ");
			for (int i = 1; i <= n; i++) {
				if (!visited[i] && edge[temp].contains(i)) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			edge=new LinkedList[n+1];
			for(int i=1; i<=n; i++) {
				edge[i]=new LinkedList();
			}
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				int index = line.indexOf(' ');
				int a = Integer.parseInt(line.substring(0, index));
				int b = Integer.parseInt(line.substring(index + 1));
				edge[a].add(b);
				edge[b].add(a);
			}
			System.out.println(dfs(v, n));
			System.out.println(bfs(v, n));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
