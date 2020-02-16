package Day06_DynamicProgramming;

import java.util.Scanner;

public class Main1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[][] = new int [n+1][n+1];
		int max = 0;
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				d[i][j] = sc.nextInt();
				if(j==1) {
					d[i][j] = d[i-1][j] + d[i][j];
				}else if(j==i) {
					d[i][j]= d[i-1][j-1]+ d[i][i];
				}else {
					d[i][j]=Math.max(d[i-1][j-1], d[i-1][j]) +d[i][j];
				}
				if(max<d[i][j]) {
					max = d[i][j];
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

}
