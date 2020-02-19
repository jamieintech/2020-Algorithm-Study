package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int[] b = new int[a];

		int sum=0;
		
		for(int i = 0 ; i<a ; i++) {
			
			b[i] = input.nextInt();
			
		}
		
//		for(int i = 0 ;i<a;i++) {
//			System.out.print(b[i]+" ");
//		}
//		
		Arrays.sort(b);
		
		
		sum = b[0];
		
//		System.out.println();
//
//		for(int i = 0 ;i<a;i++) {
//			System.out.print(b[i]+" ");
//		}
//		
		for(int i = 1 ; i <a ;i++) {
			
			b[i] = b[i] + b[i-1];
			
			sum = sum + b[i];
			
		}
		
		
		
		System.out.println(sum);
		
	}

}
