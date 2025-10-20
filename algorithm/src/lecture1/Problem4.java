package lecture1;

import java.util.Scanner;

// 4. 단어 뒤집기
public class Problem4 {

    // 문자열을 뒤집은 결과를 반환해주는 메소드
    public StringBuilder solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb;
    }

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";

        // 입력받은 숫자만큼 문자열을 입력받음
        for(int i = 0; i < num; i++) {
            str = sc.next();

            System.out.println(problem4.solution(str));
        }
    }
}
