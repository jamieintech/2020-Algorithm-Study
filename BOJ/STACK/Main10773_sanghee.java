package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10773_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k;
		try {
			k = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<Integer>();
			int sum = 0;
			for (int i = 0; i < k; i++) {
				int num = Integer.parseInt(br.readLine());
				if (num == 0)
					sum -= stack.pop();
				else {
					stack.push(num);
					sum += num;
				}
			}
			System.out.println(sum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
