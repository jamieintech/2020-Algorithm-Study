package boj_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main9012_괄호 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//testcase 갯수 T 입력받기
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			
			//T개의 스택 생성
			Stack<Character> stack = new Stack<Character>();
			
			//들어오는 괄호를 String으로 먼저 받음
			String input = sc.next();
			
			//count를 기준으로 둘거임
			int count = 0;
			
			//input의 길이만큼 for문 돌리기 : index 0 부터 시작하게 됨
			for (int j=0;j<input.length(); j++) {
				
				//각 괄호 1개를 받을거임
				char c = input.charAt(j);
				
				//만약 열린 괄호가 들어오면 그냥 push한다
				if(c=='(') {
					stack.push(c);
				} else {
					
					//닫힌 괄호가 들어왔을 때 stack에 뭐가 있다면(열린괄호가 있다는 뜻) pop실행
					if (!stack.isEmpty()) {
						stack.pop();
					} 
					
					else {
						//stack이 empty하다면 count를 증가시킨다 (닫힌 괄호때문에)
						count++;
					}
				}
			}
			//저과정이 끝났는데 어찌됐뜬 스택에 뭐가 남아있으면 짝이 안맞는거니까 count증가
			if(!stack.isEmpty()) count++;
//			System.out.println(count);

			//count가 0 == 괄호 짝 다 맞음
			if (count==0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
