package dynamicProgramming;

import java.util.Scanner;

public class Main2748_sanghee {

	public static long fibonacci(int n) {
		long arr[]=new long[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2; i<=n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fibonacci(n));
	}

}
