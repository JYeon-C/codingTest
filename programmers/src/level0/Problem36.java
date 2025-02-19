package level0;

import java.util.Arrays;

// 배열 두 배 만들기
public class Problem36 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        answer = Arrays.stream(numbers).map(x-> x * 2).toArray();

        return answer;
    }
}
