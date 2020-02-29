package boj_divideNconquer;

import java.util.Scanner;

public class Main1780_종이의갯수 {

	static int[][] map;
	static int negative = 0;
	static int zero = 0;
	static int positive = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		countNum(N, 0, 0);
		
		System.out.println(negative);
		System.out.println(zero);
		System.out.println(positive);
	}
	
	private static boolean findSameNum(int N, int start, int end) {
		int tmp = map[start][end];
		
		for (int i=start; i<start+N; ++i) {
			for (int j=end; j<end+N; ++j) {
				
				if(tmp == map[i][j]) tmp = map[i][j];
				else return false;
			}
		}
		return true;
	}
	
	private static void countNum(int N, int start, int end) {
		
		if(findSameNum(N, start, end)) {
			if(map[start][end]==0) zero++;
			else if(map[start][end]==-1) negative++;
			else if(map[start][end]==1) positive++;
			return;
		}
		countNum(N/3, start, end);	//1,1
		countNum(N/3, start, end+(N/3));	//1,2
		countNum(N/3, start, end+(N/3*2));	//1,3
		
		countNum(N/3, start+(N/3), end);	//2,1
		countNum(N/3, start+(N/3), end+(N/3));	//2,2
		countNum(N/3, start+(N/3), end+(N/3*2));	//2,3
		
		countNum(N/3, start+(N/3*2), end);	//3,1
		countNum(N/3, start+(N/3*2), end+(N/3));	//3,2
		countNum(N/3, start+(N/3*2), end+(N/3*2));	//3,3
		
		
	}
}
