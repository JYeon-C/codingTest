package level0;

import java.util.Arrays;

// 중복된 숫자 개수
public class Problem35 {
    public int solution(int[] array, int n) {
        int answer = 0;

        answer = (int) Arrays.stream(array).filter(x -> x == n).count();

        return answer;
    }
}
