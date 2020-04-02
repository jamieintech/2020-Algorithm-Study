package dynamicProgramming;

import java.util.Scanner;

public class Main9251_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String seq1 = s.nextLine();
		String seq2 = s.nextLine();
		int lcs[] = new int[seq2.length()];
		for(int i=0; i<seq1.length(); i++) {
			int length=0;
			for(int j=0; j<seq2.length(); j++) {
				if (seq1.charAt(i) == seq2.charAt(j)) {
					if(lcs[j]<length+1) {
						lcs[j]=length+1;
						continue;
					}
				}
				if(lcs[j]>length)
					length=lcs[j];
			}
		}
		int max=0;
		for(int i=0; i<lcs.length; i++) {
			if(max<lcs[i])
				max=lcs[i];
		}
		System.out.println(max);
		
	}

}
