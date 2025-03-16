package level0;

// 7의 개수
public class Problem71 {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            answer += String.valueOf(array[i]).replaceAll("[^7]", "").length();
        }

        return answer;
    }
}
