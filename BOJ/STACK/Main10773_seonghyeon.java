package test;

import java.util.Stack;
import java.io.*;
import java.util.StringTokenizer;
public class Main10773_seonghyeon {
	public static void main(String[] args) throws IOException {
		Stack<Integer> s = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int sum=0;
		int k = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<k;i++) {
			String str2 = br.readLine();
			StringTokenizer st2 = new StringTokenizer(str2);
			int num = Integer.parseInt(st2.nextToken());
			if(num == 0) {
				s.pop();
			} else {
				s.push(num);
			}
		}
		while(!s.empty()) {
			sum+=s.pop();
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		br.close();
		bw.close();
 	}
}
