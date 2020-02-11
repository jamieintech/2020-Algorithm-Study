package Day03_BruteForce;

import java.util.Scanner;

public class Test1018_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char [][] Chess = new char[n][m];
		char[][] White = {
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'}
				};
		
		char[][] Black = {
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'}
		};
		
		
		for(int i=0; i<n; i++) {
			String line = sc.next();
			for(int j=0; j<m; j++) {
				Chess[i][j] = line.charAt(j);
			}
		}
		
		int min = n*m;
		for(int y=0; y<n-7;y++) {
			for(int x=0; x<m-7;x++) {
				int whiteCount = 0;
				int blackCount = 0;
				int Exchange = 0;
				
				for(int i=0; i<8;i++) {
					for(int j=0;j<8;j++) {
						if(Chess[y+i][x+j]!=White[i][j]) {
							whiteCount++;
							//System.out.println(whiteCount);
						}
					}
				}
				for(int i=0; i<8;i++) {
					for(int j=0;j<8;j++) {
						if(Chess[y+i][x+j]!=Black[i][j]) {
							blackCount++;
							//System.out.println(blackCount);
						}
					}
				}
				//Exchange = (whiteCount>blackCount)?blackCount:whiteCount;
				Exchange= Math.min(blackCount, whiteCount);
				if(min>Exchange) min = Exchange;
			}
		}
		System.out.println(min);
	}

}
