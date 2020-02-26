package Day09_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i =1; i<=n;i++) {
			q.offer(i);
		}
		
		for(int i =0;i<n-1;i++) {
			q.poll();
			q.offer(q.peek());
			q.poll();
		}
		System.out.println(q.peek());
		sc.close();
	}
}

