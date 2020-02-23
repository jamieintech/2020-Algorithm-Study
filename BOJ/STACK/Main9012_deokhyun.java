package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

//		for (int i = 0; i < a; i++) {
//
//			String test = input.next();
//			String[] arr = test.split("");
//			
//			int count = 0;
//
//			for (int j = 0; j < arr.length; j++) {
//
//				if (arr[j].equals("(")) {
//					count = count + 1;
//				} else if (arr[j].equals(")")) {
//					count = count - 1;
//				}
//
//				if (count < 0) {
//					System.out.println("NO");
//					break;
//				}
//
//			}
//			if (count >= 0) {
//				System.out.println(count > 0 ? "NO" : "YES");
//			}
//		}
		for (int i = 0; i < a; i++) {

			String test = input.next();
			String[] arr = test.split("");
			Stack<Character> stack = new Stack<Character>();
			boolean chk=true;
			
			for (int j = 0; j < arr.length; j++) {

				if (arr[j].equals("(")) {
					stack.push('(');
					
				} 
				
				else if (arr[j].equals(")")) {
				
					if(!stack.isEmpty()) {
						stack.pop();
					}
					else {
						chk = false;
						break;
					}
				}

			}
			
			if(!stack.isEmpty()) {
				chk = false;
			}
			
			if(chk) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}
