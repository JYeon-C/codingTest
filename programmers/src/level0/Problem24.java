package level0;

// 집의 위치 구하기
public class Problem24 {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];

        // 점의 위치
        if(x > 0 && y > 0) {
            answer = 1;
        } else if(x < 0 && y > 0) {
            answer = 2;
        } else if(x < 0 && y < 0) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }
}
