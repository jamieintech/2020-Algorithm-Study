package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex2 {
	int x;
	int y;

	public Vertex2() {

	}

	public Vertex2(int x, int y) {
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
		Vertex2 other = (Vertex2) obj;
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

public class Main2667_sanghee {

	public static List<Integer> countComplex(int map[][]) {
		Queue<Vertex2> queue = new LinkedList<Vertex2>();
		List<Integer> complexes = new ArrayList<Integer>();
		int n = map.length;
		boolean visited[][] = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					if (map[i][j] == 0)
						continue;

					complexes.add(0);
					int index = complexes.size() - 1;
					queue.add(new Vertex2(j, i));
					while (!queue.isEmpty()) {
						Vertex2 v = queue.poll();
						complexes.set(index, complexes.get(index) + 1);
						if (v.y > 0) {
							int x = v.x;
							int y = v.y - 1;
							if (!visited[y][x]) {
								visited[y][x] = true;
								if (map[y][x] == 1)
									queue.add(new Vertex2(x, y));
							}
						}
						if (v.y < n - 1) {
							int x = v.x;
							int y = v.y + 1;
							if (!visited[y][x]) {
								visited[y][x] = true;
								if (map[y][x] == 1)
									queue.add(new Vertex2(x, y));
							}
						}
						if (v.x > 0) {
							int x = v.x - 1;
							int y = v.y;
							if (!visited[y][x]) {
								visited[y][x] = true;
								if (map[y][x] == 1)
									queue.add(new Vertex2(x, y));
							}
						}
						if (v.x < n - 1) {
							int x = v.x + 1;
							int y = v.y;
							if (!visited[y][x]) {
								visited[y][x] = true;
								if (map[y][x] == 1)
									queue.add(new Vertex2(x, y));
							}
						}
					}
				}
			}
		}

		return complexes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int map[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				String line[] = br.readLine().split("");
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(line[j]);
				}
			}
			List<Integer> complexes = countComplex(map);
			Object[] complexesArray = complexes.toArray();
			Arrays.sort(complexesArray);
			System.out.println(complexesArray.length);
			for(Object c:complexesArray)
				System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
