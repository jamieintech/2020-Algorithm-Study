package test;

import java.util.Scanner;
import java.util.Stack;

public class Main4949_seonghyeon {
	public static void main(String[] args) {
		int t = 0;
		Scanner sc = new Scanner(System.in);
		while (t == 0) {
			boolean tf= true;
			String str = sc.nextLine();
			if (str.equals(".")) {
				return;
			}
			Stack<Character> s = new Stack<Character>();
			for (int i = 0; i < str.length(); i++) {
				char index = str.charAt(i);
				if (index == '(' || index == '[') {
					s.push(index);
				} else if (index == ')') {
					if (s.isEmpty() || s.pop() != '(') {
//						return "NO";
						tf=false;
						break;
					}
				} else if (index == ']') {
					if (s.isEmpty() || s.pop() != '[') {
//						return "NO";
						tf=false;
						break;
					}
				}
			}
			if (!s.isEmpty()) {
//				return "NO";
				tf=false;
			}
			
//			return "YES";
			if(tf == false) {
				System.out.println("NO");
			}
			else { 
				System.out.println("YES");
			}
//			System.out.println(isBalacne(str));
		}
		sc.close();
	}

//	private static String isBalacne(String str) {
//		Stack<Character> s = new Stack<Character>();
//		for (int i = 0; i < str.length(); i++) {
//			char index = str.charAt(i);
//			if (index == '(' || index == '[') {
//				s.push(index);
//			} else if (index == ')') {
//				if (s.isEmpty() || s.pop() != '(') {
//					return "NO";
//				}
//			} else if (index == ']') {
//				if (s.isEmpty() || s.pop() != '[') {
//					return "NO";
//				}
//			}
//		}
//		
//		if (!s.isEmpty()) {
//			return "NO";
//		}
//		
//		return "YES";
//	}

}
