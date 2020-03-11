package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11279  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int i =0;i<n;i++) {
			int nextNum = sc.nextInt();
			if(nextNum==0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}else if(nextNum>0) {
				pq.add(nextNum);
			}
		}
		
	}
}
