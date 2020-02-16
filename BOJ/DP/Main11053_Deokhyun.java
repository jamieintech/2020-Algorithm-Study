package Dp;

import java.util.Scanner;

public class Main11053 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[] arr = new int[n];
		int[] result = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {

			result[i] = 1;

			for (int j = 0; j <= i; j++) {

				if (arr[i] > arr[j] && result[j] >= result[i]) {
						result[i] = result[j] + 1;
					}

			}

		}

//		for (int i = 0; i < n - 1; i++) {
//			System.out.print(result[i] + " ");
//		}

		for (int i = 0; i < n; i++) {

			if (max < result[i]) {
				max = result[i];
			}
		}
		System.out.println(max);
	}
}
