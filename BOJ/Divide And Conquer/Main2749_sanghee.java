package divideAndConquer;

import java.util.Scanner;

public class Main2749_sanghee {

	public static long[][] multiplyMatrix(long A[][], long B[][]){
		long C[][]=new long[A.length][B[0].length];
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[0].length; j++) {
				for(int k=0; k<A[0].length; k++) {
					C[i][j]=(C[i][j]+A[i][k]*B[k][j]%1000000)%1000000;
				}
			}
		}
		return C;
	}
	
	public static long[][] fibonacciMultiply(long arr[][], long n){
		if(n==1) return arr;
		long arr2[][]=fibonacciMultiply(arr, n/2);
		arr2=multiplyMatrix(arr2, arr2);
		if(n%2==1) arr2=multiplyMatrix(arr2, arr);
		
		return arr2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		long n = s.nextLong();
		long arr[][]= {{0,1},{1,1}};
		long result[][]=fibonacciMultiply(arr, n);
		System.out.println(result[1][0]);
	}

}
