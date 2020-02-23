package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main1874_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		try {
			int n = Integer.parseInt(br.readLine());
			int seq[] = new int[n];
			for (int i = 0; i < n; i++) {
				seq[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 1, j = 0;; i++) {
				while (!stack.isEmpty() && stack.peek() == seq[j]) {
					stack.pop();
					sb.append("-\n");
					j++;
				}
				if (i > n)
					break;
				stack.push(i);
				sb.append("+\n");;
			}
			if (!stack.isEmpty()) {
				System.out.println("NO");
			}else {
				System.out.println(sb.toString());
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
