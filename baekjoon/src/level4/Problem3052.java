package level4;

import java.util.ArrayList;
import java.util.Scanner;

// 배열을 활용하여 서로 다른 값의 개수를 찾는 문제
public class Problem3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        // 42로 나눈 나머지 리스트
        for(int i = 0; i < 10; i++) {
            int A = sc.nextInt();

            arrList.add(A % 42);
        }

        int count = 0;
        for(int i = 0; i < arrList.size(); i++) {
            boolean flag = true;

            // 같은 값이 존재하는지 확인
            for(int j = i + 1; j < arrList.size(); j++) {
                if(arrList.get(i) == arrList.get(j)) {
                    flag = false;
                }
            }

            if(flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}
