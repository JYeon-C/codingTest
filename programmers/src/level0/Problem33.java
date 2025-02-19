package level0;

import java.util.Arrays;

// 모음 제거
public class Problem33 {
    public String solution(String my_string) {
        String answer = "";
        String[] condition = {"a", "e", "i", "o", "u"};

        for(int i = 0; i < my_string.length(); i++) {
            boolean removeStr = Arrays.stream(condition).anyMatch(String.valueOf(my_string.charAt(i))::equals);

            // 모음이 아니라면 추가
            if(!removeStr) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}

// answer = my_string.replaceAll("[aeiou]", "");
