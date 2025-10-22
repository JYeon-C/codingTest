package lecture2;

import java.util.Scanner;

// 보이는 학생
public class Problem2 {
    public int solution(int[] numArr) {
        int answer = 0;
        int max = 0;

        // 큰 수가 있는지 조회 및 업데이트
        for(int i = 0; i < numArr.length; i++) {
            if(max < numArr[i]) {
                max = numArr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem2 main = new Problem2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }
        System.out.println(main.solution(numArr));
    }
}
