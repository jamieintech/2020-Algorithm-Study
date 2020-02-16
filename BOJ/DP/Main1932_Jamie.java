package boj_DP;

import java.util.Scanner;

public class Main1932_정삼각형 {

	/*
	 * 각 자리의 값들은 [i,j]로 보면 이해하기 쉽다
	 * 
	 * 				[1,1]
	 * 			[2,1]	[2,2]
	 * 		[3,1]	[3,2]	[3,3]
	 * 	[4,4]	[4,2]	[4,3]	[4,4]
	 * 
	 * 왼쪽 대각선으로 가는 합은 보면 i만 증가하고 j=1
	 * 오른쪽 대각선으로 가는 합은 i=j
	 * 중간에 있는 값들은 Math.max를 통해 더 큰 값만 가지고 가면 된다!
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//처음에 받는 삼각형의 크기
		int n = sc.nextInt();
		
		//2차원 배열 생성
		//처음 삼각형 크기 받고 n+1줄까지 숫자 삼각형 입력함
		int[][] list = new int[n+1][n+1];
		
		//sum 초기값
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				//배열 생성
				list[i][j] = sc.nextInt();
				
				//왼쪽 대각선으로 더해가는 애들은 j값이 1로 고정되어있음
				if (j==1) {
					list[i][j] = list[i-1][j] + list[i][j];
				}
				
				//오른쪽 대각선으로 더해가는 애들은 i==j
				else if (i==j) {
					list[i][j] = list[i-1][j-1] + list[i][j];
				}
				
				//중간에 있는 애들은 더 큰거 비교해서 더해야함
				//Math.max(a,b) --> a랑 b 중 더 큰거 리턴
				else {
					list[i][j] = Math.max(list[i-1][j-1], list[i-1][j]) + list[i][j];
				}
				
				if(list[i][j] > sum)
					sum = list[i][j];
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
