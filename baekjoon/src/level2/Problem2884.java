package level2;

import java.util.Calendar;
import java.util.Scanner;

// 시간 계산 문제
public class Problem2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, H);
        cal.set(Calendar.MINUTE, M - 45);

        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE));
    }
}
