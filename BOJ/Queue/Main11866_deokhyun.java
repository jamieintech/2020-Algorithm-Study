package Queue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main11866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = in.nextInt();
		int K = in.nextInt();
		
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		int[] joArray = new int[N];
		
		for(int i=1; i<=N; i++) {
			numArray.add(i);
		}
		
		int ptr=0;
		int index=0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		
		for(int i=0; i<joArray.length;i++) {
			int max = numArray.size();
			
			ptr=index;
			
			ptr=ptr+(K-1);
			
			index=ptr%max;
			
			
			joArray[i] = numArray.remove(index);
			
			sb.append(joArray[i]+", ");
			
		}
		
		sb.delete(sb.length()-2, sb.length());
		
		sb.append(">");
		
		System.out.println(sb);
		
		
		
		

	}
}
