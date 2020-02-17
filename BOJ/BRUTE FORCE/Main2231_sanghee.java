package bruteForce;

import java.util.Scanner;

public class Main2231_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		for(i=1; i<n; i++) {
			int m=i;
			int sum=m;
			while(m>0) {
				sum+=m%10;
				m/=10;
			}
			if(sum==n)
				break;
		}
		if(i==n) i=0;
		System.out.println(i);
	}

}
