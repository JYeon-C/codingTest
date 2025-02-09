package level4;

import java.util.ArrayList;
import java.util.Scanner;

// 평균을 조작하는 문제
public class Problem1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Double> scoreList = new ArrayList<>();

        // 성적 배열
        for(int i = 0; i < N; i++) {
            double score = sc.nextDouble();

            scoreList.add(score);
        }

        // 최댓값
        double maxValue = scoreList.stream().max(Double::compareTo).get();

        double scoreSum = 0;
        // 성적 조작
        for(int i = 0; i < scoreList.size(); i++) {
            scoreSum += (scoreList.get(i) / maxValue) * 100;
        }

        // 결과 출력
        double result = scoreSum / scoreList.size();
        System.out.println(result);
    }
}
