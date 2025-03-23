package level0;

import java.math.BigInteger;
import java.util.stream.IntStream;

// 구슬을 나누는 경우의 수 = balls!/share!(balls - share)!
public class Problem78 {
    public static void main(String[] args) {
        int balls = 5;
        int share = 3;
        BigInteger answer = BigInteger.ZERO;

        BigInteger ballsFactorial = factorial(balls);
        BigInteger shareFactorial = factorial(share);
        BigInteger ballsMinusShareFactorial = factorial(balls - share);;

        answer = ballsFactorial.divide(shareFactorial.multiply(ballsMinusShareFactorial));
    }

    private static BigInteger factorial(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
