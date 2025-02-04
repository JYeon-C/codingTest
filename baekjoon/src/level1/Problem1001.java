package level1;

import java.util.Scanner;

// 두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제
class Problem1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A-B);
    }
}
