package level3;

import java.util.Scanner;

// 1부터 N까지의 합을 구하는 문제. 물론 반복문 없이 풀 수도 있습니다.
public class Problem8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n * (n+1) / 2;

        System.out.println(result);
    }
}
