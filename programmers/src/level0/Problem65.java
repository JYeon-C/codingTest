package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

// A로 B 만들기
public class Problem65 {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        before = Arrays.stream(beforeArr).sorted().collect(Collectors.joining());
        after = Arrays.stream(afterArr).sorted().collect(Collectors.joining());

        answer = before.equals(after) ? 1 : 0;
        return answer;
    }
}
