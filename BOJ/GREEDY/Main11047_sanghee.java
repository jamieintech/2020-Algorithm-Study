package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11047_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String line=br.readLine();
			int n=Integer.parseInt(line.substring(0,line.indexOf(' ')));
			int k=Integer.parseInt(line.substring(line.indexOf(' ')+1));
			int a[]=new int[n];
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(br.readLine());
			}
			
			int count=0;
			for(int i=n-1; i>=0; i--) {
				count+=k/a[i];
				k=k%a[i];
				if(k==0) break;
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
