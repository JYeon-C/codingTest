package lecture2;

import java.util.Scanner;

// 격자판 최대합
public class Problem9 {
    public int solution(int[][] inputs) {
        int answer = 0;

        // 행의 최대 합
        int max = 0;
        for(int i = 0; i < inputs.length; i++) {
            int temp = 0;
            for(int j = 0; j < inputs[i].length; j++) {
                temp += inputs[i][j];
            }
            // 행의 합산 값이 max 보다 크면 업데이트
            if(temp > max) {
                max = temp;
            }
        }

        if(answer < max) {
            answer = max;
        }

        max = 0;
        // 열의 최대 합
        for(int i = 0; i < inputs.length; i++) {
            int temp = 0;
            for(int j = 0; j < inputs[i].length; j++) {
                temp += inputs[j][i];
            }
            // 열의 합산 값이 max 보다 크면 업데이트
            if(temp > max) {
                max = temp;
            }
        }

        if(answer < max) {
            answer = max;
        }

        // 왼쪽 아래 대각선의 합
        max = 0;
        for(int i = 0; i < inputs.length; i++) {
            max += inputs[i][i];
        }

        if(answer < max) {
            answer = max;
        }

        // 오른쪽 아래 대각선의 합
        max = 0;
        for(int i = inputs.length - 1; i >= 0; i--) {
            max += inputs[i][i];
        }

        if(answer < max) {
            answer = max;
        }

        return answer;
    }


    public static void main(String[] args) {
        Problem9 T = new Problem9();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] inputs = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(inputs));;
    }
}
