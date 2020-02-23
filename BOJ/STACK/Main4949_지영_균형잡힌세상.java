package boj_stack;


import java.util.Scanner;
import java.util.Stack;

public class Main4949_±ÕÇüÀâÈù¼¼»ó {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			Stack<String> stack = new Stack<String>();
			
			String input = sc.nextLine();
			
			if (input.equals(".")) break;
			
			String[] s = input.split("");
			
			for (String str : s) {
				if (str.equals("(") || str.equals("[")) stack.push(str);
				
				else if(str.equals(")") && !stack.isEmpty() && stack.peek().equals("(")) stack.pop();
				else if(str.equals("]") && !stack.isEmpty() && stack.peek().equals("[")) stack.pop();
				
				else if(str.equals(")") || str.equals("]")) stack.push(str);
			}
			
			if (stack.empty()) System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
