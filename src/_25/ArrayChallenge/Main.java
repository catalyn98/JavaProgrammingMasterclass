package _25.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] generateArray(int lengthTheArray) {
        Random random = new Random();
        int[] myArray = new int[lengthTheArray];
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(99);
        }
        return myArray;
    }

    public static void main(String[] args) {

        int[] generatedArray = generateArray(10);
        System.out.println("Generated array " + Arrays.toString(generatedArray));
        Arrays.sort(generatedArray);
        System.out.println("Sorted array    " + Arrays.toString(generatedArray));
        System.out.print("Sorted array in ascending order [ ");
        for(int i = generatedArray.length - 1; i >= 0; i--) {
            System.out.print(generatedArray[i] + " ");
        }
        System.out.print("]");
    }
}