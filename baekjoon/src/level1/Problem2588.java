package level1;

import java.util.Scanner;

// 빈 칸에 들어갈 수는?
public class Problem2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C;

        System.out.println(A * (B % 10));
        C = (int)(B * 0.1);
        System.out.println(A * (C % 10));
        C = (int)(B * 0.01);
        System.out.println(A * C);
        System.out.println(A * B);
    }
}
