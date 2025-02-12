package level5;

import java.util.Scanner;

public class Problem11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력이 있을 때까지 계속 읽음
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
