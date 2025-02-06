package level3;

import java.util.Scanner;

// 별을 찍는 문제 2
public class Problem2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = T; i >= 1; i--) {
           for(int j = 1; j <= T; j++) {
               if(j < i) {
                   System.out.print(" ");
               } else {
                   System.out.print("*");
               }
           }
           System.out.println();
        }
    }
}
