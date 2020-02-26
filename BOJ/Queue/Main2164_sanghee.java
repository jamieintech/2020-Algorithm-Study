package queueAndDeque;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2164_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) list.add(i);
		while(list.size()>1) {
			list.remove();
			list.add(list.remove());
		}
		System.out.println(list.remove());
	}

}
