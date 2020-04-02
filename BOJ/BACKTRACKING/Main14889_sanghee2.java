package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14889_sanghee2 {

	static int min = 10000;

	public static void findMinDiff(int arr[][], boolean selected[], int index, int count, int start, int link) {
		if (index == arr.length) {
			int diff = start > link ? start - link : link - start;
			if (diff < min)
				min = diff;
			return;
		}

		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < index; i++) {
			if (selected[i])
				temp1 += arr[i][index] + arr[index][i];
			else
				temp2 += arr[i][index] + arr[index][i];
		}
		if (count < arr.length / 2) {
			selected[index] = true;
			findMinDiff(arr, selected, index + 1, count + 1, start + temp1, link);
		}
		if (index - count < arr.length / 2) {
			selected[index] = false;
			findMinDiff(arr, selected, index + 1, count, start, link + temp2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			boolean selected[] = new boolean[n];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			findMinDiff(arr, selected, 0, 0, 0, 0);
			System.out.println(min);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
