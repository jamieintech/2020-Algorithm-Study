package Day06_DynamicProgramming;

import java.util.Scanner;

public class Main11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n+1];
		int dp[] = new int[n+1];
		
		dp[1] =1;
				
		for(int i=1;i<=n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=2; i<=n;i++) {
			dp[i] = 1;
			for(int j=1; j<i;j++) {
				if(arr[i]>arr[j] && dp[i]<=dp[j]) {
					dp[i] = dp[j]+1;
				}else if(arr[i] == arr[j]) {
					dp[i] = dp[j];
				}
			}
		}
		int max = 0;
		for(int i=1;i<=n;i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max); 
	}
}
