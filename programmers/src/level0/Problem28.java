package level0;

import java.util.Arrays;

// 머쓱이보다 키 큰 사람
public class Problem28 {
    public int solution(int[] array, int height) {
        int answer = 0;

        answer = (int) Arrays.stream(array).filter(x -> height < x).count();

        return answer;
    }
}
