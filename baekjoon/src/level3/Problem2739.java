package level3;

import java.util.Scanner;

// 구구단을 출력하는 문제
public class Problem2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
