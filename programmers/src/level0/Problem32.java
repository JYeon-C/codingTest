package level0;

import java.util.Arrays;

// n의 배수 고르기
public class Problem32 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};

        answer = Arrays.stream(numlist).filter(x -> x % n == 0).toArray();
        return answer;
    }
}
