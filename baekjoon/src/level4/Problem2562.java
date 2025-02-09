package level4;

import java.util.ArrayList;
import java.util.Scanner;

// 최댓값이 어디에 있는지 찾는 문제
public class Problem2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> addList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int number = sc.nextInt(); // 입력한 정수

            addList.add(number);
        }

        int max = 0; // 최댓값
        int index = 0; // 최댓값의 인덱스
        for (int i = 0; i < addList.size(); i++) {
            if (max < addList.get(i)) {
                max = addList.get(i);
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }
}
