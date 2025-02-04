package level1;

import java.util.Scanner;

// A,B,C 범위가 1~ 10^12이기 때문에 long타입으로 받는다.
public class Problem11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A+B+C);
    }
}
