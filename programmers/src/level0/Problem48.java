package level0;

import java.util.Arrays;

public class Problem48 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        answer[0] = Arrays.stream(array).max().getAsInt();
        answer[1] = Arrays.binarySearch(array, answer[0]);

        return answer;
    }
}
