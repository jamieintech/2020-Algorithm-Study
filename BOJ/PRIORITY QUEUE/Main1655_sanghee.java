package priorityQueue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main1655_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			maxHeap.add(Integer.parseInt(br.readLine()));
			bw.write(maxHeap.peek() + "\n");
			for (int i = 1; i < n; i++) {
				int num = Integer.parseInt(br.readLine());
				if (maxHeap.peek() > num)
					maxHeap.add(num);
				else if (minHeap.isEmpty() || minHeap.peek() < num)
					minHeap.add(num);
				else {
					minHeap.add(num);
				}
				while (maxHeap.size() > minHeap.size() + 1) {
					minHeap.add(maxHeap.remove());
				}
				while (minHeap.size() > maxHeap.size()) {
					maxHeap.add(minHeap.remove());
				}

				bw.write(maxHeap.peek() + "\n");
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
