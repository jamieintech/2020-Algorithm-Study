package priorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main11286_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (Math.abs(o1) == Math.abs(o2))
					return Integer.compare(o1, o2);
				return Integer.compare(Math.abs(o1), Math.abs(o2));
			}
		});
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				int num = Integer.parseInt(br.readLine());
				if (num == 0) {
					if (queue.isEmpty()) {
						System.out.println(0);
					} else {
						System.out.println(queue.remove());
					}
				} else
					queue.add(num);
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
