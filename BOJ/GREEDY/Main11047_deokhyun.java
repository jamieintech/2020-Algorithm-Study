package Greedy;

import java.util.Scanner;

public class Main11047 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int sum = 0;
		
		int[] c = new int[a];
		
		for(int i = 0 ; i<a ; i++) {
			c[i] = 	input.nextInt();
		}
		
		for(int i = a-1 ; i>=0 ;i--) {
			
			if(b>=c[i]) {
				sum = sum+b/c[i];
				b = b % c[i];
			}
//			else if(b==0) {
//				break;
//			}
			
//			System.out.println(c[i]+" "+sum+" "+b);
			
		}
		System.out.println(sum);
	}
	
}
