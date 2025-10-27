package lecture2;

import java.util.Scanner;

// 점수계산
public class Problem7 {
    public int solution(int[] result) {
        int answer = 0;
        int score = 0;

        // 점수 계산
        for(int n : result) {
            if(n == 1) {
                score++;
            } else {
                score = 0;
            }
            answer += score;
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem7 T = new Problem7();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] result = new int[N];

        for(int i = 0; i < N; i++) {
            result[i] = sc.nextInt();
        }
        System.out.println(T.solution(result));
    }
}
