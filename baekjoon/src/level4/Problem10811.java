package level4;

import java.util.Scanner;

// 배열을 뒤집는 문제
public class Problem10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];

        // 1~N의 번호를 가진 바구니 생성
        for(int n = 0; n < N; n++) {
            basket[n] = n + 1;
        }

        // i ~ j번째까지 바구니 순서 역순변경
        for(int n = 0; n < M; n++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp;
            int lastIndex = j - 1;
            for(int firstndex = i - 1; firstndex < lastIndex; firstndex++) {
                temp = basket[firstndex];
                basket[firstndex] = basket[lastIndex];
                basket[lastIndex] = temp;
                lastIndex--;
            }
        }
        // 출력
        for(int n = 0; n < N; n++) {
            System.out.print(basket[n]);
            
            if(n != basket.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

