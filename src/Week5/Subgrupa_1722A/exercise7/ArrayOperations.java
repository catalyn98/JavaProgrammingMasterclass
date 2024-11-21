package Week5.Subgrupa_1722A.exercise7;

import java.util.Scanner;
//Code wrote by Istoc Adelin

public class ArrayOperations {
    public static void bubleSort(int []array){
        int length=array.length;
        for (int i=0;i<length-1;i++){
            for (int j=0;j<length-1-i;j++){
                if(array[j]>array[j+1]){
                    int aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
    }

    public static double calculateAverage(int []array){
        int suma=0;
        for (int i:array){
            suma=suma+i; //suma+=i
        }
        return (double) suma/ array.length;
    }

    public static int findMaxValue(int []array){
        int maxValue=array[0];
        for(int i=1;i<array.length;i++){
            if (array[i]>maxValue){
                maxValue=array[i];
            }
        }
        return maxValue;
    }

    public static int findMinValue(int []array){
        int minValue=array[0];
        for(int i=1;i<array.length;i++){
            if (array[i]<minValue){
                minValue=array[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati dimensiunea tabloului: ");
        int dimenisune=scanner.nextInt();
        int []array=new int[dimenisune];
        System.out.println("Introduceti elementele tabloului: ");
        for (int i=0; i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Cel mai mare element al tabloului este: "+findMaxValue(array));
        System.out.println("Cel mai mic element al tabloului este: "+findMinValue(array));
        System.out.println("Media artimetica este: "+calculateAverage(array));
        System.out.println("Elementele tabloului nesortat sunt: ");
        for (int i:array){
            System.out.print(i+" ");
        }
        bubleSort(array);
        System.out.println("Elementele tabloului sortat sunt: ");
        for (int i:array){
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
