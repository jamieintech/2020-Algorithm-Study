package Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		LinkedList<Integer> que = new LinkedList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			String b = br.readLine();
			
			String array[]=b.split(" ");

			if (array[0].contains("push")) {	

				que.add(Integer.parseInt(array[1]));

			} else if (array[0].equals("back")) {

				if (que.isEmpty()) {
					bw.write("-1"+"\n");
				} else {
					bw.write(que.getLast()+"\n");

				}
			} else if (array[0].equals("empty")) {
				
				if (que.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}

			else if (array[0].equals("size")) {
				bw.write(que.size()+"\n");
			}

			else if (array[0].equals("pop")) {
				if (que.isEmpty()) {
					bw.write("-1"+"\n");
				} else {
					bw.write(que.removeFirst()+"\n");
				}
			}

			else if (array[0].equals("front")) {

				if (que.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(que.getFirst()+"\n");
				}

			}
		}
		bw.flush();
	}
}