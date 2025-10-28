package lecture2;

import java.util.*;

// 등수구하기
public class Problem8 {
    public void solution(int[] scores) {
        int[] answer = new int[scores.length];
        Arrays.fill(answer, 1); // 1로 초기화

        // 조회하는 값보다 큰 값이 있는 경우 +1
        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores.length; j++) {
                if(scores[i] < scores[j]) {
                    answer[i] += 1;
                }
            }
        }

        // 출력
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static void main(String[] args) {
        Problem8 T = new Problem8();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = new int[N];

        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
        T.solution(scores);
    }
}
