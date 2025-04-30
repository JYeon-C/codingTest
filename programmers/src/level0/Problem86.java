package level0;

import java.util.Arrays;

// 등수 매기기
public class Problem86 {
    public static void main(String[] args) {
        Problem86 problem86 = new Problem86();
//        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
//        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}, {10, 30}, {10, 30}, {10, 25}};
//        int[][] score = {{100, 90}, {100, 100}, {10, 30},{80, 70}, {70, 80}, {30, 50}, {30, 50}, {30, 50}, {30, 50}, {30, 50}};
        int[][] score = {{0, 3}, {0, 2}};

        int[] result = problem86.solution(score);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] temp = new double[score.length];

        for(int i = 0; i < score.length; i++) {
            temp[i] = (double) (score[i][0] + score[i][1]) / 2; // 평균 값
        }
        System.out.println("temp : " + Arrays.toString(temp));

        for(int i = 0; i < temp.length; i++) {
            int rank = 1;
            for(int j = 0; j < temp.length; j++) {
                if(i != j && temp[i] < temp[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}
