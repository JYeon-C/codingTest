package level0;

// 합성수 찾기
public class Problem60 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int count = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

            if(count >= 3) {
                answer++;
            }
        }
        return answer;
    }
}
