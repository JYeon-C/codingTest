package level0;

import java.util.ArrayList;

// 문자열 정렬하기 (1)
public class Problem49 {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                answer.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        answer.sort(Integer::compareTo);

        return answer;
    }
}

// Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
