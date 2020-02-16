package Day06_DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class MainTest2748_seonghyeon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		bw.write(String.valueOf(fibonacci(n)));
		bw.flush();
		bw.close();
	}

	private static int fibonacci(int n) {
		int[] arr = new int[91];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++ ) {
			arr[i] = arr[i-1] +arr[i-2];
		}
		return	arr[n];
	}
}
