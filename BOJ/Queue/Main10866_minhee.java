package Day09_Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for(int i =0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String ans = st.nextToken();
			if(ans.contains("push_back")) {
				dq.addLast(Integer.parseInt(st.nextToken()));
			}else if(ans.contains("push_front")) {
				dq.addFirst(Integer.parseInt(st.nextToken()));
			}else if(ans.equals("front")) {
				if(dq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(dq.peekFirst()+"\n");
				}
			}else if(ans.equals("back")) {
				if(dq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(dq.peekLast()+"\n");
				}
			}else if(ans.equals("size")) {
				bw.write(dq.size()+"\n");
			}else if(ans.equals("empty")) {
				if(dq.isEmpty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}else if(ans.equals("pop_front")){
				if(dq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(dq.removeFirst()+"\n");
				}
			}else if (ans.equals("pop_back")) {
				if(dq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(dq.removeLast()+"\n");
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
		
	}

}
