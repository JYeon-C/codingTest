package level0;

// 공 던지기
public class Problem76 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for(int i = 2; i <= k; i++) {
            index = ((index + 2) % numbers.length);
        }
        answer = numbers[index];
        return answer;
    }
}
