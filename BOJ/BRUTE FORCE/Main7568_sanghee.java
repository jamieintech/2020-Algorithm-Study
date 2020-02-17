package bruteForce;

import java.util.Scanner;

public class Main7568_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int people[][]=new int[n][3];
		for (int i=0; i<n; i++) {
			people[i][0]=s.nextInt();
			people[i][1]=s.nextInt();
			people[i][2]=1;
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++)
				if(people[i][0]>people[j][0]&&people[i][1]>people[j][1])
					people[j][2]++;
				else if(people[i][0]<people[j][0]&&people[i][1]<people[j][1])
					people[i][2]++;
		}
		for(int i=0; i<n; i++) {
			System.out.print(people[i][2]+" ");
		}
		
	}

}
