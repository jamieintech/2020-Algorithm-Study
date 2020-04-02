package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14889_sanghee {

	public static int findMinDiff(int arr[][], boolean selected[], int index, int count) {
		if (count == arr.length / 2 || index - count == arr.length / 2) {
			boolean temp = true;
			if (count == arr.length / 2) {
				temp = false;
			}
			for (int i = index; i < arr.length; i++) {
				selected[i] = temp;
			}

			int start = 0;
			int link = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (selected[i] && selected[j])
						start += arr[i][j] + arr[j][i];
					else if (!selected[i] && !selected[j])
						link += arr[i][j] + arr[j][i];
				}
			}
			return start > link ? start - link : link - start;
		}

		selected[index] = true;
		int diff1 = findMinDiff(arr, selected, index + 1, count + 1);
		selected[index] = false;
		int diff2 = findMinDiff(arr, selected, index + 1, count);
		return diff1 < diff2 ? diff1 : diff2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			boolean selected[] = new boolean[n];
			for (int i = 0; i < n; i++) {
				String line=br.readLine();
				StringTokenizer st=new StringTokenizer(line," ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			System.out.println(findMinDiff(arr, selected, 0, 0));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
