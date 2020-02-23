package boj_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10828_스택 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//cmd 갯수 입력받는 N
		int N = sc.nextInt();
		
		//N다음에 엔터가 있어서 그걸 인식해줘야함 안그럼 밑에 스택에 넣을거에 엔터가 인식되더라
		sc.nextLine();
		
		//System.out.println();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<N; i++) {
			//입력받을 명령문
			String line = sc.nextLine();
			
			//명령문을 배열에 받을거다
			String[] s = line.split(" ");
			
			//split하면 0,1 인덱스 두개로 나뉘겠지? 0번째 인덱스가 무조건 명령문이다
			String cmd = s[0];
			
			switch (cmd) {
			case "push":
				int num = Integer.parseInt(s[1]);
				stack.push(num);
				break;
			
			case "top":
				if(stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				break;
				
			case "size":
				System.out.println(stack.size());
				break;
			
			case "pop":
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());			
				}
				break;
			
			case "empty":
				if(stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			}

		}
	}

}
