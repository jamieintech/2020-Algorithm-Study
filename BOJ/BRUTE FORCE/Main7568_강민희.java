package Day03_BruteForce;

import java.util.Scanner;

public class Test7568 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int xy [][] = new int[n][2];
		
		int result[] = new int [n]; //순위 결과
		
		for(int x = 0; x< n; x++) {
			result[x] = 1; //초기 모두 1
			for(int y = 0; y<=1; y++) {
				xy[x][y] = scanner.nextInt();
			}
		}
		
		for(int j =0; j<n; j++) {
			for(int i = 0; i< n ;i++) {
				if(xy[j][0] > xy[i][0] && xy[j][1] > xy[i][1]) {
					result[i]++; //도는 값이 해당 값보다 크면 값 증가
				}
			}
		}
		
		for(int i =0; i<n; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
