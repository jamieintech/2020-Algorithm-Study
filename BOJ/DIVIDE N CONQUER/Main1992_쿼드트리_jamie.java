package boj_divideNconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1992_쿼드트리 {

	static int[][] map;
	static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		map = new int[n][n];
		
		for (int i=0; i<n; i++) {
			String input = reader.readLine();
			for (int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(input.substring(j,j+1));
			}
		}
		
		checkColors(n, 0, 0);
		
		for (String str : list) {
			System.out.print(str);
		}
			

	}
	
	private static boolean findSameColor(int n, int start, int end) {
		
		int tmp = map[start][end];
		
		for (int i=start; i<start+n; ++i) {
			for (int j=end; j<end+n; ++j) {
				if (tmp == map[i][j]) tmp = map[i][j];
				else return false;
			}
		}
		return true;
	}
	
	private static void checkColors(int n, int start, int end) {
		
		if (findSameColor(n, start, end) ) {
			if(map[start][end]==0) list.add("0");
			else list.add("1");
			return;
		}
		
		list.add("(");
		
		checkColors(n / 2, start, end);	//왼쪽 위 조각
		checkColors(n / 2, start, end + (n / 2));	//오른쪽 위 조각
		checkColors(n / 2, start + (n / 2), end);	//왼쪽 아래 조각
		checkColors(n / 2, start + (n / 2), end + (n / 2));	//오른쪽 아래 조각
		
		list.add(")");
		
	}

}
