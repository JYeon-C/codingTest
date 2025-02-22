package level0;

import java.util.ArrayList;

public class Problem46 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 1; i <= n; i ++) {
            if(n % i == 0) {
                answer.add(i);
            }
        }

        return answer;
    }
}
