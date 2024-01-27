import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator1 = BigInteger.ONE;
        BigInteger denominator2 = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= balls - share; i++) {
            denominator1 = denominator1.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            denominator2 = denominator2.multiply(BigInteger.valueOf(i));
        }

        BigInteger result = numerator.divide(denominator1.multiply(denominator2));
        return result.intValue();
    }
}