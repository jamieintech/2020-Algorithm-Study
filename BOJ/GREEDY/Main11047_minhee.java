package Day07_Greedy;

import java.util.Scanner;

public class Main11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr [] = new int [n];
		int count = 0;
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			if(k/arr[i]<=0) {
				continue;
			}else if(k/arr[i]>0) {
				count += k/arr[i];
				k = k%arr[i]; 
			}
		}
		System.out.println(count);	
	}

}
