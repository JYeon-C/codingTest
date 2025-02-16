package level0;

// 편지
public class Problem16 {
    public int solution(String message) {
        int answer = 0;

        for(int i = 0; i < message.length(); i++) {
            answer += 2;
        }
        return answer;
    }
}
