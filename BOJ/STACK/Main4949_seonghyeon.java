package test;

import java.util.Scanner;
import java.util.Stack;

public class Main4949_seonghyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.equals(".")) {
				sc.close();
				return;
			}
			System.out.println(isBalacne(str));
		}
	}

	private static String isBalacne(String str) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char index = str.charAt(i);
			if (index == '(' || index == '[') {
				s.push(index);
			} else if (index == ')') {
				if (s.isEmpty() || s.pop() != '(') {
					return "NO";
				}
			} else if (index == ']') {
				if (s.isEmpty() || s.pop() != '[') {
					return "NO";
				}
			}
		}

		if (!s.isEmpty()) {
			return "NO";
		}

		return "YES";
	}

}
