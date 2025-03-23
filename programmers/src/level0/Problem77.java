package level0;

import java.util.Arrays;

// 문자열 계산하기
public class Problem77 {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        answer += Integer.parseInt(strArr[0]);

        int idx = 0;

        while (true) {
            if(strArr[idx].equals("+")) {
                answer += Integer.parseInt(strArr[idx + 1]);
            } else if(strArr[idx].equals("-")) {
                answer -= Integer.parseInt(strArr[idx + 1]);
            }
            idx++;

            if(idx == strArr.length - 1) {
                break;
            }
        }
        return answer;
    }
}
