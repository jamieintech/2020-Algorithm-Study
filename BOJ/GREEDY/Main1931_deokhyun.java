package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int max = 0;
		int end = 0;
		
		int[][] arr = new int[a][2]; 
		
		for(int i = 0 ; i<a;i++) {
			arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
 
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for(int i = 0 ; i<a;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]); 
 
		}
		
		System.out.println("                        ");
		
		for(int i = 0 ; i <a;i++) {
			
			if(arr[i][0]>=end) {
				end=arr[i][1];
				max++;
				
				System.out.println(arr[i][0]+" "+arr[i][1]);
			}
			
		}
		System.out.println(max);
		
	}

}
