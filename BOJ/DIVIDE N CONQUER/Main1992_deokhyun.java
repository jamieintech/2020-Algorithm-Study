package Divide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main1992 {
    private static int n, m;
    private static int arr[][];
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
 
        arr = new int[n][n];
 
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = a.charAt(j)-48;
            }
        }
        divide(0, 0, n);
    }
 
    private static boolean check(int row, int col, int n) {
        int std = arr[row][col];
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (std != arr[i][j]) {
                    return false;
                }
            }
        }
        m = std;
        return true;
    }
 
    private static void divide(int row, int col, int n) {
        if (check(row, col, n)) {
            System.out.print(m);
        } else {
            System.out.print("(");
            int s = n / 2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    divide(row + s * i, col + s * j, s);
                }
            }
            System.out.print(")");
        }
    }
}
