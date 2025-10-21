package lecture1;

import java.util.Scanner;

// 문자열 압축
public class Problem11 {
    public String solution(String str) {
        String answer = "";
        answer += str.charAt(0);
        char[] strArr = str.toCharArray();

        char curPos = str.charAt(0); // 조건을 수행할 현재 문자
        int strCnt = 0; // 문자열 개수
        // 문자열 압축
        for(int i = 0; i < strArr.length; i++) {
            // 같은 문자열이 연속되는 경우 strCnt 값 증가
            if(strArr[i] == curPos) {
                strCnt++;

                // 같은 문자로 끝나는 경우 처리
                if(i == strArr.length - 1 && strCnt > 1) {
                    answer += strCnt;
                }
            } else {
                // 문자열이 달라졌을 때 개수 확인 및 문자 추가
                curPos = strArr[i];
                if(strCnt > 1) {
                    answer += strCnt;
                }
                answer += curPos;
                strCnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem11 main = new Problem11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
