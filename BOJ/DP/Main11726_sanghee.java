package dynamicProgramming;

import java.util.Scanner;

public class Main11726_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int f[] = new int[n + 1];

		f[1] = 1;
		if (n >= 2)
			f[2] = 2;
		for (int i = 3; i <= n; i++) {
			f[i]=(f[i-2]+f[i-1])%10007;
		}
		
		System.out.println(f[n]);
	}

}
