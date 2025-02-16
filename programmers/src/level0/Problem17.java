package level0;

// 세균 증식
public class Problem17 {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n;

        // 시간마다 증식
        for(int i = 1; i <= t; i++) {
            answer += answer;
        }
        return answer;
    }
}
