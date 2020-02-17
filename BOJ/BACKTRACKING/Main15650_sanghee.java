package backtracking;

import java.util.Scanner;

public class Main15650_sanghee {

	public static void findSeq(int n, int i, int num[], int j) {
		if(j<num.length && num.length-j<=n-i+1) {
			num[j]=i;
			findSeq(n, i+1, num, j+1);
			findSeq(n, i+1, num, j);
		} else if(j==num.length){
			for(int k:num) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int num[]=new int[m];
		findSeq(n, 1, num, 0);
		
	}

}
