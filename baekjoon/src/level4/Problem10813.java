package level4;

import java.util.Scanner;

// 배열의 값을 교환하는 문제
public class Problem10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 N개
        int M = sc.nextInt(); // 공을 넣을 횟수
        int[] arr = new int[N];

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        // 입력할 횟수
        for (int n = 0; n < M; n++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            // i번 바구니와 j번 바구니 값 교환
            int firstNum = arr[i - 1];
            int lastNum = arr[j - 1];

            arr[j - 1] = firstNum;
            arr[i - 1] = lastNum;
        }

        // 바구니 값 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
