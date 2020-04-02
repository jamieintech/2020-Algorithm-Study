package dynamicProgramming;

import java.util.Scanner;

public class Main9095_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		int f[] = new int[11];
		f[1] = 1;
		f[2] = 2;
		f[3] = 4;
		for (int j = 4; j <= 10; j++) {
			if (f[j] == 0)
				f[j] = f[j - 1] + f[j - 2] + f[j - 3];
		}
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			System.out.println(f[n]);
		}

	}

}
