package Day08_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0 ; i<t;i++) {
			Stack<Character> stack = new Stack<Character>();
			boolean vps = true;
			String st = sc.next();
			for(int j=0;j<st.length();j++) {
				char c = st.charAt(j);
				if(c == '(') {
					stack.push(c);
				}else if(c==')'){
					if(!stack.isEmpty()) {
						stack.pop();
					}else {
						vps = false;
						break;
					}
				}
			}
			
			if(vps==true && stack.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}	
		sc.close();
	}
}
