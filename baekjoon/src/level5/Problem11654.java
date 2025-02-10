package level5;

import java.util.Scanner;

// 데이터는 결국 0과 1일 텐데 문자를 어떻게 만드는 걸까요? 아스키 코드에 대해 알아봅시다.
public class Problem11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int asciiCode = str.hashCode();

        System.out.println(asciiCode);
//        System.out.println((int)str.charAt(0));
    }
}
