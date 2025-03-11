package level0;

// k의 개수
public class Problem64 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int n = i; n <= j; n++) {
            String temp = String.valueOf(n);
            for(int m = 0; m < temp.length(); m++) {
                if(String.valueOf(temp.charAt(m)).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
