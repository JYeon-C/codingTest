package lecture1;

import java.util.Scanner;

// 팰린드롬(replaceAll 정규식 이용)
public class Problem8 {
    public String solution(String str) {
        String answer = "NO";
        str = str.replaceAll("[^a-zA-Z]", "").trim(); // 알파벳 외 문자 처리
        str = str.toLowerCase(); // 소문자 치환

        // 뒤집은 문자열
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        // 같은지 확인
        if(sb.toString().equals(str)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem8 main = new Problem8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
