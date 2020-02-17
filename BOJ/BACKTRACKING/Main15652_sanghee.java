package backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15652_sanghee {

	static BufferedWriter bw;
	
	public static void findSeq(int n, int x, int num[], int index) {
			if (index == num.length) {
				for (int i : num) {
					try {
						bw.write(i+" ");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					bw.write("\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {				
				for (int i = x; i <= n; i++) {
					num[index] = i;
					findSeq(n, i, num, index + 1);
				}
			}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line="";
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
		int m = Integer.parseInt(line.substring(line.indexOf(' ')+1));
		int num[] = new int[m];
		findSeq(n, 1, num, 0);
		try {
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
