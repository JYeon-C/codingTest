package level0;

// 숨어있는 숫자의 덧셈 (1)
public class Problem43 {
    public int solution(String my_string) {
        int answer = 0;

        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < 10; j++) {
                if(String.valueOf(my_string.charAt(i)).equals(String.valueOf(j))) {
                    answer += j;
                };
            }
        }
        return answer;
    }
}


// 풀이 1)  return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
// 풀이 2)
/*
    String str = my_string.replaceAll("[^0-9]","");

    for(char ch : str.toCharArray()) {
        answer += Character.getNumericValue(ch);
    }
    */
