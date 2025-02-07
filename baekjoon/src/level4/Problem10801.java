package level4;

import java.util.ArrayList;
import java.util.Scanner;

// 배열을 입력받고 X보다 작은 수를 찾는 문제
public class Problem10801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt(); // 수열 개수
        int X = sc.nextInt(); // 입력 정수

        ArrayList<Integer> addList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int number = sc.nextInt(); // 입력한 정수

            // X 보다 작으면 추가
            if(number < X) {
                addList.add(number);
            }
        }

        // 출력
        for(int i = 0; i < addList.size(); i++) {
            System.out.print(addList.get(i));

            // 마지막이 아닌 경우 공백
            if(i != addList.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
