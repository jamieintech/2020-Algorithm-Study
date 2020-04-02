package dynamicProgramming;

import java.util.Scanner;

public class Main2193_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		long f[] = new long[n + 1];

		f[1] = 1;
		if (n >= 2)
			f[2] = 1;
		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		System.out.println(f[n]);
	}

}
