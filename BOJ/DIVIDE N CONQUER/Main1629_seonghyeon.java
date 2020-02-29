package test;

import java.io.*;

public class Main1629_seonghyeon {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] str = s.split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		bw.write(String.valueOf(cal(a,b,c)));
		bw.flush();
		bw.close();
		br.close();
	}

	  private static long cal(long a ,long b ,long c) {

	        if(b == 0)
	            return 1;

	        if(b == 1)
	            return a%c;

	        if(b%2 == 0) {
	            long temp = cal(a,(b)/2,c);
	            return (temp*temp)%c;
	        }
	        else {

	            long temp = cal(a,(b-1),c);
	            return (a * temp) % c;
	        }
	    }
}
