package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2579_sanghee {

	public static int getMaxScore(int score[], int index, int maxScore[]) {
		if(maxScore[index]!=0) return maxScore[index];
			
		if(index==0) return maxScore[index]=score[0];
		if(index==1) return maxScore[index]=score[0]+score[1];
		if(index==2) return score[2]+Math.max(score[0], score[1]);
		
		return maxScore[index]=score[index]+Math.max(score[index-1]+getMaxScore(score, index-3, maxScore), getMaxScore(score, index-2, maxScore));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int score[]=new int[n];
			for(int i=0; i<n; i++) {
				score[i]=Integer.parseInt(br.readLine());
			}
			int maxScore[]=new int[n];
			System.out.println(getMaxScore(score, n-1, maxScore));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
