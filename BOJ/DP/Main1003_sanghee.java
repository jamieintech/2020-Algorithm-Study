package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1003_sanghee {

	public static void fibonacci(int n, int arr[][]) {
		arr[0][0] = 1;
		if (n >= 1) {
			arr[1][1] = 1;
			for (int i = 2; i <= n; i++) {
				arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
				arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int t = Integer.parseInt(br.readLine());
			int n;
			int arr[][];
			for (int i = 0; i < t; i++) {
				n = Integer.parseInt(br.readLine());
				arr = new int[n + 1][2];
				fibonacci(n, arr);
				bw.write(arr[n][0] + " " + arr[n][1] + "\n");
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
