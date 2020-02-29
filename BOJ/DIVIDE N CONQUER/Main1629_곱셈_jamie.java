package boj_divideNconquer;

import java.util.Scanner;

public class Main1629_°ö¼À {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A  = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		System.out.println(pow(A,B,C));

	}
	private static long pow(int A, int B, int C) {
		/*
		 * Â¦¼ö: 2^8 = 2^4 * 2^4 
		 * ==>> 2^n = 2^(n/2) * 2^(n/2)
		 * 
		 * È¦¼ö : 2^15 = 2^7 * 2^7 * 2^1
		 * ==>> 2^k = 2^(k/2) * 2^(k/2) * 2^(k%2)
		 * 
		 * 
		 */
		if (B==0) return 1;
		
		long n = pow(A, B/2, C);
		long tmp = n * n % C;
		
		
		if (B%2==0) return tmp;
		
		else return A * tmp % C;

	}

}
