package level0;

// 짝수의 합
public class Problem10 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
