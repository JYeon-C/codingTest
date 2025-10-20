package lecture1;

import java.util.Scanner;

// 한 개의 문장에서 가장 긴 단어를 출력
// indexOf(), substring() 도 활용 가능
public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); // 안전하게 in.nextLine().trim();
        String[] strings = str.split(" "); // str.split("\\s+"); 하나 이상의 공백을 확인

        String answer = "";
        for(String s : strings) {
            // 길이가 더 긴 단어가 있는지 확인
            if(s.length() > answer.length()) {
                answer = s;
            }
        }
        System.out.println(answer);
    }
}
