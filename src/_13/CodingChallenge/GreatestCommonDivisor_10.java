package _13.CodingChallenge;

public class GreatestCommonDivisor_10 {

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int n = 1, gcd = 1;
        if (firstNumber < 10 || secondNumber < 10)
            return -1;
        else {
            while ((n < firstNumber) || (n < secondNumber)) {
                if ((firstNumber % n == 0) && (secondNumber % n == 0))
                    gcd = n;
                n++;
            }
        }
        System.out.println("\n" + gcd);
        return gcd;
    }
}
