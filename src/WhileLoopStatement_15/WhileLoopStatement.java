package WhileLoopStatement_15;

public class WhileLoopStatement {
    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }

    public static void theWhileLoopChallenge() {
        int start = 5;
        int end = 20;
        int totalNumbersOfEvenNumbers = 0;
        int totalNumbersOfOddNumbers = 0;

        while (start <= end) {
            if(isEvenNumber(start)) {
                System.out.print(start + " ");
                totalNumbersOfEvenNumbers++;
                int k;
            } else
                totalNumbersOfOddNumbers++;
            if(totalNumbersOfEvenNumbers >= 5)
                break;
            start++;
        }
        System.out.println("\nI found " + totalNumbersOfEvenNumbers + " even numbers.");
        System.out.println("\nI found " + totalNumbersOfOddNumbers + " odd numbers.");
    }

    public static int sumDigits(int number) {
        int sum = 0, digit;

        if ( number < 0) {
            return -1;
        }
        else {
            while(number > 0) {
                digit = number % 10;
                System.out.println("digit is " + digit);
                sum = sum + digit;
                number = number / 10;
                System.out.println("now number is " + number);
                System.out.println("-------------------------");
            }
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
}
