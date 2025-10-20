package lecture1;

import java.util.Scanner;
import java.util.Stack;

// 특정 문자 뒤집기
public class Problem5 {
    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder(str);
        String temp = sb.toString().replaceAll("[^a-zA-Z]", ""); // 공백으로 특수문자 치환
        Stack stack = new Stack();

        // Stack에 문자열 값만 저장
        for(int i = 0; i < temp.length(); i++) {
            stack.push(temp.charAt(i));
        }

        // 특수문자인 경우 원래의 문자, 아닌 경우 뒤집힌 문자 붙임
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isAlphabetic(str.charAt(i))) { // 특수문자
                answer += str.charAt(i);
            } else { // 알파벳
                answer += stack.pop().toString();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem5 main = new Problem5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
