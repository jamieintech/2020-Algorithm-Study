package divideAndConquer;

import java.util.Scanner;

public class Main1629_sanghee {

	public static long multiply(int a, int b, int c) {
		if (b == 1)
			return a % c;
		long temp = multiply(a, b / 2, c);
		temp = temp * temp % c;
		if (b % 2 != 0)
			temp = temp * a % c;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(multiply(a, b, c));
	}

}
