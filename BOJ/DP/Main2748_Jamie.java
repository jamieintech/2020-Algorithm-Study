package boj_DP;

import java.util.Scanner;

public class Main2748_피보나치합 {

	public static void main(String[] args) {
			
		//1003 문제랑 굉장히 비슷하지만 이건 합만 구하기 때문에 1만 카운트 하면 된다
		//즉, 0 1 따로 카운트 할 필요없이 1차원 배열에서 끝날 수 있다는 것
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//피보나치 수 결과가 점점 커져서 나중에는 int 단위를 넘더라
		//그래서 long으로 배열을 만들어야하더라
		long[] arr = new long[n+1];
		//[n+1] : 10 들어오면 0~10 다 돌아야하니까 n+1개 크기로 만들어야함

		//피보나치로 합 구하기전에, f(0)하고 f(1)값을 줘야 더해질때 포함된다
		arr[0] = 0;
		arr[1] = 1;
			
		//0,1은 값이 정해져있으니 2부터 돌고, 최대는 배열 길이까지 돌면 된다
		for (int j=2; j<arr.length; j++) {
			arr[j] = arr[j-1] + arr[j-2];
		}

		System.out.println(arr[n]);
		sc.close();
	}
}
