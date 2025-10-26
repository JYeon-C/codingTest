package lecture2;

import java.util.Scanner;

// 뒤집은 소수
public class Problem6 {
    public boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void solution(int n) {
        int num = n; // 반복문에서 사용될 숫자
        int res = 0; // 뒤집힌 숫자

        while(num > 0) {
            int tmp = num % 10; // 나머지
            res = res * 10 + tmp;
            num = num / 10;
        }

        if(isPrime(res)) {
            System.out.print(res + " ");
        };
    }

    public static void main(String[] args) {
        Problem6 T = new Problem6();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // N 개의 소수 입력
        for(int i = 1; i <= N; i++) {
            int tmp = sc.nextInt();

            T.solution(tmp);
        }
    }
}
