package level0;

// 특정 문자 제거하기
public class Problem18 {
    public String solution(String my_string, String letter) {
        String answer = "";

        String[] strList = {};
        strList = my_string.split(letter);

        // letter을 제외하고 출력
        for(int i = 0; i < strList.length; i++) {
            answer += strList[i];
        }

        return answer;
    }
}
