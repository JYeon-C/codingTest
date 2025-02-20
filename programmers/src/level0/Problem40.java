package level0;

import java.util.Scanner;

// 직각삼각형 출력하기
public class Problem40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String star = "";
        for(int i = 0; i < n; i++) {
            star += "*";
            System.out.println(star);
//            System.out.println("*".repeat(i));
        }
    }

}
