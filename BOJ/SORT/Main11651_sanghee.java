package sort;

import java.util.Scanner;

public class Main11651_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int xy[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			xy[i][0] = s.nextInt();
			xy[i][1] = s.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (xy[min][1] > xy[j][1] || xy[min][1] == xy[j][1] && xy[min][0] > xy[j][0])
					min = j;
			}
			if (min != i) {
				int temp[] = xy[i];
				xy[i] = xy[min];
				xy[min] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(xy[i][0]+" ");
			System.out.println(xy[i][1]);
		}

	}

}
