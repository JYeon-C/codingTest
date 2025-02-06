package level3;

import java.util.ArrayList;
import java.util.Scanner;

// 0 0이 들어올 때까지 A+B를 출력하는 문제
public class Problem10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sumList = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A == 0 && B == 0) {
                flag = false;
            } else {
                sumList.add(A + B);
            }
        }
        sumList.forEach(System.out::println);
    }
}
