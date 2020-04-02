package dynamicProgramming;

import java.util.Scanner;

public class Main1904_sanghee {

	
	public static int countTile(int n,int[] arr) {
		if(arr[n]!=0) return arr[n];
		if(n==1) return arr[1]=1;
		if(n==2) return arr[2]=2;
		return arr[n]=(countTile(n-1,arr)+countTile(n-2,arr))%15746;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n+1];
		System.out.println(countTile(n,arr));
	}

}
