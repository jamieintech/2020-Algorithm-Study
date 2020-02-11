package Day03_BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Test1436 {
//	//내가 푼거
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int array[] = new int[10000];
//		
//		for(int i = 0 ; i<n; i++) {
//			array[i] = 666 + i * 1000;
//		}
//		System.out.println(array[n-1]);
//	}

//아래가 통과한 답
//1. BufferdeReader를 써야, compile 에러가 안난다.

class Test1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int num = 0;
 
        while(N > 0) {
            num++;
            String str = Integer.toString(num);   // int to string 형변환
 
            if(str.contains("666")) 
                N--;
        }
 
        System.out.println(num);
    }
}
