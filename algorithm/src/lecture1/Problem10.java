package lecture1;

import java.util.Scanner;

// 가장 짧은 문자거리
public class Problem10 {
    public void solution(String str, char c) {
        int[] distance = new int[str.length()]; // 거리
        char[] charArr = str.toCharArray(); // 문자열

        // 문자열 내에 조건 값이 있는 경우
        if(str.indexOf(c) != -1) {
            // 문자열 순회
            // 큰 값으로 초기화하는 이유는 **"아직 'e'를 만나지 못했다 = 거리를 모른다 = 일단 아주 멀다"**를 표현
            int count = 1000; // count 값 초기화에서 계속 문제 발생했었음.. 원래는 count = 0으로 설정했었는데..
            for(int i = 0; i < charArr.length; i++) {
                if(charArr[i] == c) {
                    count = 0;
                } else {
                    count++;
                }
                distance[i] = count;
            }

            count = 1000;
            // 문자열 역방향 순회 > 가까운 거리 값으로 업데이트
            for(int i = str.length() - 1; i >= 0; i--) {
                if(charArr[i] == c) {
                    count = 0;
                } else {
                    count++;
                }
                // 최단 거리 업데이트
                if(count < distance[i]) {
                    distance[i] = count;
                }
            }
        }
        // 결과 출력
        for(int i = 0; i < distance.length; i++) {
            System.out.print(distance[i]);
            if(i != distance.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Problem10 main = new Problem10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        main.solution(str, c);
    }
}
