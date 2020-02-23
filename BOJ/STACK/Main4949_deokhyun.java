package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String test = null;
		
		while (true) {
			Stack<Character> stack = new Stack<Character>();
			test = input.nextLine();
			
			if (test.equals(".")) {
				break;
			}
			
			boolean chk = true;
			
			for(int i = 0 ; i <test.length();i++) {

				char c = test.charAt(i);
				
				if(c=='(' || c=='[') {
					stack.push(c);
				}
				
				else if(c==')') {
					if(!stack.isEmpty()&&stack.pop()=='(') {
						continue;
					}
					else {
						chk = false;
						break;
					}
				}
				
				else if(c==']') {
					if(!stack.isEmpty()&&stack.pop()=='[') {
						continue;
					}
					else {
						chk = false;
						break;
					}
				}
			}

			if(chk&&stack.isEmpty()) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
