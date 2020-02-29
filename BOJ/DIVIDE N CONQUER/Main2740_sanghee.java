package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2740_sanghee {

	public static int[][] multiplyMatrix(int A[][], int B[][]) {
		int C[][] = new int[A.length][B[0].length];
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				for (int k = 0; k < A[0].length; k++) {
					C[i][j] = (C[i][j] + A[i][k] * B[k][j] % 1000000) % 1000000;
				}
			}
		}
		return C;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int A[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				st = new StringTokenizer(line, " ");
				for (int j = 0; j < m; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			int B[][] = new int[m][k];
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				st = new StringTokenizer(line, " ");
				for (int j = 0; j < k; j++) {
					B[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int C[][] = multiplyMatrix(A, B);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < k; j++) {
					System.out.print(C[i][j] + " ");
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
