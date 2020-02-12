package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class p2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b[];

		b = new int[a];

		for (int i = 0; i < a; i++) {

			b[i] = input.nextInt();

		}

		for (int i = 0; i < a; i++) {

			for (int j = i + 1; j < a; j++) {
				if (b[i] > b[j]) {
					int tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
				}
			}

		}

		for(int i = 0 ; i<a;i++) {
			System.out.println(b[i]);
		}
	}

}
