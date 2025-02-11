package level5;

import java.util.Scanner;

public class Problem2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String reverseA = "";
        String reverseB = "";

        // 문자열 뒤집기
        for(int i = A.length() - 1; i >= 0; i--) {
            reverseA += A.charAt(i);
            reverseB += B.charAt(i);
        }

        // 비교를 위해 숫자로 변환
        int resultA = Integer.parseInt(reverseA);
        int resultB = Integer.parseInt(reverseB);

        // 출력
        if(resultA > resultB) {
            System.out.println(resultA);
        } else {
            System.out.println(resultB);
        }
    }
}
