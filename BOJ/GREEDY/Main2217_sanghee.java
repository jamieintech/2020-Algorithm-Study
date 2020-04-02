package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2217_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int rope[] = new int[n];
			for (int i = 0; i < n; i++) {
				rope[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(rope);
			int max = 0;
			for (int i = n - 1, j = 1; i >= 0; i--, j++) {
				if (max < rope[i] * j)
					max = rope[i] * j;
			}
			System.out.println(max);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
