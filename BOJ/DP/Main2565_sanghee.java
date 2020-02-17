package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main2565_sanghee {

	public static int deleteMinWire(int wire[][]) {
		int length[]=new int[wire.length];
		for(int i=0; i<wire.length; i++) {
			length[i]=1;
			for(int j=i-1; j>=0; j--) {
				if(wire[j][1]<wire[i][1]&&length[j]+1>length[i]) {
					length[i]=length[j]+1;
				}
			}
		}
		int max=0;
		for(int i=0; i<length.length; i++) {
			if(length[i]>max)
				max=length[i];
		}
		return length.length-max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int wire[][] = new int[n][2];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				wire[i][0] = Integer.parseInt(line.substring(0, line.indexOf(" ")));
				wire[i][1] = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			}
			Arrays.sort(wire, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1[0], o2[0]);
				}
			});
			
			System.out.println(deleteMinWire(wire));

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
