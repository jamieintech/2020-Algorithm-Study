package Dp;

import java.util.Scanner;

public class Main1932 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] arr;
		arr = new int[n][n];
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				arr[i][j] = input.nextInt();
				}
			}
			
		for(int i = 1 ; i<n ; i++) {
			for(int j = 0 ; j<=i ; j++) {
				if(j==0) {
					arr[i][j] = arr[i][j]+arr[i-1][j];
				}
				else if(j==i) {
					arr[i][j] = arr[i][j] + arr[i-1][j-1];
				}
				else {
				 	arr[i][j] = Math.max(arr[i][j] + arr[i-1][j], arr[i][j] + arr[i-1][j-1]);
				}
			}
		
			
		}

	
		
//배열에 재대로 들어갓는지 확인
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//
//				System.out.print(arr[i][j]+" ");
//
//			}
//			System.out.println();
//		}
		
		for(int i=0 ; i<n ; i++) {
				if(max < arr[n-1][i]) {
					max = arr[n-1][i];
				}
			}
		
		System.out.println(max);
	}
}
