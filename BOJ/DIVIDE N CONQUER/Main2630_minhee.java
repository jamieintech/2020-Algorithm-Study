package Day10_DivideAndConquer;

import java.util.Scanner;

public class Main2630 {
	//1-1. 변수설정
	//paper 종이에 적힌 내용 담을 배열
	//파란색종이 count수, 흰색 종이 count수
	static int paper[][];
	static int blueCount;
	static int whiteCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		paper = new int [n][n];
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		//1-2. 변수 설정
		//n = 가로, 세로 크기
		//divde(n,가로의 첫번째 값, 세로의 첫번째 값)
		divide(n,0,0);
		System.out.println(whiteCount);
		System.out.println(blueCount);
	
	}
	//3. 잘린 종이의 맨 첫번째 값이 그 다음 값과 같으면, 다시 그 다음과 비교
	//만약 계속 같았다면 true 반환
	//중간에 틀렸다면 false 반환
	public static boolean search(int n, int row, int column) {
		int temp = paper[row][column];
		for(int i =row; i<row+n;i++) {
			for(int j =column; j<column+n; j++) {
				if(temp==paper[i][j]) {
					temp = paper[i][j];
				}else {
					return false;
				}
			}
		}
		return true;
	}
	//2. 가로, 세로 돌아다니면서 맞는지 체크할 함수가 필요해서 search를 만듬.(위)
	//4. search 결과가 true일 때, 그 값이 1이라면 파란 종이카운트 증가, 그게 아니면 흰색 종이 카운트 증가.
	//5. search 결과가 false일 때, 다시 나눠서 search하도록 (재귀)함.
	//5-1. 단, 크기는 n/2로 줄었고, 가로의 시작점, 세로의 시작점도 다름. (4개씩 생김)
	public static void divide(int n, int row, int column) {
		if(search(n,row,column)) {
			if(paper[row][column]==1) {
				blueCount++;
			}else {
				whiteCount++;
			}
		}else {
			divide(n/2,row,column);
			divide(n/2,row+n/2,column);
			divide(n/2,row,column+n/2);
			divide(n/2,row+n/2,column+n/2);
		}
	}
	
}
