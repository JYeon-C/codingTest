package level4;

import java.util.ArrayList;
import java.util.Scanner;

// 배열을 입력받고 v를 찾는 문제
public class Problem10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt(); // 정수의 개수

        ArrayList<Integer> addList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int number = sc.nextInt(); // 입력한 정수

            addList.add(number);
        }

        int v = sc.nextInt(); // 찾는 정수

        int count = 0; // 일치하는 정수 개수
        for (Integer item : addList) {
            if(item == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
