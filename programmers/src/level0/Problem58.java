package level0;

public class Problem58 {
    public int solution(int order) {
        int answer = 0;
        char[] list = String.valueOf(order).toCharArray();

        for(char c : list) {
            if(c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }

        return answer;
    }
}
