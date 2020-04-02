package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main12865_sanghee2 {
	// dynamic programming

	static int item[][];
	static int knapsack[][];

	public static int knapsack(int n, int weight) {
		if (n == 0 || weight == 0)
			return 0;
		if (knapsack[n][weight] != 0)
			return knapsack[n][weight];

		if(weight<item[n][0]) return knapsack(n - 1, weight);
		return knapsack[n][weight] = Math.max(knapsack(n - 1, weight),
				item[n][1] + knapsack(n - 1, weight - item[n][0]));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			int n = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			int k = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			item = new int[n+1][2]; // 0=w,1=v

			for (int i = 1; i <= n; i++) {
				line = br.readLine();
				item[i][0] = Integer.parseInt(line.substring(0, line.indexOf(" ")));
				item[i][1] = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			}
			knapsack = new int[n+1][k+1];

			System.out.println(knapsack(n, k));

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
