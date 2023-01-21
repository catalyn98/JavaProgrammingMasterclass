package CodingChallenge_13;

public class FactorPrinter_9 {
    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");
        else
            for(int i = 1; i <= number; i++) {
                if(number % i == 0)
                    System.out.print(i + " ");
            }
    }
}
