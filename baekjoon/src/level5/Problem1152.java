package level5;

import java.util.Scanner;

// 단어의 개수를 구하는 문제
public class Problem1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        // 빈 문자열인 경우 예외 처리
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] srtList = str.split("\\s+"); // 연속된 공백을 하나로 처리
            System.out.println(srtList.length);
        }
    }
}
