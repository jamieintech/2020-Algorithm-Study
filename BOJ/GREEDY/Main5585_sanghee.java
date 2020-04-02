package greedy;

import java.util.Scanner;

public class Main5585_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int price=s.nextInt();
		int change=1000-price;
		
		int count=0;
		count+=change/500;
		change%=500;
		count+=change/100;
		change%=100;
		count+=change/50;
		change%=50;
		count+=change/10;
		change%=10;
		count+=change/5;
		change%=5;
		count+=change;
		
		System.out.println(count);
	}

}
