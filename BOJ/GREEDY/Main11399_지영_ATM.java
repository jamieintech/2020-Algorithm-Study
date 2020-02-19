package boj_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main1139_ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] time = new int[N];	//입력받을 Pi
		int[] sum = new int[N];		//각 사람마다 걸리는 시간
		
		//각 시간 입력받기
		for (int i=0; i<N; i++) {
			time[i] = sc.nextInt();
		}
//		System.out.println("time[] : " + Arrays.toString(time));
		
		//오름차순으로 정렬
		Arrays.sort(time);
		
//		System.out.println("time sort : " + Arrays.toString(time));
				
		//0번째 인덱스의 값은 그대로니까 대입
		sum[0] = time[0];
		
		//0번째는 값이 있으니 1번째부터 for문 시작
		for (int i=1; i<N; i++) {
			//사람당 걸리는 총 시간은 지난 사람의 시간+내 시간
			sum[i] = time[i]+sum[i-1];
		}
//		System.out.println("sum[] : " + Arrays.toString(sum));
		
		int total = 0;
		for (int i=0; i<N; i++) {
			total += sum[i];
		}
		System.out.println(total);

	}

}
