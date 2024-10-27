package LearnJavaProgramming.exercise_9;

import java.util.Scanner;

public class RecursiveSum {
    // Method to calculate the sum of array elements using recursion
    public static int calculateSum(int[] array, int index) {
        if (index == array.length) {
            return 0;  // Base case: end of the array
        }
        return array[index] + calculateSum(array, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of elements using recursion
        int sum = calculateSum(array, 0);

        System.out.println("Suma elementelor din array este: " + sum);
    }
}
