package level0;

import java.util.ArrayList;

// 배열 자르기
public class Problem20 {
    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 배열 자르기
        for (int i = 0; i < numbers.length; i++) {
            if(num1 <= i && num2 >= i) {
                answer.add(numbers[i]);
            }
        }
        return answer;
    }
}
