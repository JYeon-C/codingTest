package level3;

import java.util.ArrayList;
import java.util.Scanner;

// A+B를 여러 번 출력하는 문제
public class Problem10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> sumList = new ArrayList<>();

        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            sumList.add(A + B);
        }
        sumList.forEach(System.out::println);
    }
}
