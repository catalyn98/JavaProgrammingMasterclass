import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        String numberString = Integer.toString(n);
        int[] digits = new int[numberString.length()];
        int intermediate;

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        for (int i = 0; i  <= digits.length; i++) {
            System.out.print(digits[i] + " ");
            intermediate = digits[2];
            digits[2] = digits[6];
            digits[6] = intermediate;
            System.out.println("value for intermediate " + intermediate);
        }



        System.out.println("After the change");
        for (int i = 0; i  <= digits.length; i++) {
            System.out.println(digits[i]);
        }

        scanner.close();
    }
}
