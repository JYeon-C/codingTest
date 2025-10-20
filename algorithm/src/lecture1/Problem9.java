package lecture1;

import java.util.Scanner;

// 숫자만 추출
public class Problem9 {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", ""); // 숫자 외 문자 처리
        answer = Integer.parseInt(str); // 추출된 숫자 문자열을 int 형으로 변환

        return answer;
    }

    public static void main(String[] args) {
        Problem9 main = new Problem9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
