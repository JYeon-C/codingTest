package level0;

// 피자 나눠 먹기(2)
public class Problem54 {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;

        while(true) {
            answer++;
            if(pizza % n == 0) {
                break;
            } else {
                pizza += 6;
            }
        }
        return answer;
    }
}
