package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

// 문자열 정렬하기(2)
public class Problem52 {
    public String solution(String my_string) {
        String answer = "";

        my_string = my_string.toLowerCase();
        Character[] charArr = new Character[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            charArr[i] = my_string.charAt(i);
        }
        answer = Arrays.stream(charArr).sorted().map(c -> c.toString()).collect(Collectors.joining());

        return answer;
    }
}


/*
char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
*/
