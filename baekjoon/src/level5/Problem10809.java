package level5;

import java.util.ArrayList;
import java.util.Scanner;

// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
public class Problem10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // a ~ z까지의 값을 가지고 있는 배열
        ArrayList<Character> alphabetList = new ArrayList<>();
        // 결과 값을 담을 배열
        ArrayList<Integer> resultList = new ArrayList<>();

        int start = "a".hashCode();
        int end = "z".hashCode();

        for(int i = start; i <= end; i++) {
            alphabetList.add((char) i);
            resultList.add(-1);
        }

        // 입력한 문자열이 포함되어 있지 않다면 -1
        // 포함되어 있다면 해당 문자열의 index 출력
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < alphabetList.size(); j++) {
                // 포함되어 있는 경우 해당 문자열 index로 수정
                if(str.charAt(i) == alphabetList.get(j)) {
                    resultList.set(j, str.indexOf(str.charAt(i)));
                }
            }
        }

        // 출력
        for(int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i));

            if(i != resultList.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
