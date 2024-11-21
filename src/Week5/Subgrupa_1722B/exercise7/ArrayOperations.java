package Week5.Subgrupa_1722B.exercise7;

import java.util.Scanner;
//Code wrote by Tamas Rares

public class ArrayOperations {
    public static void bubbleSort(int []array)
    {
        int n  = array.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static double calculateAverage(int []array)
    {
        int suma = 0;
        for(int i:array){
            suma = suma + i;
            //suma+= i;

        }
        return (double)suma / array.length;
    }

    public static int findMaxValue(int []array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue)
                maxValue = array[i];
        }
        return maxValue;
    }

    public static int findMinValue(int []array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<minValue)
                minValue = array[i];
        }
        return minValue;
    }

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati dimensiunea tabloului: ");
        int dimensiune = scanner.nextInt();
        int []array = new int[dimensiune];
        System.out.println("Introduceti elem. tabloului: ");
        for(int i=0;i<dimensiune;i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Cel mai mic element este:" + findMinValue(array));
        System.out.println("Cel mai mare element este: " + findMaxValue(array));
        System.out.println("Media este: " + calculateAverage(array));
        System.out.println("Elementele tabloului nesortat sunt: ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+ " ");
        bubbleSort(array);
        System.out.println("Elementele tabloului sortat sunt: ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+ " ");
        scanner.close();
    }
}
