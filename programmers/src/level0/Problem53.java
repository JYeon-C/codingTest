package level0;

import java.util.stream.IntStream;

// 제곱수 판별하기
public class Problem53 {
    public int solution(int n) {
        int answer = 0;

        int[] numList = {};

        // 약수를 구하고 약수의 제곱이 n 과 일치하는지 확인
        numList = IntStream.range(1, n + 1).filter(i -> n % i == 0).toArray();

        for(int i : numList) {
            if(i * i != n) {
                answer = 2;
            } else {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}

// sqrt 활용하기..
