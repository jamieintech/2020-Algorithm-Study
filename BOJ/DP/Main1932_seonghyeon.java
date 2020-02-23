package Day06_DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Main1932_seonghyeon {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int[][] triangle = new int[501][501];
		
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			for( int j = 0; j <= i; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		findWay(n,triangle);
		
		br.close();
	}

	private static void findWay(int n, int[][] triangle) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] sum = new int[501][501];
		sum[0][0] = triangle[0][0];
		int max = 0;
		
		for(int i=1; i<n; i++) {
			for(int j=0;j<=i; j++) {
				if(j == 0 ) {
					sum[i][j] = sum[i-1][j] + triangle[i][j];
				}
				else if(j == i) {
					sum[i][j] = sum[i-1][j-1] + triangle[i][j];
				}
				else {
					sum[i][j] = maximum(sum[i-1][j],sum[i-1][j-1])+triangle[i][j];
				}
			}
		}
		
		for (int x=0; x<n; x++) {
			max = maximum(max, sum[n-1][x]);
		}
		System.out.println(max);
		bw.write(max);
	}

	private static int maximum(int i, int j) {
		return i > j ? i : j ;
	}
}
