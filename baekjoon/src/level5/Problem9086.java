package level5;

import java.util.Scanner;

// 문...제
public class Problem9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            String str = sc.next();
            int lastIdx = str.length() - 1;

            char firstStr = str.charAt(0);
            char lastStr = str.charAt(lastIdx);

            System.out.print(firstStr);
            System.out.print(lastStr);
            System.out.println();
        }
    }
}
