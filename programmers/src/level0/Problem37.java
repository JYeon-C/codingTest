package level0;

import java.util.Arrays;

// 중앙값 구하기
public class Problem37 {
    public int solution(int[] array) {
        int answer = 0;
        int middleIdx = array.length / 2;

        array = Arrays.stream(array).sorted().toArray();
        answer = array[middleIdx];

        return answer;
    }
}
