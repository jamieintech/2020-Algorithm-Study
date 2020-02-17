package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1149_sanghee {
	public static int getMinCostOfPaintingHouse(int costs[][], int minCost[][], int index, int pastColor) {
		if (index == costs.length)
			return 0;

		int min = 1000000;
		if (pastColor != 0) {
			if (minCost[index][0] == 0)
				minCost[index][0] = getMinCostOfPaintingHouse(costs, minCost, index + 1, 0) + costs[index][0];
			if (min > minCost[index][0])
				min = minCost[index][0];
		}
		if (pastColor != 1) {
			if (minCost[index][1] == 0)
				minCost[index][1] = getMinCostOfPaintingHouse(costs, minCost, index + 1, 1) + costs[index][1];
			if (min > minCost[index][1])
				min = minCost[index][1];
		}
		if (pastColor != 2) {
			if (minCost[index][2] == 0)
				minCost[index][2] = getMinCostOfPaintingHouse(costs, minCost, index + 1, 2) + costs[index][2];
			if (min > minCost[index][2])
				min = minCost[index][2];
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int costs[][] = new int[n][3];
			int minCost[][] = new int[n][3];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				costs[i][0] = Integer.parseInt(st.nextToken());
				costs[i][1] = Integer.parseInt(st.nextToken());
				costs[i][2] = Integer.parseInt(st.nextToken());
			}
			System.out.println(getMinCostOfPaintingHouse(costs, minCost, 0, -1));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
