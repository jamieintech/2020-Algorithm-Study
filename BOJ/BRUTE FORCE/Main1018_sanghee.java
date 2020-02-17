package bruteForce;

import java.util.Scanner;

public class Main1018_sanghee {
	
	public static int boardTest(char board[][], int n, int m) {
		boolean chess[][]=new boolean[n][m];
		chess[0][0]=true;
		for (int j=1; j<m; j++) {
			if (!chess[0][j-1] && board[0][j-1] != board[0][j] || chess[0][j-1] && board[0][j-1] == board[0][j]) {
				chess[0][j]=false;
			} else
				chess[0][j]=true;
		}
		
		for (int i=1; i<n; i++) {
			if (!chess[i-1][0] && board[i-1][0] != board[i][0] || chess[i-1][0] && board[i-1][0] == board[i][0]) {
				chess[i][0]=false;
			} else chess[i][0]=true;
			for (int j=1; j<m; j++) {
				if (!chess[i][j-1] && board[i][j-1] != board[i][j] || chess[i][j-1] && board[i][j-1] == board[i][j]) {
					chess[i][j]=false;
				} else
					chess[i][j]=true;
			}
		}
		
		int min = n * m;
		for (int i = 0; i <= n-8; i++) {
			for (int j = 0; j <= m-8; j++) {
				int sum1 = 0;
				int sum2 = 0;
				for(int k=i; k<i+8; k++) {
					for(int l=j; l<j+8; l++) {
						if(!chess[k][l]) sum1++;
						else sum2++;
					}
				}
				int sum=sum1<sum2?sum1:sum2;
				if(min>sum)
					min=sum;
			}
			
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();
		char board[][] = new char[n][m];

		for (int i = 0; i < n; i++) {
			String line = s.next();
			for (int j = 0; j < m; j++) {
				board[i][j] = line.charAt(j);
			}
		}
		
		int min=boardTest(board, n, m);
		
		System.out.println(min);
		
	}

}
