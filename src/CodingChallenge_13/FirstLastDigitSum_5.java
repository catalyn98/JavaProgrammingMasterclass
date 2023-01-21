package CodingChallenge_13;

public class FirstLastDigitSum_5 {
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;
        if (number < 0)
            return -1;

        lastDigit = number % 10;

        while(number >= 10) {
            number /= 10;
        }

        return lastDigit + number;
    }
}
