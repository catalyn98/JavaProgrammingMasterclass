package Week6.Subgrupa1621A.exercise9;

import java.util.Scanner;
//Code wrote by Laza Lukas

public class SumArray {
    public static int recursiveSum(int[] array,int index){
        //    Caz de baza
        if (index==array.length)
            return 0;
        return array[index]+recursiveSum(array,index+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea tabloului de elemente: ");
        int dimensiune=scanner.nextInt();
        int[] array= new int[dimensiune];
        System.out.println("Introduceti elementele tabloului: ");
        for (int i =0;i<dimensiune;i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println("Suma elementelor tabloului este: "+recursiveSum(array,0));
    }
}
