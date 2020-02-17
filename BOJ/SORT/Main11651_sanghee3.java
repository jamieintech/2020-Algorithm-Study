package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;



public class Main11651_sanghee3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int xy[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			String line;
			try {
				line = br.readLine();
				xy[i][0] = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				xy[i][1] = Integer.parseInt(line.substring(line.indexOf(' ')+1));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Arrays.sort(xy, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				if(a[1]==b[1]) {
					return Integer.compare(a[0], b[0]);
				}
				else return Integer.compare(a[1], b[1]);
			}
			
		});
		
		for (int i = 0; i < n; i++) {
			System.out.print(xy[i][0]+" ");
			System.out.println(xy[i][1]);
		}

	}

}
