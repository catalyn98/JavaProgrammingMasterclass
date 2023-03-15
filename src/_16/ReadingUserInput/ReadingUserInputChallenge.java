package _16.ReadingUserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static int sumOfFiveNumbers() {
        int number, sum =0, counter = 1;
        Scanner scanner = new Scanner(System.in);

        while(counter <= 5) {
            try {
                System.out.println("Enter number #" + (counter));
                number = scanner.nextInt();
                counter++;
                sum = sum + number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
}
