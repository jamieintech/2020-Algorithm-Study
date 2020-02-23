package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9012_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				Stack<Character> stack = new Stack<Character>();
				String line = br.readLine();
				boolean vps = true;
				for (int j = 0; j < line.length(); j++) {
					char ch = line.charAt(j);
					if (ch == '(')
						stack.push(ch);
					else {
						if (stack.isEmpty()) {
							vps = false;
							break;
						} else
							stack.pop();
					}
				}
				if (!stack.isEmpty())
					vps = false;
				System.out.println(vps ? "YES" : "NO");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
