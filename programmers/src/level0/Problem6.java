package level0;

// 두 수의 나눗셈
public class Problem6 {
    public double solution(double num1, double num2) {
        double answer = (num1 / num2) * 1000;

        return (int) answer;
    }
}
