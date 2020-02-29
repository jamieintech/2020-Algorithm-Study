package Divide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main1629 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		
		
		System.out.println(mul(a,b,c));
		
	}
	
	static long mul(long a,long b,long c){
	

		if(b==0) {
			return 1;
		}
		
		if(b==1) {
			return a%c;
		}
		
		if(b%2==0) {
			long temp = mul(a,b/2,c);
			return (temp*temp)%c;
			
		}
		
		else {
			long temp = mul(a,b-1,c);
			return (a*temp) %c;
		}
		
	}
	
}
