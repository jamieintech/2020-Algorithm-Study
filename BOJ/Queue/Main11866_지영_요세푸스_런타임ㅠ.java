package boj_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main11866_요세푸스 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//전체 수
		int n = sc.nextInt();
		
		//제거될 k번째
		int k = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//n만큼 list에 숫자 넣기
		for (int i=1; i<=n; i++) {
			list.add(i);
		}
		
		//배열이 아니니까 인덱스 1부터 시작할것
		int idx = 1;
		
		System.out.print("<");
		
		while (list.size()>1) {
				
			//그렇다 이터레이터가 있었다
			Iterator<Integer> it = list.iterator();

			while(it.hasNext()) {		//hasNext() : 다음 요소 있으면 true, 없으면 false	 
				int x = it.next();		//next() : 다음 요소 반환
				
				//인덱스가 주어진 값의 배수이면
				if(idx%k==0) {
					it.remove();		//그 요소 컬렉션에서 제거
					System.out.print(x+", ");
				}
				//요소 삭제했으면 1 증가시켜야함 다음 요소 확인해야하니까
				idx++;
			}
		}
		//list에서 하나씩 삭제하다보면 1개밖에 안남았을 때 hasNext로 실행이 안됨
		//그럼 마지막 남은 한개를 출력해야함
		System.out.print(list.get(0));
		System.out.print(">");


	}
	

}
