package Dp;

import java.util.Arrays;
import java.util.Scanner;

public class Main11054 {

	//a : 입력 받은 배열 , f : 앞에서 부터 계산하여 길이를 나타내는 배열 , n : 배열의 크기
	static int[] lis(int[] a,int[] f ,int n) {
		
		
		for(int i = 0 ; i<n ; i++) {
			
			f[i]=1;
			
			for(int j = 0; j<=i;j++) {
			
				if(a[i] > a[j] && f[i] < f[j]+1) {
					f[i]=f[j]+1;
					
				}
					
			}
		}
		
		return f;
		
	}
	
	static int[] reverse(int[] a, int[] b, int n) {
		
	for(int i = n-1 ; i>=0 ; i--) {
			
			b[i]=1;
			
			for(int j = n-1; j>=i;j--) {
			
				if(a[i] > a[j] && b[i] < b[j]+1) {
					b[i]=b[j]+1;
					
				}
					
			}
		}
		
		return b;
		
	}
	
	static void car(int[] a, int[]b , int n) {
		
		int max = a[0]+b[0] ;
		
		for(int i = 0 ; i < n-1 ; i++) {
			
			if(max < a[i+1]+b[i+1]) {
				max = a[i+1]+b[i+1];
			}
			
		}
		
		System.out.println(max-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;
		int list[],frontlist[],backlist[];
		
		Scanner input = new Scanner(System.in);
		count = input.nextInt();
		
		list = new int[count];
		frontlist = new int[count];
		backlist = new int[count];
		
		for(int i=0; i<count ; i++) {
			list[i] = input.nextInt();
		}
		
		lis(list,frontlist,count);
		reverse(list,backlist,count);
		car(lis(list,frontlist,count),reverse(list,backlist,count),count);
		
		
		
	}

}
