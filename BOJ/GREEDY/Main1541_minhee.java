package Day07_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1541 {

	public static void main(String[] args) throws IOException {
		//괄호 문제(연산시 가장 작은값!!)
		//'-'기호를 기준으로 괄호를 만들어 다음 -를 만나기전까지 모든 +기호를 -연산으로 바꾸기!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1. - 로 나눠서 배열에 담기
		String [] arr1 = br.readLine().split("\\-");
		//System.out.println(Arrays.deepToString(arr1));
		
		//3. 합한 결과를 담기위한 middle (중간결과)
		int middle[] = new int[arr1.length];
		
		//2. + 로 나눠서 배열에 담은 다음에 합하기
		for(int i =0;i<arr1.length;i++) {
			String[] arr2 = arr1[i].split("\\+");
			int sum = 0;
			for(int j=0;j<arr2.length;j++) {
				sum+=Integer.parseInt(arr2[j]);
			}
			middle[i] = sum;
		}
		//4. last 는 최종 결과를 담기위한 변수
		//5. last의 첫번재 값은 무조건 양수, 그 뒤의 값들은 middle (아까 합한 값들)을 음수로 바꾸어서 계산!
		int last = middle[0];
	
		for(int i=1; i<arr1.length;i++) {
			last -= middle[i];
		}
		System.out.println(last);
		//혹시 몰라서 속도 때문에 잠굼..(덕짱이 시간 초과 난대서 buffer로 접근 시작함)
		br.close();
	}

}
