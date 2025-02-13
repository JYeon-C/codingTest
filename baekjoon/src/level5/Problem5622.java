package level5;

import java.util.*;

// 규칙에 따라 문자에 대응하는 수를 출력하는 문제
public class Problem5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int numA = "A".hashCode();
        int numZ = "Z".hashCode();

        ArrayList<Character> alphabetList = new ArrayList<>();
        ArrayList<Character> strList = new ArrayList<>();
        ArrayList<Character> plusList = new ArrayList<>(Arrays.asList('A', 'D', 'G', 'J', 'M', 'P', 'T', 'W'));

        // 알파벳 배열
        for(int i = numA; i <= numZ; i++) {
            alphabetList.add((char) i);
        }

        // 입력 문자열
        for(int i = 0; i < str.length(); i++) {
            strList.add(str.charAt(i));
        }

        int result = 0;
        // 일치하는 값 확인
        for(int i = 0; i < strList.size(); i++) {
            int count = 2;

            // 알파벳에 따라 count 값 할당
            for(int j = 0; j < alphabetList.size(); j++) {
                if(plusList.contains(alphabetList.get(j))) {
                    count += 1;
                }

                // 입력 문자열과 알파벳 일치 시 해당 count 값 합산
                if(strList.get(i) == alphabetList.get(j)) {
                    result += count;
                }
            }
        }
        System.out.println(result);
    }
}
