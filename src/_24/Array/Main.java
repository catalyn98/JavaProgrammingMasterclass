package _24.Array;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] myIntArray = new int[length];
        int upperBound = 25;
        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = random.nextInt(upperBound);
        }
        return myIntArray;
    }

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 0;
        myIntArray[1] = 10;
        myIntArray[2] = 20;
        System.out.println(myIntArray[2]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 00.00;
        myDoubleArray[1] = 10.00;
        myDoubleArray[2] = 20.00;
        System.out.println(myDoubleArray[2]);

        String[] myStringArray = {"Anna", "Bob", "Vincent"};
        System.out.println(myStringArray[0]);
        System.out.println(myStringArray.length);

        System.out.print("The elements are ");
        for(int i = 0; i < myStringArray.length; i++) {
            System.out.print(myStringArray[i] + " ");
        }

        int[] anotherIntArray = new int[10];
        // initialize the array using a for loop
        for(int i = 0; i < anotherIntArray.length; i++) {
            anotherIntArray[i] = i*10;
        }

        System.out.println();
        // print the initialized array
        for(int i = 0; i < anotherIntArray.length; i++) {
            System.out.print(anotherIntArray[i] + " ");
        }

        // enhanced for loop
        // for(declaration : collection) {
        //
        // }
        for (int j : anotherIntArray) {
            System.out.print(j + " ");
        }

        System.out.println();
        char[] myCharArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.print("The elements for myCharArray array are ");
        System.out.println(Arrays.toString(myCharArray));

        Object objectVariable = myCharArray;
        if (objectVariable instanceof char[]) {
            System.out.println("objectVariable is an int array");
        } else {
            System.out.println("objectVariable is not an int array");
        }

        int[] myArray = getRandomArray(10);
        System.out.println("The elements of the myArray array are " + Arrays.toString(myArray));
        System.out.println();
        Arrays.sort(myArray);
        System.out.println("Sorted array " + Arrays.toString(myArray));

        int[] secondArray = Arrays.copyOf(myArray, myArray.length);
        System.out.println("The copied array is " + Arrays.toString(secondArray));
    }
}