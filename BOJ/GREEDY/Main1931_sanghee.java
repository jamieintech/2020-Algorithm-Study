package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main1931_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			int meeting[][]=new int[n][2];
			for(int i=0; i<n; i++) {
				String line=br.readLine();
				meeting[i][0]=Integer.parseInt(line.substring(0,line.indexOf(' ')));
				meeting[i][1]=Integer.parseInt(line.substring(line.indexOf(' ')+1));
			}
			Arrays.sort(meeting, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					if(o1[1]==o2[1]) return Integer.compare(o1[0], o2[0]);
					return Integer.compare(o1[1], o2[1]);
				}
			});
			int count=0;
			int time=0;
			for(int i=0; i<n; i++) {
				if(meeting[i][0]>=time) {
					count++;
					time=meeting[i][1];
				}
			}
			System.out.println(count);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
