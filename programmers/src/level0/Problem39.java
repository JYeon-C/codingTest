package level0;

// 옷가게 할인 받기
public class Problem39 {
    public int solution(int price) {
        double answer = 0;

        if(price >= 500000) {
            answer = price * 0.8;
        } else if(price >= 300000) {
            answer = price * 0.9;
        } else if(price >= 100000) {
            answer = price * 0.95;
        } else {
            answer = price;
        }

        return (int) answer;
    }
}
