package Queue;

import java.util.Scanner;

public class Main10845 {

	public static void main(String[] args) {

		int[] que = new int[10001];
		int a;

		int end = 0;
		int first = 0;

		Scanner input = new Scanner(System.in);

		a = input.nextInt();

		for (int i = 0; i < a; i++) {
			
			String b = input.next();

			int size = end - first;

			if (b.equals("push")) {

				int c = input.nextInt();

				que[end] = c;
				end++;

			} else if (b.equals("back")) {

				if (size == 0) {
					System.out.println("-1");
				} else {
					System.out.println(que[end-1]);

				}
			} else if (b.equals("empty")) {
				if (size == 0) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}

			else if (b.equals("size")) {
				System.out.println(size);
			}

			else if (b.equals("pop")) {
				if (size == 0) {
					System.out.println("-1");
				} else {
					System.out.println(que[first]);
					first++;
				}
			}

			else if (b.equals("front")) {

				if (size == 0) {
					System.out.println("-1");
				} else {
					System.out.println(que[first]);

				}

			}
		}
	}
}