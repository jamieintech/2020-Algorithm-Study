package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Vertex3 {
	int x;
	int y;
	int count;

	public Vertex3() {

	}

	public Vertex3(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Vertex3(int x, int y, int count) {
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
		Vertex3 other = (Vertex3) obj;
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
		return "Vertex3 [x=" + x + ", y=" + y + ", count=" + count + "]";
	}

}

public class Main7576_sanghee {
	static int tomatoes[][];
	static Queue<Vertex3> queue;
	static boolean visited[][];

	public static void visit(int x, int y, int day) {
		if (!visited[y][x]) {
			visited[y][x] = true;
			if (tomatoes[y][x] == 0) {
				queue.add(new Vertex3(x, y, day));
				tomatoes[y][x] = 1;
			}
		}
	}

	public static int countDay() {
		queue = new LinkedList<Vertex3>();
		int n = tomatoes.length;
		int m = tomatoes[0].length;
		visited = new boolean[n][m];
		int day = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (tomatoes[i][j] == 1) {
					visited[i][j] = true;
					queue.add(new Vertex3(j,i,0));
				}
			}
		}
		while (!queue.isEmpty()) {
			Vertex3 v = queue.poll();
			int x = v.x;
			int y= v.y;
			day = v.count;
			tomatoes[y][x] = 1;
			if (y > 0) {
				visit(x, y - 1, v.count + 1);
			}
			if (y < n - 1) {
				visit(x, y + 1, v.count + 1);
			}
			if (x > 0) {
				visit(x - 1, y, v.count + 1);
			}
			if (x < m - 1) {
				visit(x + 1, y, v.count + 1);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && tomatoes[i][j] == 0) {
					return -1;
				}
			}
		}

		return day;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line[] = br.readLine().split(" ");
			int m = Integer.parseInt(line[0]);
			int n = Integer.parseInt(line[1]);
			tomatoes = new int[n][m];
			for (int i = 0; i < n; i++) {
				line = br.readLine().split(" ");
				for (int j = 0; j < m; j++) {
					tomatoes[i][j] = Integer.parseInt(line[j]);
				}
			}
			System.out.println(countDay());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
