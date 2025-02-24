package level0;

import java.util.Arrays;

// 최댓값 만들기
public class Problem44 {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int maxNum1 = numbers[0] * numbers[1];
        int maxNum2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        answer = Math.max(maxNum1, maxNum2);

        return answer;
    }
}
