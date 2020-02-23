package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int sum = 0 ;

		for (int i = 0; i < a; i++) {

			int b = input.nextInt();

			if (b == 0) {
				stack.pop();
			} else {
				stack.push(b);
			}

		}

		for (Integer i : stack) {
			
//			if(stack.size()==0) {
//				continue;
//			}
			sum = sum + i;

		}
		System.out.println(sum);

	}

}
