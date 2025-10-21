package lecture1;

import java.util.Scanner;

// 암호(replace(), parseInt(string, 2))
public class Problem12 {
    public String solution(int num, String str) {
        String answer = "";
        String[] strArr = new String[num];

        // # = 1, * = 0;
        str = str.toUpperCase(); // 대문자로 변환
        str = str.replaceAll("#", "1"); // #은 1로 치환
        str = str.replaceAll("\\*", "0"); // *은 0으로 치환

        // 7개의 문자열로 쪼개기
        for(int i = 0; i < num; i++) {
            strArr[i] = str.substring(i * 7, i * 7 + 7);
        }

        // 알파벳으로 변환
        for(int i = 0; i < strArr.length; i++) {
            int temp = 0;
            for(int j = 0; j < strArr[i].length() ; j++) {
                temp += (int) (Double.parseDouble(String.valueOf(strArr[i].charAt(6 - j))) * (Math.pow(2, j)));
            }
            answer += (char) temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem12 main = new Problem12();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(num, str));
    }
}
