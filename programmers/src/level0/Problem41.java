package level0;

// 개미 군단
public class Problem41 {
    public int solution(int hp) {
        int answer = 0;

        while (true) {
            if(hp >= 5) {
                answer += hp / 5;
                hp = hp % 5;
            } else if(hp >= 3) {
                answer += hp / 3;
                hp = hp % 3;
            } else {
                answer += hp;
                hp = 0;
            }

            if(hp == 0) {
                break;
            }
        }

        return answer;
    }
    // return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    // 반복문까지 쓸 필요가 없었다 ..
}
