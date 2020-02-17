package sort;

import java.util.Scanner;

public class Main2750_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			int temp=arr[i];
			int j;
			for(j=i-1; j>=0 && temp<arr[j]; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
