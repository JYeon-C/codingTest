package level0;

// 인덱스 바꾸기
public class Problem47 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer += my_string.charAt(num2);
            } else if(i == num2) {
                answer += my_string.charAt(num1);
            } else {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}

//char[] ch = my_string.toCharArray();
//
//ch[num1] = my_string.charAt(num2);
//ch[num2] = my_string.charAt(num1);
//
//answer = String.valueOf(ch);
//        return answer;