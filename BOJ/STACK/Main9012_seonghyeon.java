package test;

import java.util.Scanner;
import java.util.Stack;

public class Main9012_seonghyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(isVPS(sc.next()));
		}
	}

	private static String isVPS(String str) {
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='(') {
				s.push(String.valueOf(str.charAt(i)));
			} else if(str.charAt(i) == ')') {
				if(s.isEmpty()) {
					return "NO";
				}
				s.pop();
			}
		}
		if(!s.isEmpty()) {
			return "NO";
		}
		return "YES";
	}
}
