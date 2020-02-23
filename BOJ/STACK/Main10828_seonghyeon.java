package test;

import java.util.Stack;
import java.util.StringTokenizer;
import java.io.*;

public class Main10828_seonghyeon {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Stack<Integer> s = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			str = br.readLine();
			useStack(s, str);
		}
		bw.close();
	}

	private static void useStack(Stack<Integer> s, String str) throws IOException {
		String[] arr = str.split(" ");
		String command = arr[0];
		switch (command) {
		case "push":
			s.push(Integer.parseInt(arr[1]));
			break;

		case "pop":
			if (s.empty()) {
				bw.write(String.valueOf(-1));
			} else {
				bw.write(String.valueOf(s.pop()));
			}
			bw.newLine();
			break;
		case "size":
			bw.write(String.valueOf(s.size()));
			bw.newLine();
			break;
		case "empty":
			if (s.empty()) {
				bw.write(String.valueOf(1));
			} else {
				bw.write(String.valueOf(0));
			}
			bw.newLine();
			break;
		case "top":
			if (s.empty()) {
				bw.write(String.valueOf(-1));
			} else {
				bw.write(String.valueOf(s.peek()));
			}
			bw.newLine();
			break;
		default:
			break;
		}
	}
}
