package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9461_sanghee {

	static long p[]=new long[101];
	public static long getP(int n) {
		if(p[n]!=0) return p[n];
		
		if(n<=3) return p[n]=1;
		else if(n<=5) return p[n]=2;
		return p[n]=getP(n-1)+getP(n-5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int t;
		try {
			t = Integer.parseInt(br.readLine());
			int n[]=new int[t];
			for(int i=0; i<t; i++) {
				n[i]=Integer.parseInt(br.readLine());
			}
			for(int i:n) {
				System.out.println(getP(i));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
