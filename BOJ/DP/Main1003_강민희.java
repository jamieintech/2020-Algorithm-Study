package Day06_DynamicProgramming;

import java.util.Scanner;

public class Main1003_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int dp[][] = new int [41][2];
		
		dp[0][0] = 1;
		dp[1][1] = 1;
		
		for(int i=2; i<41;i++) {
			for(int j=0; j<2;j++) {
				dp[i][j] = dp[i-1][j]+dp[i-2][j];
			}
		}
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			System.out.println(dp[n][0]+" "+dp[n][1]);
		}
	}

}
