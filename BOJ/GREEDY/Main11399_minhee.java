package Day07_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int [n];
		
		for(int i =0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum[] = new int [n];
		int result=0;
		for(int i= 0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				sum[i] += arr[j];
			}
			result += sum[i];
		}
		System.out.println(result);
	}
}
