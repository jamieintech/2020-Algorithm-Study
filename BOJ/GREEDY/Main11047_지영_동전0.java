package boj_greedy;

import java.util.Scanner;

public class Main11047_동전0 {

	public static void main(String[] args) {
		
		/*
		 * 1. 제일 큰 값을 K와 비교해서 K가 더 크면 나눔
		 * 2. 나눈 값은 동전의 갯수가 됨
		 * 3. 그 나머지는 다음 돈이 됨
		 * 
		 */
		 Scanner sc = new Scanner(System.in);
		 
		 int N = sc.nextInt();
		 int K = sc.nextInt();
		 
		 //k보다 큰 동전은 필요없으니 가능한 인덱스 확인할거임
		 int maxAble = 0;
		 
		 int[] coins = new int[N];
		 
		 for (int i=0; i<N; i++) {
			 coins[i] = sc.nextInt();
			 
			 //만약 K가 동전보다 크면
			 if(K >= coins[i]) 
				 //그 동전의 인덱스 킵
				 maxAble = i;
			 
			 //이러면 K보다 큰 애들의 인덱스는 킵 안하게됨
		 }
		 
		 int count = 0;
		 
		 //큰 동전부터 시작하니까 최대 인덱스에서 0까지 줄어들기
		 for(int i=maxAble; i>=0; i--) {
			 
			 //주어진 K원이랑 동전 나누면 그 동전의 갯수가 나옴
			 //i가 줄어들면서 계속해서 count에 갯수가 누적됨
			 count += K / coins[i];
			 
			 //K도 줄어들어야할거아님? 특정 동전 n개만큼 가능하면 그만큼 K도 줄겠지
			 //그래서 그 동전으로 나누고 난 나머지가 K가 되겠지
			 K %= coins[i];
		 }
		 
		 System.out.println(count);

	}

}
