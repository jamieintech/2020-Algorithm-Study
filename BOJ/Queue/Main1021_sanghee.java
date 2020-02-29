package queueAndDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1021_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		String line;
		try {
			line = br.readLine();
			int n=Integer.parseInt(line.substring(0,line.indexOf(" ")));
			int m=Integer.parseInt(line.substring(line.indexOf(" ")+1));
			int num[]=new int[m];
			StringTokenizer st=new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<m; i++) {
				num[i]=Integer.parseInt(st.nextToken());
			}
			for(int i=1; i<=n; i++) {
				list.add(i);
			}
			int count=0;
			for(int i=0; i<m; i++) {
				int temp=list.removeFirst();
				int min=0;
				while(temp!=num[i]) {
					list.offerLast(temp);
					min++;
					temp=list.remove();
				}
				if(min>list.size()+1-min)
					min=list.size()+1-min;
				count+=min;
			}
			System.out.println(count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
