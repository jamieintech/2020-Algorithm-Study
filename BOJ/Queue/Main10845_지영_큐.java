package boj_queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Main10845_큐 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		//Queue<Integer> q = new LinkedList<>();
		
		LinkedList<Integer> q = new LinkedList<>();
		
		for (int i=0;i<N;i++) {
			//입력받을 명령문
			String line = sc.nextLine();
			
			//명령문을 배열에 받을거다
			String[] s = line.split(" ");
			
			//split하면 0,1 인덱스 두개로 나뉘겠지? 0번째 인덱스가 무조건 명령문이다
			String cmd = s[0];
			
			//back때
			int last = 0;

			switch(cmd) {
			case "push":
				int num = Integer.parseInt(s[1]);
				last = num;
				q.add(num);
				break;
			
			case "pop":
				if(q.isEmpty()) 
					System.out.println(-1);
				else
					System.out.println(q.poll());
				break;
				
			case "size":
				int size = q.size();
				System.out.println(size);
				break;
			
			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			
			case "front":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.peek());
				break;
			
			case "back":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.getLast());
				break;
			}
		}
		
		
	}

}
