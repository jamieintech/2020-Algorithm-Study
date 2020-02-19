package Greedy;

import java.util.Scanner;

public class Main1541 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] a = input.next().split("-");
		int[] b = new int[a.length];
		
		int sum  =0 ;
		
		for(int i=0 ; i<a.length;i++) {
			
			if(a[i].contains("+")){
				
				String []str = a[i].split("\\+");
				
				System.out.println(str.length);
				
				for(int j = 0 ; j<str.length ;j++) {
					b[i]= b[i]+(Integer.parseInt(str[j]));
				}
				
			}
			else {
				b[i]=Integer.parseInt(a[i]);
			}
			
		}
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
//		int sum = Integer.parseInt(a[0]);
		
//		for(int i =1 ; i<a.length;i++) {
//			sum = sum - Integer.parseInt(a[i]);
//		}
//		
//		System.out.println(sum);
	}
}

