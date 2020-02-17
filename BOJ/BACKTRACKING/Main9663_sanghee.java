package backtracking;

import java.util.Scanner;

public class Main9663_sanghee {

	public static int findQueensPlace(int queen[], int q, int index, int count) {
		if(promising(queen, index)) {
			index++;
			if(index==queen.length) {
				return count+1;
			} else {
				for(int i=0; i<queen.length; i++) {
					queen[index]=i;
					count=findQueensPlace(queen, i, index, count);
				}
			}
		}
		return count;
	}
	
	public static boolean promising(int queen[], int index) {
		for(int i=0; i<index; i++) {			
			if(queen[i]==queen[index] || Math.abs(queen[i]-queen[index])==index-i) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int queen[]=new int[n];
		System.out.println(findQueensPlace(queen, 0, -1, 0));
	}

}
