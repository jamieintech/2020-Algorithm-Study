package Day06_DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2748_2 {

	public static void main(String[] args) throws IOException {
		long fibo[] = new long[91];
 		fibo[0] = 0;
		fibo[1] = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=2;i<=n;i++) {
			fibo[i] = fibo[i-2]+fibo[i-1];
		}
		//System.out.println(fibo[n]);
		bw.write(String.valueOf(fibo[n]));
		bw.flush();
		bw.close();
	}
}
