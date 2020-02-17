package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main1181_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String word[]=new String[n];
		for(int i=0; i<n; i++) {
			try {
				word[i]=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Arrays.sort(word, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()==o2.length()) {
					int c=0;
					for(int i=0; i<o1.length(); i++) {				
						c=Character.compare(o1.charAt(i),o2.charAt(i));
						if(c!=0) break;
					}
					return c;
				}
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		String past="";
		for(String w:word) {
			if(!past.equals(w))
				System.out.println(past=w);
		}
		
	}

}
