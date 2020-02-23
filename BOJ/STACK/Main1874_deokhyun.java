package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main1874 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int a = input.nextInt();
		List<Character> test = new ArrayList<Character>();

		int[] b = new int[a];
		int m = 0;

		for (int i = 0; i < a; i++) {
			b[i] = input.nextInt();
		}

		for (int i = 1; i <= a; i++) {

			stack.push(i);
			test.add('+');
			while (!stack.empty() && stack.peek() == b[m]) {
				stack.pop();
				test.add('-');
				m++;
			}

		}

		if (stack.empty()) {
			for (Character s : test) {
				System.out.println(s);
			}
		} else {
			System.out.println("NO");
		}
	}

}
