package level1;

import java.util.Scanner;

/*
* 나눗셈 문제
* 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.
* float: 4byte, 약 7자리
* double: 8byte, 약 15~16자리 (조건에 따라 double 사용해야함)
* */
public class Problem1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B;

        A = sc.nextDouble();
        B = sc.nextDouble();

        System.out.println(A/B);
    }
}
