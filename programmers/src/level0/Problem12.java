package level0;

// 문자열안에 문자열
public class Problem12 {
    public int solution(String str1, String str2) {
        int answer = 2;

        String temp = "";

        // 일치하는 문자열이 있는지 확인
        for(int i = 0; i <= str1.length(); i++) {
            int strLen = i + str2.length();

            if(strLen <= str1.length()) {
                temp = str1.substring(i, strLen);

                if(temp.equals(str2)) {
                    answer = 1;
                }
            }
        }
        return answer;
    }
}
