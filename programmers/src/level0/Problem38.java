package level0;

import java.util.ArrayList;

// 짝수는 싫어요
public class Problem38 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer.add(i);
            }
        }
        return answer;
        //return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

