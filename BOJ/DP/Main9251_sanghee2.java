package dynamicProgramming;

import java.util.Scanner;

public class Main9251_sanghee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String seq1 = s.nextLine();
		String seq2 = s.nextLine();
		int lcs[][] = new int[seq1.length() + 1][seq2.length() + 1];
		int max = 0;
		for (int i = 0; i <= seq1.length(); i++) {
			for (int j = 0; j <= seq2.length(); j++) {
				if (i == 0 || j == 0)
					lcs[i][j] = 0;
				else {
					int temp = seq1.charAt(i - 1) == seq2.charAt(j - 1) ? 1 : 0;
					lcs[i][j] = Math.max(lcs[i - 1][j], Math.max(lcs[i][j - 1], lcs[i - 1][j - 1] + temp));
					if (max < lcs[i][j])
						max = lcs[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
