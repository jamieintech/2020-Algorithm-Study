package boj_divideNconquer;

import java.util.Scanner;

public class Main2630_색종이 {

	static int[][] map;
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		countColors(n, 0, 0);

		System.out.println(white);
		System.out.println(blue);

	}
	// 한 분할에 모든 색종이가 다 같은 색인지 확인하기
	private static boolean findSameColor(int n, int start, int end) {

		// map[0][0]부터 시작할거임
		int tmp = map[start][end];
		
		//어짜피 start와 end는 0부터 시작할거임 따라서 start+n = n		
		//사실상 0부터 n까지 for문 돌리는거
		for (int i = start; i < start + n; ++i) {
			
			//++i / ++j 인 이유 : map[0][0]과 그 다음인 map[1][1] .. 이 같은지 확인해야하거든		 
			for (int j = end; j < end + n; ++j) {
				
				//i,j=0 일때 map(0,0)이랑 값이 같으면 tmp에 저장
				//그런식으로 증가할 때 계쏙 값이 똑같이 0이면 tmp에 저장
				if (tmp == map[i][j]) tmp = map[i][j];
				
				//근데 하나라도 값이 다르다! 그러면 false
				else return false;
			}
		}
		//tmp에 값이 끝까지 별탈없이 저장됐다 = 모든 색이 같다
		return true;
	}
	
	private static void countColors(int n, int start, int end) {

		// 만약 그 분할에서 색이 모두 같을 때
		if (findSameColor(n, start, end)) {

			// 시작값이 0인데 그 뒤로 값이 다 같으면 다 하얀거
			if (map[start][end] == 0) white++;

			// 0아니면 1밖에 없으니까 파란거
			else blue++;
			
			//white나 blue 결과 리턴해주라
			return;
		}

		// 그 분할에서 모두 같은색이 아니라면 = findSameColor가 false일 때
		countColors(n / 2, start, end);	//왼쪽 위 조각
		countColors(n / 2, start, end + (n / 2));	//오른쪽 위 조각
		countColors(n / 2, start + (n / 2), end);	//왼쪽 아래 조각
		countColors(n / 2, start + (n / 2), end + (n / 2));	//오른쪽 아래 조각

	}

}
