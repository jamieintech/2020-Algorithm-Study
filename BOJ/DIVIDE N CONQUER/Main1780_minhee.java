package Day10_DivideAndConquer;

import java.util.Scanner;

public class Main1780 {
	static int paper[][];
	static int minusCount;
	static int zeroCount;
	static int plusCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		paper = new int [n][n];
		
		for(int i = 0; i<n;i++ ) {
			for(int j=0; j<n; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		
		divide(n,0,0);
		System.out.println(minusCount);
		System.out.println(zeroCount);
		System.out.println(plusCount);
		
	}
	
	public static void divide(int n,int row, int column) {
		if(search(n,row,column)) {
			if(paper[row][column]==-1) {
				minusCount++;
			}else if(paper[row][column]==0) {
				zeroCount++;
			}else if(paper[row][column]==1) {
				plusCount++;
			}else {
				System.out.println("잘못된 값 입력됨");
			}
		}else {
			divide(n/3,row,column);
			divide(n/3,row+n/3,column);
			divide(n/3,row+n*2/3,column);
			divide(n/3,row,column+n/3);
			divide(n/3,row+n/3,column+n/3);
			divide(n/3,row+n*2/3,column+n/3);
			divide(n/3,row,column+n*2/3);
			divide(n/3,row+n/3,column+n*2/3);
			divide(n/3,row+n*2/3,column+n*2/3);
		}
	}
	
	public static boolean search(int n, int row, int column) {
		int temp = paper[row][column];
		for(int i=row; i<row+n;i++) {
			for(int j =column; j<column+n;j++) {
				if(temp==paper[i][j]) {
					temp = paper[i][j];
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
