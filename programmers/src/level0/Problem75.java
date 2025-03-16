package level0;

// 잘라서 배열로 저장하기
public class Problem75 {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n != 0 ? my_str.length() / n + 1: my_str.length() / n;
        String[] answer = new String[len];

        for(int i = 0; i < answer.length; i++) {
            int endValue = (i + 1) * n;

            if(endValue > my_str.length()) {
                endValue = my_str.length();
            }
            answer[i] = my_str.substring(i * n, endValue);
        }
        return answer;
    }
}
