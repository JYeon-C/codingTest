package level3;

import java.util.Scanner;

// 코딩 공부를 잘 하여 이렇게 long long long long...을 칠판에 적는 일이 없도록 합시다.
public class Problem25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String longStr = "";

        for(int i = 0; i < N / 4; i++) {
            longStr += "long ";
        }
        System.out.println(longStr + "int");
    }
}
