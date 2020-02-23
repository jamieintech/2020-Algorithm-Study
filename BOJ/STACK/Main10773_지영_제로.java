package boj_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10773_Á¦·Î {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<k; i++) {
			int num = sc.nextInt();
			
			if(num==0) {
				stack.pop();
			} 
			else {
				stack.push(num);
			}
		}
		
		int sum = 0;
		while (stack.size()>0) {
			sum += stack.peek();
			stack.pop();
		}
		System.out.println(sum);

	}

}
