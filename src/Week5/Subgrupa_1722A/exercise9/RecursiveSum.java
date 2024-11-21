package Week5.Subgrupa_1722A.exercise9;

import java.util.Scanner;
//Code wrote by Lauran Cezar

public class RecursiveSum {
    public static int recursiveSum(int []array,int index){
        //cazul de baza
        if(index==array.length)
            return 0;
        return array[index] + recursiveSum(array,index+1);
    }

    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti dimensiunea sirului");
        int dimensiune=scanner.nextInt();
        int[] array=new int[dimensiune];
        System.out.println("Introduceti elementele tabloului");
        for(int i:array){
            array[i]=scanner.nextInt();
        }
        System.out.println("Suma elementelor din tablou este " + recursiveSum(array,0));
        scanner.close();
    }
}
