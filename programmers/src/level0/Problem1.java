package level0;

import java.util.Scanner;


// 나머지 구하기
class Problem1 {

    // 나머지 결과 출력
    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(solution(num1, num2));
    }
}