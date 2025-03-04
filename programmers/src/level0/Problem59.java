package level0;

// 숫자 찾기
public class Problem59 {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);

        for(int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) - 48 == k) { // + '0'
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}

//   return ("-" + num).indexOf(String.valueOf(k));