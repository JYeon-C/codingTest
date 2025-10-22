package lecture2;

import java.util.Scanner;

// 큰 수 출력하기
public class Problem1 {
    public void solution(int[] numArr) {
        for(int i = 0; i < numArr.length; i++) {
            if(i == 0 || numArr[i] > numArr[i-1]) {
                System.out.print(numArr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Problem1 main = new Problem1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];

        for(int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }
        main.solution(numArr);
    }
}
