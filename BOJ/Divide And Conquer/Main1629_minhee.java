package Day10_DivideAndConquer;

import java.util.Scanner;

public class Main1629 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		//multiple(a%c,b,c);
		// 반복문 10을 11번 넣었더니, long 타입 넘어감..
		System.out.println(multiple(a%c,b,c));
		Math.pow(a, b);
	}

	private static long multiple(long a, long b, long c) {
		if(b==1) return a;
		if(b==0) return 1;
		long temp = multiple(a,b/2,c) %c;
		
		if(b%2==0) {
			return temp * temp % c;
		}else {
			return ((temp * temp % c) *a) %c; 
		}
	}

}
