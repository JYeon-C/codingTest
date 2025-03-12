package level0;

import java.util.ArrayList;

public class Problem68 {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<String> numList = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                temp += my_string.charAt(i);
                if(i == my_string.length() - 1) {
                    numList.add(temp);
                }
            } else {
                if(!temp.equals("")) {
                    numList.add(temp);
                }
                temp = "";
            }
        }
        answer = numList.stream().mapToInt(Integer::parseInt).sum();
        return answer;
    }
}
