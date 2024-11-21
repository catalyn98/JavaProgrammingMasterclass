package Week5.Subgrupa_1621B.exercise7;

import java.util.Scanner;
//Code wrote by Onita Dan Alex

public class ArrayOperations {

    public static int arrayMinValue(int [] array){
        int minValue = array[0];
        for (int i=1; i<array.length; i++){
            if (minValue>array[i])
                minValue=array[i];
        }
        return minValue;
    }

    public static int arrayMaxValue(int [] array){
        int maxValue = array[0];
        for (int i=1; i<array.length; i++){
            if (maxValue<array[i])
                maxValue=array[i];
        }
        return maxValue;
    }

    public static double arrayAverage(int [] array){
        int n = array.length;
        int sum = 0;
        for (int i:array){  //for (int i=0; i<array.length; i++)
            sum = sum + i;
        }
        return (double) sum/n;
    }

    public static void bubbleSort(int [] array){
        int n = array.length;
        for (int i=0; i<n-1 ; i++){
            for (int j=0; j<n-1-i; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati nr de elemente: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Dati elementele tabloului: ");
        for(int i =0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Cel mai mic element al tabloului este " + arrayMinValue(array));
        System.out.println("Cel mai mare element al tabloului este " + arrayMaxValue(array));
        System.out.println("Media aritmetica a tabloului este " + arrayAverage(array));
        System.out.println("Tabloul inainte de sortare este: " );
        for (int i:array){
            System.out.print(i+" ");

        }
        bubbleSort(array);
        System.out.println("\nElementele tabloului sortat sunt: ");
        for (int i:array){
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
