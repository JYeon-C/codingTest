package level0;

public class Problem55 {
    public String solution(int age) {
        String answer = "";
        char[] strAgeChar = String.valueOf(age).toCharArray();

        for(char c : strAgeChar) {
            answer += (char)((int)c + 49);
        }

        return answer;
    }
}
