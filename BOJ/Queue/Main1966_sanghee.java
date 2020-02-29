package queueAndDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1966_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		try {
			t = Integer.parseInt(br.readLine());
			int count[]=new int[t];
			for (int i = 0; i < t; i++) {
				LinkedList<Integer[]> list = new LinkedList<Integer[]>();
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				st = new StringTokenizer(br.readLine(), " ");
				Integer document[][] = new Integer[n][2];
				for (int j = 0; j < n; j++) {
					document[j][0] = j;
					document[j][1] = Integer.parseInt(st.nextToken());
					list.add(document[j]);
				}
				count[i] = 0;
				while (true) {
					Integer[] max = list.remove();
					int size = list.size();
					int j;
					for (j = 0; j < size; j++) {
						if (max[1] < list.get(j)[1]) {
							list.add(max);
							break;
						}
					}
					if (j == size) {
						count[i]++;
						if (max[0] == m)
							break;
					}
				}

			}
			for(int c:count) {
				System.out.println(c);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
