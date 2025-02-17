package level0;

import java.util.Arrays;

// 삼각형의 완성조건(1)
public class Problem26 {
    public int solution(int[] sides) {
        int answer = 0;

        // 배열 정렬
        sides = Arrays.stream(sides).sorted().toArray();

        // 최댓값을 제외한 나머지 길이 합산
        int sum = 0;
        for(int i = 0; i < sides.length; i++) {
            if(i != sides.length - 1) {
                sum += sides[i];
            }
        }
        // 결과 출력
        answer = sum > sides[2]? 1 : 2;

        return answer;
    }
}
