package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11053_sanghee {

	public static int findLIS(int arr[], int length[]) {
		for (int i = 0; i < arr.length; i++) {
			length[i] = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i] && length[i] < length[j] + 1) {
					length[i] = length[j] + 1;
				}
			}
		}
		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			if (max < length[i])
				max = length[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			int length[] = new int[n];
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			System.out.println(findLIS(arr, length));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
