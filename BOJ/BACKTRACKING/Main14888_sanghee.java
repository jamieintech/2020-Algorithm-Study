package backtracking;

import java.util.Scanner;

public class Main14888_sanghee {

	static int max=-1000000000;
	static int min=1000000000;
	public static void findMaxMin(int num[], int plus, int minus, int multiply, int divide, int index, int result) {
			if (index == num.length) {
				if (result > max)
					max = result;
				if(result < min)
					min= result;
				return;
			}
			if (plus != 0) {
				findMaxMin(num, plus - 1, minus, multiply, divide, index + 1, result + num[index]);
			}
			if (minus != 0) {
				findMaxMin(num, plus, minus - 1, multiply, divide, index + 1, result - num[index]);
			}
			if (multiply != 0) {
				findMaxMin(num, plus, minus, multiply - 1, divide, index + 1, result * num[index]);
			}
			if (divide != 0) {
				int temp=0;
				if(result<0) temp = -((-result)/num[index]);
				else temp = result / num[index];
				findMaxMin(num, plus, minus, multiply, divide - 1, index + 1, temp);
			}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		int plus = s.nextInt();
		int minus = s.nextInt();
		int multiply = s.nextInt();
		int divide = s.nextInt();
		findMaxMin(num, plus, minus, multiply, divide, 1, num[0]);
		System.out.println(max);
		System.out.println(min);
	}

}
