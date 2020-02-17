package backtracking;

import java.util.Scanner;

public class Main15649_sanghee {

	public static void findSeq(int n, int x, int num[], int index) {
		if (promising(x, num, index)) {
			if (index == num.length) {
				for (int i : num) {
					System.out.print(i + " ");
				}
				System.out.println();
			} else {				
				for (int i = 1; i <= n; i++) {
					num[index] = i;
					findSeq(n, i, num, index + 1);
				}
			}

		}
	}

	public static boolean promising(int x, int num[], int index) {
		for (int i = 0; i < index-1; i++) {
			if (num[i] == x)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int num[] = new int[m];
		findSeq(n, 1, num, 0);

	}

}
