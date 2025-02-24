package level0;

// 대문자와 소문자
// Character.isUpperCase(문자열) 활용하기..
public class Problem45 {
    public String solution(String my_string) {
        String answer = "";

        // 문자 변환
        for(int i = 0; i < my_string.length(); i++) {
            int condition = my_string.charAt(i);

            // 소문자 -> 대문자
            if(condition >= 97 && condition <= 122) {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            } else { // 대문자 -> 소문자
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
        }

        return answer;
    }
}
