package level0;

import java.util.ArrayList;

// 문자열 뒤집기
public class Problem23 {
    public String solution(String my_string) {
        String answer = "";

        // 문자열 뒤집기
        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
