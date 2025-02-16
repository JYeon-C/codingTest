package level0;

// 양꼬치
public class Problem9 {
    public int solution(int n, int k) {
        int answer = (12000 * n) + (2000 * k);

        // 10인분 이상 먹으면 음료 하나 서비스
        if(n >= 10) {
            answer = answer - 2000 * (n / 10);
        }

        return answer;
    }
}
