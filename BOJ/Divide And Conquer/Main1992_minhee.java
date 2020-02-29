package Day10_DivideAndConquer;

import java.util.Scanner;

public class Main1992 {
	static char paper[][];
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		paper = new char [n][n];
		
		for(int i = 0; i<n;i++ ) {
			//nextInt()로 하면, 한줄 한줄 전체 숫자로 받아서, char로 해서 한글자 한글자 받음
			paper[i] = sc.next().toCharArray();
		}
		divide(n,0,0);
	}
	
	public static void divide(int n, int row, int column) {
		if(search(n,row,column)) {
			System.out.print(paper[row][column]);
		}else {
			System.out.print("(");
			divide(n/2,row,column);
			divide(n/2,row,column+n/2);
			divide(n/2,row+n/2,column);
			divide(n/2,row+n/2,column+n/2);
			System.out.print(")");
			
		}
	}
	public static boolean search(int n, int row, int column) {
		int temp = paper[row][column];
		for(int i =row; i<row+ n;i++) {
			for(int j =column; j<column+n;j++) {
				if(temp ==paper[i][j]) {
					temp = paper[i][j];
				}else {
					return false;
				}
			}
		}
		return true;
	}
	
}
