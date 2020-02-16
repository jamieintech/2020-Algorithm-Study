package boj_DP;

import java.util.Scanner;

public class Main1003_피보나치 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//testcase의 갯수 T
		int T = sc.nextInt();		
		
		for (int i=0; i<T; i++) {
			
			//n = 실제 들어온 값
			int n = sc.nextInt();
			
			//2차원 배열
			int[][] arr = new int[n+1][2];
			//					 [n+1] 	  : 3 들어오면 0,1,2,3까지 다 돌아야하니까
			//						  [2] : 0, 1 각자 count해줄거다
			
			//n=0 일 때
			if(n==0) {
				System.out.println("1 0");
				continue;
			}
			//n=1 일 때
			if(n==1) {
				System.out.println("0 1");
				continue;
			}

			/*
			 * ex)
			 * 		f(2) = f(1)+f(0)
			 * 			 = 1 + 0		<-- 여기서 1이랑 0 한번씩 일어난 거니까 count해주려면 f(1)이랑 f(0)에 값 넣어줘야함
			 */
			arr[0][0] = 1;
			arr[1][1] = 1;
			
			// 이제 f(2)부터 피보나치대로 돌거임
			// f(n) = f(n-1)+f(n-2)
			for (int j=2; j<=n; j++) {
				arr[j][0] = arr[j-1][0] + arr[j-2][0];
				arr[j][1] = arr[j-1][1] + arr[j-2][1];
			}
			
			System.out.println(arr[n][0]+" "+arr[n][1]);
			
		}
		sc.close();
	}
}
