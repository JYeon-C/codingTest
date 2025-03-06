package level0;

import java.util.ArrayList;

public class Problem61 {
    public String solution(String my_string) {
        String answer = "";

        char[] strList = my_string.toCharArray();
        ArrayList<Character> chkList = new ArrayList<>();

        for(char c : strList) {
            if(!chkList.contains(c)) {
                chkList.add(c);
                answer += c;
            }
        }

        return answer;
    }
}
