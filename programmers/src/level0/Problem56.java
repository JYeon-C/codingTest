package level0;

// 배열 회전시키기
public class Problem56 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for(int i = 0 ; i < numbers.length; i++) {
            int temp = 0;
            if(direction.equals("right")) {
                temp = numbers[numbers.length - 1];

                if(i == 0) {
                    answer[i] = temp;
                } else {
                    answer[i] = numbers[i - 1];
                }
            } else {
                temp = numbers[0];

                if(i != numbers.length - 1) {
                    answer[i] = numbers[i + 1];
                } else {
                    answer[i] = temp;
                }
            }
        }

        return answer;
    }
}
