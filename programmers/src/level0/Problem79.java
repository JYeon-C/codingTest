package level0;

import java.util.Arrays;

// 삼각형의 완성 조건
public class Problem79 {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        int arrMaxValue = sides[sides.length - 1];
        for(int i = 1; i <= arrMaxValue; i++) {
            if(arrMaxValue < sides[0] + i) {
                System.out.println("i = " + i);
                answer++;
            }
        }

        int sideSum = Arrays.stream(sides).sum();
        for(int i = arrMaxValue + 1; i < sideSum; i++) {
            answer++;
        }

        return answer;
    }
}

// 최솟값 * 2 - 1 = answer