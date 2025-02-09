package level4;

import java.util.Scanner;

// 배열에 값을 쓰는 문제
public class Problem10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 N개
        int M = sc.nextInt(); // 공을 넣을 횟수(4줄)
        int[] arr = new int[N];

        // 입력할 횟수
        for (int n = 0; n < M; n++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            // i ~ j까지 k 값 입력
            for (int index = i - 1; index < j; index++) {
                arr[index] = k;
            }
        }

        // 바구니 값 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);

            if(i != arr.length -1) {
                System.out.print(" ");
            }
        }
    }
}
