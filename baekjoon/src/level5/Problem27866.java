package level5;

import java.util.Scanner;

public class Problem27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = sc.nextInt();

        System.out.println(str.charAt(index - 1));
    }
}
