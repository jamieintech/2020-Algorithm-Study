package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1992_sanghee {

	public static String quadTree(char arr[][], int startRow, int startColumn, int size) {
		boolean flag = true;
		for (int i = startRow; i < startRow+size; i++) {
			for (int j = startColumn; j < startColumn+size; j++) {
				if (arr[i][j] != arr[startRow][startColumn]) {
					flag = false;
					break;
				}
			}
		}
		if(flag) return Character.toString(arr[startRow][startColumn]);
		
		size=size/2;
		StringBuilder sb=new StringBuilder("(");
		sb.append(quadTree(arr,startRow,startColumn,size));
		sb.append(quadTree(arr,startRow,startColumn+size,size));
		sb.append(quadTree(arr,startRow+size,startColumn,size));
		sb.append(quadTree(arr,startRow+size,startColumn+size,size));
		sb.append(")");
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			char arr[][]=new char[n][n];
			for(int i=0; i<n; i++) {
				String line=br.readLine();
				for(int j=0; j<n; j++) {
					arr[i][j]=line.charAt(j);
				}
			}
			System.out.println(quadTree(arr, 0, 0, n));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
