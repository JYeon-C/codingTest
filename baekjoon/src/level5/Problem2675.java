package level5;

import java.util.Scanner;

// 각 문자를 반복하여 출력하는 문제
public class Problem2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String resultStr = "";
        for(int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 입력 문자열

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    resultStr += S.charAt(j);
                }
            }
            System.out.println(resultStr);
            resultStr = "";
        }
    }
}
