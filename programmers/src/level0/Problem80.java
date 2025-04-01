package level0;

import java.util.Arrays;
import java.util.List;

// 영어가 싫어요
public class Problem80 {
    public long solution(String numbers) {
        long answer = 0;

        List<String> numberList = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        String chkStr = "";
        String temp = "";
        for(int i = 0; i < numbers.length(); i++) {
            chkStr += numbers.charAt(i);
            if(numberList.contains(chkStr)) {
                temp += numberList.indexOf(chkStr);
                chkStr = "";
            }
        }
        answer = Long.parseLong(temp);

        return answer;
    }
}

// List (ArrayList) O(n) <- 한 개씩 전부 순회
// Set (HashSer) O(1) <- 해시 기반 빠른 탐색
// numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
