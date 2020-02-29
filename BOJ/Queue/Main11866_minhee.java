package Day09_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int array[] = new int [n];
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 1; i<=n;i++) {
			q.offer(i);
		}
		
		for(int i=0;i<n;i++) {
			for(int j =1;j<k;j++) {
				q.offer(q.poll());
			}
			array[i] = q.poll();
		}
		//StringBuilder로 출력할려다가 배열이 간단해서 배열로 진행.
		System.out.print("<");
		for(int i =0;i<n;i++) {
			if(i<n-1) {
				System.out.print(array[i]+", ");
			}if(i==n-1) {
				System.out.print(array[i]);
			}
		}
		System.out.print(">");
		sc.close();
	}

}

