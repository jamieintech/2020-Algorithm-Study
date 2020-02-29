package Day08_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		Stack <Integer> stack = new Stack <Integer> ();
		//max는 맨 위에 들어져 있는 값, temp는 입력받은 값 잠시 담아둘 용도.
		int max = 0, temp =0;
		
		
		for(int i =0; i<n; i++) {
			temp = sc.nextInt();
			
			//예를 들어, temp = 4, max = 0
			if(temp > max) {
				for(int j = max+1; j<=temp; j++) {
						stack.push(j);
						sb.append("+\n");
				}
				//stack에는 1,2,3,4가 담기고, max = 4가 됨, 따라서 if문 탈출
				max = temp;
			
			//stack의 맨 윗값 = 4인데, 입력했던 4값하고 다른 경우 불가능. 같을 경우엔 pop을 하면됨.
			}else if(stack.peek()!=temp) {
				System.out.println("NO");
				return;
			}
			//따라서 pop함
			stack.pop();
			sb.append("-\n");
		}
		//StringBuffer를 쓴 이유는 return 을 만나면 출력이 안되게 하기 위해서.
		//StringBuffer를 안썼더니, 계속해서 -,+연산이 찍히다가, 안될경우 No를 반환해가지고..ㅠㅠ
		//그래서 담아놨다가 정상적으로 반복문 다 돌았을 때, 출력하기 위해 하나하나 담아두었던 것.
		//속도도 덤으로 빠르다고 한다. 개이득.
		System.out.println(sb);
	}
}
