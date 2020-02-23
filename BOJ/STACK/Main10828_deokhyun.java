package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10828 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int a = input.nextInt();
		String b ;
		
		for(int i = 0 ; i <a;i++) {
			
			b = input.next();
			
			if(b.contains("push")) {
				int c = input.nextInt();
				stack.push(c);
			}
			else if(b.equals("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());
			}
			else if(b.equals("size")) {
				System.out.println(stack.size());
			}
			else if(b.equals("empty")) {
				System.out.println(stack.isEmpty()?1:0);
			}
			else if(b.equals("pop")) {
				System.out.println(stack.isEmpty()?-1:stack.pop());
			}
		}
		
	}

}
