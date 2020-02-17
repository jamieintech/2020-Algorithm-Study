package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main10814_sanghee {

	
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
		String member[][]=new String[n][2];
		for(int i=0; i<n; i++) {
			String line;
			try {
				line = br.readLine();
				member[i][0] = line.substring(0, line.indexOf(' '));
				member[i][1] = line.substring(line.indexOf(' ')+1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Arrays.sort(member, new Comparator<String[]>(){

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]),Integer.parseInt(o2[0]));
			}
		});
		for(int i=0; i<n; i++) {
			System.out.println(member[i][0]+" "+member[i][1]);
		}
		
	}

}
