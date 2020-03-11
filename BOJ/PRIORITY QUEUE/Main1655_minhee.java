package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main1655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> pq_max = new PriorityQueue<Integer>(Comparator.naturalOrder());
		Queue<Integer> pq_min = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		for (int i =0; i<n;i++) {
			int nextNum = sc.nextInt();
			
			pq_max.add(nextNum);
			if((pq_min.size() + pq_max.size())%2!=0){
				pq_min.add(pq_max.poll());
			}else if(pq_min.peek()>nextNum) {
				pq_max.add(pq_min.poll());
				pq_min.add(pq_max.poll());
			}
			
			System.out.println(pq_min.peek());
			System.out.print(i+"번째 min 배열 : "+pq_min+" | ");
			System.out.print(i+"번째 max 배열 : "+pq_max+"\n");
		}
		
	}

}
