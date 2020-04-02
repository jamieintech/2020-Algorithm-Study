package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main10610_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3의 배수는 자리수 합도 3의 배수다.....
		
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		int nums[] = new int[n.length()];
		for (int i = 0; i < n.length(); i++) {
			nums[i] = Character.getNumericValue(n.charAt(i));
		}
		Arrays.sort(nums);
		String maxNum = "-1";
		if (nums[0] == 0) {
			int sum = 0;
			StringBuffer sb = new StringBuffer();
			for (int i = n.length() - 1; i >= 0; i--) {
				sb.append(nums[i]);
				sum += nums[i];
			}
			if (sum % 3 == 0)
				maxNum = sb.toString();
		}
		System.out.println(maxNum);

	}

}
