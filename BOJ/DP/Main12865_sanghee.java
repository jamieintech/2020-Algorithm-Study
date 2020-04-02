package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main12865_sanghee {
	//backtracking - 시간초과

	static int k;
	static Integer item[][];
	static int maxValue = 0;

	public static void knapsack(int index, int totalWeight, int totalValue) {
		if (totalWeight <= k && totalValue > maxValue) {
			maxValue = totalValue;
		}
		if (promising(index, totalWeight, totalValue)) {
				knapsack(index + 1, totalWeight + item[index + 1][0], totalValue + item[index + 1][1]);
				knapsack(index + 1, totalWeight, totalValue);
		}
	}

	public static boolean promising(int index, int totalWeight, int totalValue) {
		if (totalWeight >= k)
			return false;
		double bound = totalValue;
		int i;
		for (i = index + 1; i < item.length && totalWeight + item[i][0] <= k; i++) {
			totalWeight += item[i][0];
			bound += item[i][1];
		}
		if (i < item.length) {
			bound += (double) item[i][1] / item[i][0] * (k - totalWeight);
		}
		return (bound > maxValue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			int n = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			k = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			item = new Integer[n][2]; // 0=w,1=v

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				item[i][0] = Integer.parseInt(line.substring(0, line.indexOf(" ")));
				item[i][1] = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			}
			Arrays.sort(item, new Comparator<Integer[]>() {
				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
//					if(new Double(o2[1])/o2[0]==new Double(o1[1])/o1[0]) return Integer.compare(o1[0], o2[0]);
					return Double.compare(new Double(o2[1]) / o2[0], new Double(o1[1]) / o1[0]);
				}
			});
			
			knapsack(-1, 0, 0);
			System.out.println(maxValue);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
