package Week5.Subgrupa_1621A.exercise7;

import java.util.Scanner;
//Code wrote by Laza Lukas

public class ArrayOperations {
    public static int findMinValue(int [] array) {
        int minValue=array[0];
        for(int i=1;i<array.length;i++){
            if (array[i] < minValue) {
                minValue=array[i];
            }
        }
        return minValue;
    }

    public static  int maxValue(int [] array) {
        int maxValue = array[0];
        for (int i=1;i<array.length;i++) {
            if(array[i] > maxValue) {
                maxValue=array[i];
            }
        }
        return maxValue;
    }

    public static double calculateAverage(int [] array) {
        int sum=0;
        //    For each
        for (int i : array) {
            sum=sum+i;
        }
        return (double) sum/array.length;
    }

    public static void bubbleSort(int [] array) {
        int n = array.length;
        for ( int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente ale taboului: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Introduceti elementele taboului: ");
        for(int i =0;i<n;i++) {
           array[i]= scanner.nextInt();
        }
        System.out.print("Cel mai mic element al tabloului este: " + findMinValue(array));
        System.out.print("Cel mai mare element este: "+ maxValue(array));
        System.out.print("Tabloul inainte de soartare este: ");
        for( int i:array) {
            System.out.print(i+" ");
        }
        bubbleSort(array);
        System.out.println("Tabloul dupa sortare este: ");
        for( int i:array) {
            System.out.print(i + " ");
        }
        System.out.println("Media aritmetica a tabloului este: "+calculateAverage(array));
        scanner.close();
    }
}
