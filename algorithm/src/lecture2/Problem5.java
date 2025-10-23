package lecture2;

import java.util.Scanner;

// 소수(에라토스테네스 체)
public class Problem5 {
    public int solution(int n) {
        int answer = 0;
        int[] chkNum = new int[n + 1]; // n+1의 길이로 선언해줘야 n까지의 숫자 조회
        // 1. 이중 for문 실패 > 숫자가 커질 경우 시간이 너무 오래 걸림
        // 2. 소수(에라토스테네스 체)

        // 배수를 조회해서 배수가 존재하면 1의 값으로 업데이트
        // 없으면 0

        // 소수 조회(에라토스테네스 체)
        for(int i = 2; i <= n; i++) {
            // i의 배수를 조회
            if(chkNum[i] == 0) {
                answer++;
                for(int j = i; j <= n; j = j + i) {
                    chkNum[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem5 T = new Problem5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }
}
