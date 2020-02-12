package Sort;
//
//import java.util.Scanner;
//
//public class P11650 {
//
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//
//		int a = input.nextInt();
//
//		int[][] arr;
//
//		arr = new int[a][2];
//
//		for (int i = 0; i < a; i++) {
//			arr[i][0] = input.nextInt();
//			arr[i][1] = input.nextInt();
//		}
//
//		for (int i = 0; i < a - 1; i++) {
//			if (arr[i][0] > arr[i + 1][0]) {
//				int tmp = arr[i][0];
//				int tmp1 = arr[i][1];
//				arr[i][0] = arr[i + 1][0];
//				arr[i][1] = arr[i+1][1];
//				arr[i + 1][0] = tmp;
//				arr[i + 1][1] = tmp1;
//			}
//		}
//		
//		for(int i = 0 ; i <a-1 ;i++) {
//			if(arr[i][0] == arr[i+1][0]) {
//				if(arr[i][1] > arr[i+1][1]) {
//					int tmp = arr[i][1];
//					arr[i][1] = arr[i+1][1];
//					arr[i+1][1] = tmp;
//				}
//			}
//		}
//		
//
//
//
//		for (int i = 0; i < a; i++) {
//
//			System.out.println(arr[i][0] + " " + arr[i][1]);
//		}
//
//	}
//
//}

//////////////////////////////////////
//package Sort;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class P11650 {
//
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//
//		int a = input.nextInt();
//		int b[][];
//
//		b = new int[a][2];
//
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < 2; j++) {
//				b[i][j] = input.nextInt();
//			}
//		}
//
//		Arrays.sort(b, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] arg0, int[] arg1) {
//				// TODO Auto-generated method stub
//				if (arg0[1] == arg1[1]) {
//
//					return Integer.compare(arg0[0], arg1[0]);
//
//				}
//				return Integer.compare(arg0[1], arg1[1]);
//			}
//		});
//
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}
//}

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class P11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt(), d[][] = new int[n][2];
		for (i = 0; i < n; i++) {
			d[i][0] = sc.nextInt();
			d[i][1] = sc.nextInt();
		}
		Arrays.sort(d, new Comparator<int[]>() {
			public int compare(int a[], int b[]) {
				if (a[0] == b[0])
					return Integer.compare(a[1], b[1]);
				else
					return Integer.compare(a[0], b[0]);
			}
		});
		for (i = 0; i < n; i++)
			System.out.println(d[i][0] + " " + d[i][1]);
		sc.close();
	}
}
