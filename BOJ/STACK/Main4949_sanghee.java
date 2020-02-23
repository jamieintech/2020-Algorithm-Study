package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4949_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		Stack<Character> stack;
		while (true) {
			try {
				stack = new Stack<Character>();
				line = br.readLine();
				if (line.equals("."))
					break;
				boolean flag = true;
				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);
					switch (ch) {
					case '(':
					case '[':
						stack.push(ch);
						break;
					case ')':
						if (stack.isEmpty() || stack.pop() != '(') {
							flag = false;
						}
						break;
					case ']':
						if (stack.isEmpty() || stack.pop() != '[') {
							flag = false;
						}
						break;
					}
					if (!flag)
						break;
				}
				if (!stack.isEmpty())
					flag = false;
				System.out.println(flag?"yes":"no");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
