package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		//1. 양수일 경우/ 음수일 경우를 나눈 priorityQueue
		PriorityQueue<Integer> pq_plus = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq_minus = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		//2-1. 둘다 큐가 비어있으면, 0 출력
		//2-2. plus만 비어있는경우/ minus만 비어있는 경우 고려해서 출력
		//2-3. 둘다 안 비어 있는 경우
		//2-3-1. 만약 절댓값의 크기가 같으면, 마이너스 값을 출력 & 제거
		//2-3-2. 안같을 경우
		//2-3-2-1. 각 값을 추출한 절댓값의 크기를 비교해서, minus가 더 크면, plus큐에서 값 제거하고 출력
		//2-3-2-2. 반대의 경우까지 작성.
		
		for (int i =0;i<n;i++) {
			int nextNum = sc.nextInt();
			
			if(nextNum==0) {
				if(pq_plus.isEmpty() && pq_minus.isEmpty()) {
					System.out.println(0);
				}else {
					if (pq_plus.isEmpty()) {
						System.out.println(pq_minus.poll());
					}else if(pq_minus.isEmpty()) {
						System.out.println(pq_plus.poll());
					}else {
						if(Math.abs(pq_plus.peek()) == Math.abs(pq_minus.peek())) {
							System.out.println(pq_minus.poll());
						}else{
							if(Math.abs(pq_plus.peek()) < Math.abs(pq_minus.peek())) {
								System.out.println(pq_plus.poll());
							}else {
								System.out.println(pq_minus.poll());
							}
						}
					}
				}
			}else {
				if (nextNum >0) {
					pq_plus.add(nextNum);
				}else if(nextNum <0) {
					pq_minus.add(nextNum);
				}
			}
		}
		
		
	}

}
