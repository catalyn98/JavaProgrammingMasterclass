package CodingChallenge_13;

public class LastDigitChecker_8 {

    public static boolean hasSameLastDigit(int fDigit, int sDigit, int lDigit) {
        if((isValid(fDigit) && isValid(sDigit) && isValid(lDigit))) {
            return fDigit % 10 == sDigit % 10 || sDigit % 10 == lDigit % 10 || lDigit % 10 == fDigit % 10;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return(number >= 10 && number <= 1000);
    }
}
