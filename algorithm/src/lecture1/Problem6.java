package lecture1;

import java.util.ArrayList;
import java.util.Scanner;

// 중복 문자 제거
public class Problem6 {
    public String solution(String str) {
        String answer = "";
        ArrayList<Character> tempArr = new ArrayList<>();

        for(char c : str.toCharArray()) {
            if(!tempArr.contains(c)) {
                tempArr.add(c);
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem6 main = new Problem6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
