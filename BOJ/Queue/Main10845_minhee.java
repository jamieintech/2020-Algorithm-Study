package Day09_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main10845 {
	public static void main(String[] args) {
		//18258 은 통과 못함... 쉣..
		Scanner sc = new Scanner (System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			String st = sc.next();
			if(st.contains("push")) {
				int num = sc.nextInt();
				q.offer(num);
			}else if(st.equals("pop")) {
				if(q.isEmpty()){
					System.out.println("-1");
				}else {
					System.out.println(q.remove());
				}
			}else if(st.equals("size")) {
				System.out.println(q.size());
			}else if(st.equals("empty")) {
				if(q.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(st.equals("front")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.peek());
				}
			}else if(st.equals("back")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(((LinkedList<Integer>) q).getLast());
				}
			}
		}
	}
}
