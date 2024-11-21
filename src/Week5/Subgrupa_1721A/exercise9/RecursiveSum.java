package Week5.Subgrupa_1721A.exercise9;

import java.util.Scanner;
//Code wrote by Girz Ionut Alexandru

public class RecursiveSum {
    public static int recursiveSum(int[]array,int index){
        //Conditie de baza
        if(index == array.length){
            return 0;
        }
        return array[index]+recursiveSum(array,index+1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea tabloului: ");
        int n = scanner.nextInt();
        int[] array= new int[n];
        System.out.println("Introduceti elementele tabloului: ");
        for(int i=0;i<n;i++)
            array[i]=scanner.nextInt();
        System.out.println("Suma este: " + recursiveSum(array,0));
        scanner.close();
    }
}
