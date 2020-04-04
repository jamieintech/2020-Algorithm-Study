package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Vertex {
	int x;
	int y;
	int count;

	public Vertex() {

	}

	public Vertex(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Vertex(int x, int y, int count) {
		super();
		this.x = x;
		this.y = y;
		this.count = count;
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
		result = prime * result + count;
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
		if (count != other.count)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vertex [x=" + x + ", y=" + y + ", count=" + count + "]";
	}

}

public class Main2178_sanghee {

	public static int solveMaze(int maze[][]) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		int n = maze.length;
		int m = maze[0].length;
		boolean visited[][] = new boolean[n][m];
		Vertex end = new Vertex(m - 1, n - 1);

		visited[0][0] = true;
		queue.add(new Vertex(0, 0, 1));

		while (!queue.isEmpty()) {

			Vertex v = queue.poll();
			if (v.x == end.x && v.y == end.y)
				return v.count;
			if (v.y > 0) {
				int x = v.x;
				int y = v.y - 1;
				if (!visited[y][x] && maze[y][x] == 1) {
					visited[y][x] = true;
					queue.add(new Vertex(x, y, v.count + 1));
				}
			}
			if (v.y < n - 1) {
				int x = v.x;
				int y = v.y + 1;
				if (!visited[y][x] && maze[y][x] == 1) {
					visited[y][x] = true;
					queue.add(new Vertex(x, y, v.count + 1));
				}
			}
			if (v.x > 0) {
				int x = v.x - 1;
				int y = v.y;
				if (!visited[y][x] && maze[y][x] == 1) {
					visited[y][x] = true;
					queue.add(new Vertex(x, y, v.count + 1));
				}
			}
			if (v.x < m - 1) {
				int x = v.x + 1;
				int y = v.y;
				if (!visited[y][x] && maze[y][x] == 1) {
					visited[y][x] = true;
					queue.add(new Vertex(x, y, v.count + 1));
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			int maze[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				line = br.readLine().split("");
				for (int j = 0; j < m; j++) {
					maze[i][j] = Integer.parseInt(line[j]);
				}
			}
			System.out.println(solveMaze(maze));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
