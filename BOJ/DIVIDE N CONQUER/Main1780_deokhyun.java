package Divide;

import java.util.Scanner;

public class Main1780 {

	static Scanner input = new Scanner(System.in);
	static int N, M;
	static int[][] arr;
	static int mcount,count,pcount;

	public static void main(String[] args) {

		N = input.nextInt();
		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		divide(0, 0, N);
		
		System.out.println(mcount);
		System.out.println(count);
		System.out.println(pcount);

	}

	private static boolean check(int row, int col, int N) {

		int chk = arr[row][col];
		for (int i = row; i < row + N; i++) {
			for (int j = col; j < col + N; j++) {
				if (chk != arr[i][j]) {
					
					return false;
				}
			}
		}
		M = chk;
		return true;
	}
	
	private static void divide(int row, int col, int N) {
		
		if(check(row, col, N)) {
			if(M==1) {
				pcount++;
			}
			else if(M==0){
				count++;
			}
			else if(M==-1) {
				mcount++;
			}
		}
		else {
	            int s = N / 3;
	            for (int i = 0; i < 3; i++) {
	                for (int j = 0; j < 3; j++) {
	                    divide(row + s * i, col + s * j, s);
	                }
	            }
		}
		
	}

}
