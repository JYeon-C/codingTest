package level5;

import java.util.Scanner;

// 정수를 문자열로 입력받는 문제. Python처럼 정수 크기에 제한이 없다면 상관 없으나,
// 예제 3은 일반적인 정수 자료형에 담기에 너무 크다는 점에 주목합시다.
public class Problem11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String str = sc.next();

        int n = Integer.parseInt(N);

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
    }
}
