package level0;

// 암호 해독
public class Problem50 {
    public String solution(String cipher, int code) {
        String answer = "";

        int temp = code;
        while(true) {
            if(temp <= cipher.length()) {
                answer += cipher.charAt(temp - 1);
                temp += code;
            } else {
                break;
            }
        }

        return answer;
    }
}


/*
for (int i = code; i <= cipher.length(); i = i + code) {
    answer += cipher.substring(i - 1, i);
}
        */
