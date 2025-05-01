package level0;

// 치킨 쿠폰
public class Problem87 {
    public static void main(String[] args) {
        Problem87 problem = new Problem87();
        int chicken = 1081;
        int result = problem.solution(chicken);
        System.out.println("result = " + result);
    }


    public int solution(int chicken) {
        int order = chicken;
        int answer = 0;

        while (true) {
            answer += (order / 10) ; // 쿠폰
            order = (order / 10) + (order % 10); // 치킨
            if(order < 10) {
                break;
            }
        }
        return answer;
    }
}
