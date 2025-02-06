package level3;

import java.util.Scanner;

// 영수증 계산
public class Problem25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // 영수증에 적힌 총 금액
        int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류 수

        int sum = 0;
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 구매한 가격
            int b = sc.nextInt(); // 구매한 수

            sum = sum + a * b;
        }

        // 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 금액과 일치하면 Yes, 아니면 No
        if(X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
