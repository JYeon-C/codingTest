package level3;

import java.util.Scanner;

// 별을 찍는 문제 1
public class Problem2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
           for(int j = 0; j < i; j++) {
               System.out.print("*");
           }
           System.out.println();
        }
    }
}
