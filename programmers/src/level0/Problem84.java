package level0;

import java.util.Arrays;

// 직사각형 넓이 구하기
public class Problem84 {
    public static void main(String[] args) {
        Problem84 problem84 = new Problem84();
//        int[][] dots = new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}; // 길이 4, 원소 길이 2
        int[][] dots = new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        int result = problem84.solution(dots);
        System.out.println("result = " + result);
    }

    // (x 최댓값 - 최솟값) * (y 최댓값 * 최솟값)
    public int solution(int[][] dots) {
        int answer = 0;

        int[] xValues = new int[dots.length];
        int[] yValues = new int[dots.length];

        for(int i = 0; i < dots.length; i++) {
            xValues[i] = dots[i][0];
            yValues[i] = dots[i][1];
        }

        Arrays.sort(xValues);
        Arrays.sort(yValues);

        int x = xValues[xValues.length - 1] - xValues[0];
        int y = yValues[yValues.length - 1] - yValues[0];

        answer = x * y;

        return answer;
    }
}
