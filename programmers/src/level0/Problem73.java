package level0;

import java.util.TreeSet;

// 소인수 분해
public class Problem73 {
    public TreeSet<Integer> solution(int n) {
        TreeSet<Integer> answer = new TreeSet<>();

        int temp = 2;
        while(true) {
            if(n % temp == 0) {
                n = n / temp;
                answer.add(temp);
            } else {
                temp++;
            }
            if(n < temp) {
                break;
            }
        }
        return answer;
    }
}
