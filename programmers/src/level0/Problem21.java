package level0;

import java.util.ArrayList;

// 짝수 홀수 개수
public class Problem21 {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();

        int count1 = 0; // 짝수의 개수
        int count2 = 0; // 홀수의 개수

        // 개수 구하기
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }

        answer.add(count1);
        answer.add(count2);

        return answer;
    }
}
