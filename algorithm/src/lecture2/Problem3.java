package lecture2;

import java.util.Scanner;

// 가위 바위 보
public class Problem3 {
    public void solution(int[] userA, int[] userB) {
        // 1: 가위, 2: 바위, 3: 보
        // A가 이기면 A, B가 이기면 B, 비길 경우 D 출력
        for(int i = 0; i < userA.length; i++) {
            if(userA[i] == userB[i]) {
                System.out.println("D");
            } else if((userA[i] == 1 && userB[i] == 3) || (userA[i] == 2 && userB[i] == 1) || (userA[i] == 3 && userB[i] == 2)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) {
        Problem3 main = new Problem3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 게임 횟수
        int[] userA = new int[n];
        int[] userB = new int[n];

        // n번의 가위바위보
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0) {
                    userA[j] = sc.nextInt();
                } else {
                    userB[j] = sc.nextInt();
                }
            }
        }
        main.solution(userA, userB);
    }
}
