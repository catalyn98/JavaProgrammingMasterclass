package _26.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] readIntegers(int length) {
        int[] myArray = new int[length];
        for(int i = 0; i< myArray.length; i++) {
            System.out.println("Enter number #" + i);
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            myArray[i] = value;
        }
        return myArray;
    }

    public static int findMin(int[] array) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        System.out.print("Enter the dimension of the array ");
        Scanner scanner = new Scanner(System.in);
        int lengthOfTheArray = scanner.nextInt();
        int[] printArray = readIntegers(lengthOfTheArray);
        System.out.println("Unsorted array is " + Arrays.toString(printArray));
        int minValue = findMin(printArray);
        System.out.println("Sorted array is " + Arrays.toString(printArray));
        System.out.println("Min value is " + minValue);
    }
}