package level0;

// 팩토리얼
public class Problem67 {
    public int solution(int n) {
        int answer = 1;
        int cnt = 1;

        while(true) {
            answer = answer * cnt;

            if(answer > n) {
                answer = cnt - 1;
                break;
            } else if(answer == n) {
                answer = cnt;
                break;
            } else {
                cnt++;
            }
        }
        return answer;
    }
}
