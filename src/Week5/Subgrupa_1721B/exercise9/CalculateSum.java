package Week5.Subgrupa_1721B.exercise9;

import java.util.Scanner;
//Doba Bogdan-Darius
public class CalculateSum {
    public static void main(String[] args)
    {
        System.out.println("Introduceti dimensiunea tabloului: ");
        Scanner scanner =new Scanner(System.in);
        int dim=scanner.nextInt();
        int[] array=new int[dim];
        System.out.println("Introduceti elementele tabloului: ");
        for(int i=0;i<dim;i++)
            array[i]=scanner.nextInt();
        System.out.println("Suma tabloului este: "+calculateSum(array,0));
    }
    public static int calculateSum(int[] array,int index)
    {
        //caz de baza
        if(index==array.length) return 0;
        return array[index]+calculateSum(array,index+1);
    }
}
