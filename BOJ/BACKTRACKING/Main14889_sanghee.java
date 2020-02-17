package backtracking;

import java.util.Scanner;

public class Main14889_sanghee {

	public static int findMinDiff(int arr[][], boolean selected[], int index, int start, int link) {
		if (index == arr.length)
			return start > link ? start - link : link - start;
			
		int temp1 = start;
		int temp2 = link;
		for (int j = 0; j < index; j++) {
			if (selected[j])
				temp1 += arr[index][j] + arr[j][index];
			else
				temp2 += arr[index][j] + arr[j][index];
		}
		selected[index] = true;
		int diff1 = findMinDiff(arr, selected, index + 1, temp1, link);
		selected[index] = false;
		int diff2 = findMinDiff(arr, selected, index + 1, start, temp2);
		return diff1<diff2?diff1:diff2;
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

		System.out.println(findMinDiff(arr, selected, 0, 0, 0));

	}

}
