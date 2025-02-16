package level0;

// 배열의 평균값
public class Problem7 {
    public double solution(int[] numbers) {
        double answer = 0; // 정답
        double sum = 0; // 합
        int count = 0; // 개수

        for(int i = 0; i < numbers.length; i++) {
            count += 1;
            sum += numbers[i];
        }

        answer = sum / count;

        return answer;
    }
}
