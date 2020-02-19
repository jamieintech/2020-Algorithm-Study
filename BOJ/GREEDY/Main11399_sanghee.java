package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11399_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int time[]=new int[n];
			String line=br.readLine();
			StringTokenizer st=new StringTokenizer(line," ");
			for(int i=0; i<n; i++) {
				time[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(time);
			int sum=time[0];
			for(int i=1; i<n; i++) {
				time[i]=time[i-1]+time[i];
				sum+=time[i];
			}
			System.out.println(sum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
