package level2;

import java.util.Calendar;
import java.util.Scanner;

// 범위가 더 넓은 시간 계산 문제
public class Problem2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int cookingTime = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, H);
        cal.set(Calendar.MINUTE, M + cookingTime);

        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE));
    }
}
