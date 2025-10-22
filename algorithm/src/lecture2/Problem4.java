package lecture2;

import java.util.ArrayList;
import java.util.Scanner;

// 피보나치 수열
public class Problem4 {
    public void solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 1;
        // 앞 두 숫자의 합을 값으로 입력
        for(int i = 0; true; i++) {
            if(list.size() < 2) {
                list.add(count);
            } else {
                list.add(list.get(i-2) + list.get(i-1));
            }
            System.out.print(list.get(i) + " ");

            // 리스트의 개수가 n이 되면 반복 종료
            if(list.size() == n) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Problem4 main = new Problem4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        main.solution(n);
    }
}
