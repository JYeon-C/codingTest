package lecture1;

import java.util.Scanner;

// 회문문자열
public class Problem7 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toLowerCase(); // 문자열을 소문자로 치환

        StringBuilder sb = new StringBuilder(str);
        sb.reverse(); // 문자열 뒤집기

        if(sb.toString().equals(str)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem7 main = new Problem7();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
