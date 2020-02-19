package greedy;

import java.util.Scanner;

public class Main1541_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		int sum = 0;
		int numStart = 0; // 숫자시작
		int numEnd; // 숫자끝+1(연산자)
		int i;
		for (i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (ch >= '0' && ch <= '9')
				continue;
			numEnd = i;
			int num = Integer.parseInt(line.substring(numStart, numEnd));
			sum += num;
			numStart = numEnd + 1;
			if (ch == '-') {
				i++;
				break;
			}
		}
		if (i == line.length()) {
			sum += Integer.parseInt(line.substring(numStart));
		} else {
			int minus = 0;
			for (; i < line.length(); i++) {
				char ch = line.charAt(i);
				if (ch >= '0' && ch <= '9')
					continue;
				numEnd = i;
				int num = Integer.parseInt(line.substring(numStart, numEnd));
				minus += num;
				numStart = numEnd + 1;
			}
			minus += Integer.parseInt(line.substring(numStart));
			sum -= minus;
		}
		System.out.println(sum);
	}

}
