package level0;

// 종이 자르기
public class Problem83 {
    public static void main(String[] args) {
        Problem83 problem83 = new Problem83();
        int result = problem83.solution(1, 1);

        System.out.println("result = " + result);
    }

    public int solution(int M, int N) {
        int answer = 0;

        for(int i = M; i > 0; i--) {
            for(int j = N; j > 0; j--) {
                answer++;
            }
        }

        answer = answer - 1;
        return answer; // = M * N - 1
    }
}
