package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630_sanghee {

	static int white;
	static int blue;

	public static void quadTree(char arr[][], int startRow, int startColumn, int size) {
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
			if (arr[startRow][startColumn] == '1')
				blue++;
			else
				white++;
			return;
		}

		size = size / 2;
		quadTree(arr, startRow, startColumn, size);
		quadTree(arr, startRow, startColumn + size, size);
		quadTree(arr, startRow + size, startColumn, size);
		quadTree(arr, startRow + size, startColumn + size, size);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			char arr[][] = new char[n][n];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				StringTokenizer st=new StringTokenizer(line," ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = st.nextToken().charAt(0);
				}
			}
			quadTree(arr, 0, 0, n);
			System.out.println(white);
			System.out.println(blue);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
