package backtracking;

import java.util.Scanner;

public class Main14889_sanghee2 {

	public static int findMinDiff(int arr[][], boolean selected[], int index, int count) {
		if (count == arr.length / 2 || index - count == arr.length / 2) {
			int start = 0;
			int link = 0;
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (selected[i] && selected[j])
						start += arr[i][j] + arr[j][i];
					else if (!selected[i] && !selected[j])
						link += arr[i][j] + arr[j][i];
				}
			}
			return start > link ? start - link : link - start;
		}
		selected[index] = true;
		int diff1 = findMinDiff(arr, selected, index + 1, count + 1);
		selected[index] = false;
		int diff2 = findMinDiff(arr, selected, index + 1, count);
		return diff1 < diff2 ? diff1 : diff2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		boolean selected[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		System.out.println(findMinDiff(arr, selected, 0, 0));

	}

}
