package CodingChallenge_13;

public class EvenDigitSum_6 {

    public static int getEvenDigitSum(int number) {
        int lastDigit, sum = 0;

        if (number < 0)
            return -1;
        else
        {
            while(number != 0) {
                lastDigit = number % 10;
                number = number / 10;
                System.out.println(lastDigit);
                if(lastDigit % 2 == 0)
                    sum = sum + lastDigit;
            }
        }
        return sum;
    }
}
