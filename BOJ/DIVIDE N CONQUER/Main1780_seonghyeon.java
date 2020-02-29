package test;

import java.io.*;
import java.util.StringTokenizer;

public class Main1780_seonghyeon {
	static int[] ans = { 0, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);

		int n = Integer.parseInt(st.nextToken());
		int paper[][] = new int[n][n];
		String line[];
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			line = s.split(" ");
			for (int j = 0; j < n; j++) {
				paper[i][j] = Integer.parseInt(line[j]);
			}
		}
		findAns(0, n, 0, n, paper);
		for (int k = 0; k < ans.length; k++) {
			bw.write(ans[k] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static void findAns(float xStart, float xEnd, float yStart, float yEnd, int[][] paper) {
		int std = paper[(int) xStart][(int) yStart];

		for (int i = (int) xStart; i < xEnd; i++) {
			for (int j = (int) yStart; j < yEnd; j++) {
				if (std != paper[i][j]) {

					findAns(xStart, xStart + ((xEnd - xStart) / 3), yStart, yStart + ((yEnd - yStart) / 3), paper);
					findAns(xStart + ((xEnd - xStart) / 3), xStart + (2 * (xEnd - xStart) / 3), yStart,
							yStart + ((yEnd - yStart) / 3), paper);
					findAns(xStart + (2 * (xEnd - xStart) / 3), xEnd, yStart, yStart + ((yEnd - yStart) / 3), paper);

					findAns(xStart, xStart + ((xEnd - xStart) / 3), yStart + ((yEnd - yStart) / 3),
							yStart + (2 * (yEnd - yStart) / 3), paper);
					findAns(xStart + ((xEnd - xStart) / 3), xStart + (2 * (xEnd - xStart) / 3),
							yStart + ((yEnd - yStart) / 3), yStart + (2 * (yEnd - yStart) / 3), paper);
					findAns(xStart + (2 * (xEnd - xStart) / 3), xEnd, yStart + ((yEnd - yStart) / 3),
							yStart + (2 * (yEnd - yStart) / 3), paper);

					findAns(xStart, xStart + ((xEnd - xStart) / 3), yStart + (2 * (yEnd - yStart) / 3), yEnd, paper);
					findAns(xStart + ((xEnd - xStart) / 3), xStart + (2 * (xEnd - xStart) / 3),
							yStart + (2 * (yEnd - yStart) / 3), yEnd, paper);
					findAns(xStart + (2 * (xEnd - xStart) / 3), xEnd, yStart + (2 * (yEnd - yStart) / 3), yEnd, paper);

					return;
				}
			}
		}
		
		if (std == -1) {
			ans[0]++;
		} else if (std == 0) {
			ans[1]++;
		} else if (std == 1) {
			ans[2]++;
		}
	}
}
