package Dp;

import java.util.Scanner;

public class Main1003 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		long[] list = new long[n+1];
		
		list[0]=0;
		list[1]=1;
		
		for(int i = 2 ; i<list.length;i++) {
			list[i] = list[i-2]+list[i-1];
		}
		
		System.out.println(list[n]);
			
		
	}

}
