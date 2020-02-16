package Day06_DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Main11054_seonghyeon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int n  = Integer.parseInt(st.nextToken());
		int[] arr = new int[1000];
		
		s = br.readLine();
		st = new StringTokenizer(s);
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		findBitonic(n,arr);
	}

	private static void findBitonic(int n, int[] arr) {
		int[] bigger = new int[1000];
		int[] lesser = new int[1000];
		int[] len = new int[1000];
		bigger[0] = 1;
		for(int i=1;i<n;i++) {
			if(bigger[i] == 0) {
				bigger[i] = 1;
			}
			for(int j =0; j<i; j++) {
				if(arr[i] > arr[j]) {
					if(bigger[i] < bigger[j]+1) {
						bigger[i] = bigger[j]+1;
					}
				}
			}
		}
		
		lesser[n-1] = 1;
		for(int p = n-2; p>=0; p--) {
			if(lesser[p] == 0) {
				lesser[p] = 1;
			}
			for (int q=n-1; q>=p+1;q--) {
				if(arr[p]>arr[q]) {
					if(lesser[p] < lesser[q]+1) {
						lesser[p] = lesser[q] + 1;
					}
				}
			}
		}
		for(int k = 0; k<n; k++) {
			len[k] = bigger[k]+lesser[k]-1;
		}
		maximum(n,len);
	}
	
	private static void maximum(int n, int[] len) {
		int max = -1;
		for(int i=0; i<n; i++) {
			max = (max > len[i] ? max : len[i]);
		}
		System.out.println(max);
	}
}
