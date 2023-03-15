package _13.CodingChallenge;

public class LargestPrime_13 {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;
                }
            }
            return number;
        }
    }
}
