package greedy;

import java.util.Scanner;

public class Main2875_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();

		int p = n + m - k;

		int team = Math.min(n / 2, m);
		if (team * 3 > p)
			team = p / 3;

		System.out.println(team);
	}

}
