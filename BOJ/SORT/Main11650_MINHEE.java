package Day04_Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main11650_MINHEE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]xy = new int[n][2];
		
		for(int i =0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		System.out.println();
		Arrays.sort(xy, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0],o2[0]);
			}
		});

		for(int i=0; i<n; i++) {
			System.out.println(xy[i][0]+" "+xy[i][1]);
		}
	}
}
