package level0;

import java.util.ArrayList;
import java.util.stream.IntStream;

// 이진수 더하기
public class Problem74 {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int binNum1 = IntStream.range(0, bin1.length()).filter(idx -> bin1.charAt(idx) == '1').map(idx -> 1 << (bin1.length() - 1) - idx).sum();
        int binNum2 = IntStream.range(0, bin2.length()).filter(idx -> bin2.charAt(idx) == '1').map(idx -> 1 << (bin2.length() - 1) - idx).sum();
        int answerNum = binNum1 + binNum2;
        ArrayList<Integer> binList = new ArrayList<>();

        // 이진수 변환
        if(answerNum != 0) {
            while (true) {
                binList.add(answerNum % 2);
                answerNum = answerNum / 2;
                if (answerNum < 2) {
                    binList.add(answerNum);
                    break;
                }
            }
        } else {
            answer = "0";
        }
        // 출력
        for(int i = binList.size() - 1; i >= 0; i--) {
            answer += binList.get(i);
        }
        return answer;
    }
}
// int num = Integer.parseInt("1011", 2);
// 두번째 인자를 2로 전달하면 첫번째 문자열을 이진수로 해석하여 정수로 변환!