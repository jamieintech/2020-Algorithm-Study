package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main1427_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String n=s.nextLine();
		int m[]=new int[n.length()];
		for(int i=0; i<n.length(); i++) {
			m[i]=Character.getNumericValue(n.charAt(i));
		}
		Arrays.sort(m);
		for(int i=m.length-1; i>=0; i--) {
			System.out.print(m[i]);
		}
		
	}

}
