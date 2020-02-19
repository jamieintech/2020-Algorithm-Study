package Day07_Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		//BOJ sort(11651 참고)
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) return Integer.compare(o1[0], o2[0]);
				return Integer.compare(o1[1], o2[1]);
			}
		});
		//처음에 end 를 arr[0][1]로 두고 해서 틀렸다.
		//count는 1로 미리 설정한 뒤에 해서 결과값이 count =4로 결과가 출력은 됬지만, BOJ채점이 틀려서  이부분은 확인해서 풀음.
		//end의 경우를 아예 -1로 설정한 뒤에 count를 증가시켜나가는 방법이 맞다고..음... 그렇군..
		//왜냐하면 지금 사례는 1,4 부터 움직였지만, 그 다음 인덱스부터 증가 할 수 도 있자나? 그러니까 이렇게 쓰는게 맞겠군..
		
		int count =0;
		int end = -1;
		
		for(int i=0;i<n;i++) {
			if(end<=arr[i][0]) {
				count++;
				end = arr[i][1];
			}
		}
		System.out.println(count);
	}
}
