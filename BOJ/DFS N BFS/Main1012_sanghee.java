package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Vertex {
	int x;
	int y;

	public Vertex() {

	}

	public Vertex(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Vertex other = (Vertex) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vertex [x=" + x + ", y=" + y + "]";
	}

}

public class Main1012_sanghee {

	public static int countArea(int cabbages[][]) {
		Stack<Vertex> stack = new Stack<Vertex>();
		int count = 0;
		int n = cabbages.length;
		int m = cabbages[0].length;
		boolean visited[][] = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (cabbages[i][j] == 1 && !visited[i][j]) {
					count++;
					stack.push(new Vertex(j, i));

					while (!stack.isEmpty()) {
						Vertex v = stack.pop();
						if (visited[v.y][v.x])
							continue;
						visited[v.y][v.x] = true;
						if (v.y > 0) {
							int x = v.x;
							int y = v.y - 1;
							if (!visited[y][x] && cabbages[y][x] == 1) {
								stack.push(new Vertex(x, y));
							}
						}
						if (v.y < n - 1) {
							int x = v.x;
							int y = v.y + 1;
							if (!visited[y][x] && cabbages[y][x] == 1) {
								stack.push(new Vertex(x, y));
							}
						}
						if (v.x > 0) {
							int x = v.x - 1;
							int y = v.y;
							if (!visited[y][x] && cabbages[y][x] == 1) {
								stack.push(new Vertex(x, y));
							}
						}
						if (v.x < m - 1) {
							int x = v.x + 1;
							int y = v.y;
							if (!visited[y][x] && cabbages[y][x] == 1) {
								stack.push(new Vertex(x, y));
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(br.readLine());
			for (; t > 0; t--) {

				String line[] = br.readLine().split(" ");
				int m = Integer.parseInt(line[0]);
				int n = Integer.parseInt(line[1]);
				int k = Integer.parseInt(line[2]);
				int cabbages[][] = new int[n][m];
				for (int i = 0; i < k; i++) {
					line = br.readLine().split(" ");
					for (int j = 0; j < m; j++) {
						int x = Integer.parseInt(line[0]);
						int y = Integer.parseInt(line[1]);
						cabbages[y][x] = 1;
					}
				}
				System.out.println(countArea(cabbages));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
