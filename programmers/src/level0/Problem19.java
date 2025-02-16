package level0;

// 문자 반복 출력하기
public class Problem19 {
    public String solution(String my_string, int n) {
        String answer = "";

        // 문자열 n만큼 반복 출력
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
