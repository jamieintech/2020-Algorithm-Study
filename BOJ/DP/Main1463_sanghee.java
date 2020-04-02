package dynamicProgramming;

import java.util.Scanner;

public class Main1463_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int f[] = new int[n + 1];

		f[1] = 0;
		if (n >= 2)
			f[2] = 1;
		if (n >= 3)
			f[3] = 1;
		for (int i = 4; i <= n; i++) {
			f[i] = f[i - 1] + 1;
			if (i % 3 != 0) {
				if (i % 2 == 0 && f[i] > f[i / 2] + 1)
					f[i] = f[i / 2] + 1;
			} else if (f[i] > f[i / 3] + 1)
				f[i] = f[i / 3] + 1;
		}
		System.out.println(f[n]);
	}

}
