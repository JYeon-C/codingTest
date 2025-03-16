package level0;

import java.util.HashSet;
import java.util.stream.Collectors;

// 한 번만 등장한 문자
public class Problem70 {
    public String solution(String s) {
        String answer = "";

        HashSet<Character> set = new HashSet<>();
        HashSet<Character> chkSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i)) && !chkSet.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                chkSet.add(s.charAt(i));
                set.remove(s.charAt(i));
            }
        }
        answer = set.stream().map(String::valueOf).sorted().collect(Collectors.joining());

        return answer;
    }
}
