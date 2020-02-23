package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Stack {
	private int num[];
	private int top;

	public Stack() {
		num = new int[10];
		top = -1;
	}

	public Stack(int size) {
		super();
		this.num = new int[size];
		top = -1;
	}

	@Override
	public String toString() {
		return "Stack [num=" + Arrays.toString(num) + ", top=" + top + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(num);
		result = prime * result + top;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stack other = (Stack) obj;
		if (!Arrays.equals(num, other.num))
			return false;
		if (top != other.top)
			return false;
		return true;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void push(int n) {
		if (isFull())
			num = Arrays.copyOf(num, num.length + 10);
		num[++top] = n;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return num[top--];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == num.length - 1)
			return true;
		else
			return false;
	}

	public int size() {
		return top + 1;
	}

	public int peek() {
		if (isEmpty())
			return -1;
		return num[top];
	}

}

public class Main10828_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			Stack stack = new Stack();
			for (int i = 0; i < n; i++) {
				String order = br.readLine();
				switch (order) {
				case "pop":
					bw.write(Integer.toString(stack.pop()));
					bw.write("\n");
					break;
				case "size":
					bw.write(Integer.toString(stack.size()));
					bw.write("\n");
					break;
				case "empty":
					bw.write(Integer.toString(stack.isEmpty() ? 1 : 0));
					bw.write("\n");
					break;
				case "top":
					bw.write(Integer.toString(stack.peek()));
					bw.write("\n");
					break;
				default:
					stack.push(Integer.parseInt(order.substring(5)));
					break;
				}
				bw.flush();
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
