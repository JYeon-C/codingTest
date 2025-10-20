package lecture1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0; // 일치하는 문자열 개수

        String input1 = in.next(); // 문자열
        String input2 = in.next(); // 문자 > char c = kb.next().charAt(0);

        // 소문자로 치환
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        // 문자열 리스트
        String[] inputs = input1.split("");

        // 일치하는 문자 개수 확인
        // str.charAt(i)
        // for(char x : str.toCharArray()) {if(x == input2) answer++}
        for(int i = 0; i < inputs.length; i++) {
            if(inputs[i].equals(input2)) {
                answer++;
            }
        }
        // 출력
        System.out.println(answer);
    }
}