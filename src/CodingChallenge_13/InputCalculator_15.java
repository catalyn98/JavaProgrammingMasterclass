package CodingChallenge_13;

import java.util.Scanner;

public class InputCalculator_15 {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0, counter = 0;
        double avg;
        System.out.println("Introduce numbers to calculate the sum and the average.");
        System.out.println("Press any letter to close the execution.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String number = scanner.nextLine();
            try {
                int convertedNumber = Integer.parseInt(number);
                sum = sum + convertedNumber;
                counter++;
            } catch(NumberFormatException e) {
                avg = Math.round((double)sum / (double)counter);
                System.out.println("SUM = " + sum + " AVG = " + (int)avg);
                break;
            }
        }
        System.out.println("Counter is " + counter);
    }
}
