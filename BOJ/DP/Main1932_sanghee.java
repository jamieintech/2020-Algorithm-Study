package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932_sanghee {

	public static int findMaxSumPath(int arr[][], int max[][], int r, int c) {
		if(max[r][c]!=-1)
			return max[r][c];
		if(r==arr.length-1) {
			return max[r][c]=arr[r][c];
		}
		int a=findMaxSumPath(arr,max,r+1,c)+arr[r][c];
		int b=findMaxSumPath(arr,max,r+1,c+1)+arr[r][c];
		return max[r][c]=a>b?a:b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int arr[][]=new int[n][n];
			int max[][]=new int[n][n];
			for(int i=0; i<n; i++) {
				String line=br.readLine();
				StringTokenizer st=new StringTokenizer(line," ");
				for(int j=0; j<=i; j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
					max[i][j]=-1;
				}
			}
			System.out.println(findMaxSumPath(arr, max, 0, 0));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
