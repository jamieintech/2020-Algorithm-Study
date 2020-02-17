package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11651_sanghee2 {

	public static void merge(int arr[][], int left, int right, int mid) {
		int temp[][]=new int[arr.length][2];
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid && j<=right) {
			if (arr[i][1] > arr[j][1] || arr[i][1] == arr[j][1] && arr[i][0] > arr[j][0]) {
				temp[k][0] = arr[j][0];
				temp[k][1] = arr[j][1];
				j++;
			}else {				
				temp[k][0] = arr[i][0];
				temp[k][1] = arr[i][1];
				i++;
			}
			k++;
		}
		while(i<=mid) {
			temp[k][0] = arr[i][0];
			temp[k][1] = arr[i][1];
			i++;
			k++;
		}
		while(j<=right) {
			temp[k][0] = arr[j][0];
			temp[k][1] = arr[j][1];
			j++;
			k++;
		}
		for(i=left; i<=right; i++) {
			arr[i][0]=temp[i][0];
			arr[i][1]=temp[i][1];
		}
		
	}
	
	public static void mergeSort(int arr[][], int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, right, mid);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int xy[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			String line;
			try {
				line = br.readLine();
				xy[i][0] = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				xy[i][1] = Integer.parseInt(line.substring(line.indexOf(' ')+1));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		mergeSort(xy, 0, n-1);
		
		for (int i = 0; i < n; i++) {
			System.out.print(xy[i][0]+" ");
			System.out.println(xy[i][1]);
		}

	}

}
