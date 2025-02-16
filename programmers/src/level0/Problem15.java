package level0;

// 최댓값 만들기(1)
public class Problem15 {
    public int solution(int[] numbers) {
        int answer = 0;

        int temp = 0;
        // 배열 정렬
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        int max1 = numbers[numbers.length - 1]; // 최댓값 1
        int max2 = numbers[numbers.length - 2]; // 최댓값 2
        answer = max1 * max2;

        return answer;
    }
}
