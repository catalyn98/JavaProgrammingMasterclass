package Week5.Subgrupa_1721A.exercise7;

import java.util.Scanner;
//Code wrote by Bene Daniel Andrei

public class ArrayOperations {
    public static int findMinValue(int[] numere){
        int min = numere[0];
        for(int i = 1; i<numere.length; i++){
            if(numere[i] < min){
                min = numere[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] numere){
        int max = numere[0];
        for(int i = 1; i<numere.length; i++){
            if(numere[i] > max){
                max = numere[i];
            }
        }
        return max;
    }

    public static double avrerageArray(int[] numere){
        int sum = 0;
        double medie;
        for(int i = 0; i<numere.length; i++){
            sum += numere[i];//suma = suma + numere[i]
        }
        return (double) sum / numere.length;
    }

    public static void bubbleSort(int[] numere){
        int n = numere.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(numere[i] > numere[j]){
                    int aux = numere[i];
                    numere[i] = numere[j];
                    numere[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Introduceti dimensiunea tabloului: ");
        int n = scanner.nextInt();
        int[] numere = new int[n];
        System.out.println("Introduceti elementele tabloului: ");
        for(i = 0; i<n; i++){
            System.out.println("numere[" + i + "] = ");
            numere[i] = scanner.nextInt();
        }
        System.out.println("Cel mai mic numar: " + findMinValue(numere));
        System.out.println("Cel mai mare numar: " + findMaxValue(numere));
        System.out.printf("Media aritmetica: %f", avrerageArray(numere));
        System.out.print("Elementele nesortate ale tabloului sunt: ");
        for(int j: numere){
            System.out.print(j + " ");
        }
        System.out.println();
        bubbleSort(numere);
        System.out.println("Elementele sortate ale tabloului sunt: ");
        for(int j: numere){
            System.out.print(j + " ");
        }
    }
}
