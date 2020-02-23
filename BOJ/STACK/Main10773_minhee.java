package Day08_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10773 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			if (num != 0) {
				stack.push(num);
			} else {
				stack.pop();
			}
		}

		int size=stack.size();
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum +=  stack.pop();
		}
		System.out.println(sum);
	}

}
