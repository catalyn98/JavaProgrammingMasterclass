package CodingChallenge_13;

public class NumberPalindrome_4 {

    public static boolean isPalindrome(int number) {
        int reverse = 0, lastDigit, n = number;

        while(n != 0) {
            lastDigit = n % 10;
            reverse *= 10;
            reverse = reverse + lastDigit;
            n = n / 10;
        }
        System.out.println("number " + number + ", reverse " + reverse);

        return number == reverse;
    }
}
