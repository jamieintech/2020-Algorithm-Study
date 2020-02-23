package Day08_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		
		while(true) {
			boolean vps = true;
			String st= br.readLine();
			if(st.equals(".")) {
				bw.flush();
				bw.close();
				return;
			}
			Stack <Character> stack = new Stack<Character>();
			for(int i =0; i<st.length();i++) {
				char c = st.charAt(i);
				if(c == '(' || c=='[') {
					stack.push(c);
				}else if(c==')' ) {
					if(stack.isEmpty()) {
						vps = false;
						break;
					}else if(stack.peek() =='('){
						stack.pop();
					}
				}else if(c==']') {
					if(stack.isEmpty()) {
						vps = false;
						break;
					}else if(stack.peek() =='['){
						stack.pop();
					}
				}
			}
			
			if(stack.isEmpty() && vps == true) {
				bw.write("yes\n");
			}else {
				bw.write("no\n");
			}
	
		}
			
		}
		
	}
