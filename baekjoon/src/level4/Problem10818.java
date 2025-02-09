package level4;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

// 최솟값과 최댓값을 찾는 문제
public class Problem10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt(); // 정수 개수

        ArrayList<Integer> addList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int number = sc.nextInt(); // 입력한 정수

            addList.add(number);
        }

        // 최소 & 최댓값
        Optional<Integer> minNum = addList.stream().min(Integer::compareTo);
        Optional<Integer> maxNum = addList.stream().max(Integer::compareTo);

        int min = minNum.orElseThrow();
        int max = maxNum.orElseThrow();

        System.out.println(min + " " + max);
    }
}
