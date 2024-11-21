package Week6.Subgrupa1621B.exercise9;

import java.util.Scanner;
//Code wrote by Polevoi Florin

public class RecursivSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduceti dimensiunea tabloului: ");
        int dimension = scanner.nextInt();
        int[] array = new int[dimension];
        System.out.println("Introduceti elementele tabloului: ");
        for (int i = 0; i<dimension;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Suma elementelor tabloului este: " + recursivSum(array, 0));
        scanner.close();
    }
    public static int recursivSum(int[] array, int index){
        //Caz de baza
        if (index == array.length)
            return 0;
        return array[index] + recursivSum(array, index + 1);
    }
}
