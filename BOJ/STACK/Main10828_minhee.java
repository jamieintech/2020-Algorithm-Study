package Day08_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack <Integer> stack = new Stack<Integer>();
		
		for(int i =0; i<n ;i++) {
			String st = sc.next();
			if(st.contains("push")) {
				int num = sc.nextInt();
				stack.push(num);
			}else if(st.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}else if(st.equals("size")) {
				System.out.println(stack.size());
			}else if(st.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(st.equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				}
			}
		}
	}
}


/*
class StackTest{
	int top;
	int [] stack;
	int size;

	public StackTest(int size) {
		top = -1;
		stack = new int [size];
		size = this.size;
	}
	
	public void push(int x) {
		stack[top++] = x;
	}
	
	public int pop() {
		return stack[--top];
	}
	
	public int peek() {
		return stack[top];
	}
	
	public int size() {
		return stack.length;
	}
}
 */