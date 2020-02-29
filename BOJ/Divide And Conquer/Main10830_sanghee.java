package divideAndConquer;

import java.util.Scanner;

public class Main10830_sanghee {

	public static long[][] multiplyMatrix(long A[][], long B[][]){
		long C[][]=new long[A.length][B[0].length];
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[0].length; j++) {
				for(int k=0; k<A[0].length; k++) {
					C[i][j]=(C[i][j]+A[i][k]*B[k][j]%1000)%1000;
				}
			}
		}
		return C;
	}
	
	public static long[][] severalMultiply(long arr[][], long n){
		if(n==1) return arr;
		long arr2[][]=severalMultiply(arr, n/2);
		arr2=multiplyMatrix(arr2, arr2);
		if(n%2==1) arr2=multiplyMatrix(arr2, arr);
		
		return arr2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long b=s.nextLong();
		long A[][]=new long[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				A[i][j]=s.nextLong();
			}
		}
		long result[][]=severalMultiply(A, b);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(result[i][j]%1000+" ");
			}
			System.out.println();
		}
		
	}

}
