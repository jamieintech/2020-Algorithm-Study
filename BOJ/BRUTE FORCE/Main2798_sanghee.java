package bruteForce;

import java.util.Scanner;

public class Main2798_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		
		int max=0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int sum=num[i]+num[j]+num[k];
					if(sum<=m && max<sum) max=sum;
				}
			}
		}
		
		System.out.println(max);
	}

}
