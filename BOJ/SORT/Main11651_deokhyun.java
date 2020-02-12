package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P11651 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b[][];

		b = new int[a][2];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = input.nextInt();
			}
		}

		Arrays.sort(b, new Comparator<int[]>() {

			@Override
			public int compare(int[] arg0, int[] arg1) {
				// TODO Auto-generated method stub
				if (arg0[1] == arg1[1]) {

					return Integer.compare(arg0[0], arg1[0]);

				}
				return Integer.compare(arg0[1], arg1[1]);
			}
		});

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}
}
