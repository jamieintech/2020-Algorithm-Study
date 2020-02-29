package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1780_sanghee {

	static int minusOne;
	static int zero;
	static int plusOne;

	public static void quadTree(int arr[][], int startRow, int startColumn, int size) {
		boolean flag = true;
		for (int i = startRow; i < startRow + size; i++) {
			for (int j = startColumn; j < startColumn + size; j++) {
				if (arr[i][j] != arr[startRow][startColumn]) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			if (arr[startRow][startColumn] == 1)
				plusOne++;
			else if (arr[startRow][startColumn] == -1)
				minusOne++;
			else
				zero++;
			return;
		}

		size = size / 3;
		quadTree(arr, startRow, startColumn, size);
		quadTree(arr, startRow, startColumn + size, size);
		quadTree(arr, startRow, startColumn + 2*size, size);
		quadTree(arr, startRow + size, startColumn, size);
		quadTree(arr, startRow + size, startColumn + size, size);
		quadTree(arr, startRow + size, startColumn + 2*size, size);
		quadTree(arr, startRow + 2*size, startColumn, size);
		quadTree(arr, startRow + 2*size, startColumn + size, size);
		quadTree(arr, startRow + 2*size, startColumn + 2*size, size);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			quadTree(arr, 0, 0, n);
			System.out.println(minusOne);
			System.out.println(zero);
			System.out.println(plusOne);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
