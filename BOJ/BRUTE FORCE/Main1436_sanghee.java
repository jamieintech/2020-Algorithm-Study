package bruteForce;

import java.util.Scanner;

public class Main1436_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=666; ; i++) {
			int j=i;
			while(j>0) {
				if(j%10==6 && j/10%10==6 && j/100%10==6) {
					count++;
					break;
				}
				j/=10;
			}
			if(count==n) {
				System.out.println(i);
				break;
			}
		}
	}

}
