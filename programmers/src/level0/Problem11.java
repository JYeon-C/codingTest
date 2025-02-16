package level0;

// 피자 나눠 먹기 (3)
public class Problem11 {
    public int solution(int slice, int n) {
        int answer = 1;

        int sum = slice;
        while(true) {
            if(sum < n) {
                sum += slice;
                answer += 1;
            } else {
                break;
            }
        }
        return answer;
    }
}
