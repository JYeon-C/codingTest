package level2;

import java.util.Scanner;

// 윤년을 판별하는 문제 - 윤년이면 1, 아니면 0
public class Problem2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 윤년: 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때
        // ex) 2012년: 윤년 O / 1900년: 윤년 X / 2000년 윤년 O
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
