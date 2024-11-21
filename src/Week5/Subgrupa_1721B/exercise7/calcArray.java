package Week5.Subgrupa_1721B.exercise7;
//Cozi David Cristian
import java.util.Scanner;

public class calcArray {
    public static int findMinValue(int[] array)
    {
        int min=array[0];
        for(int i=1; i<array.length; i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] array)
    {
        int max=array[0];
        for(int i=1; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }

    public static double calculateAverage(int[] array)
    {
        int suma=0;
        for(int num:array)
        {
            suma+=num;//suma=suma+num
        }
        return suma/array.length;
    }

    public static void bubbleSort(int[] array)
    {
        boolean sortat;
        do
        {
            sortat=false;
            for(int i=0; i<array.length-1; i++)
            {
                if(array[i]>array[i+1])
                {
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    sortat=true;
                }
            }

        }while(sortat);
    }
    public static void main(String[] arg)
    {
        System.out.print("Dati numarul de elemente a tabloului: ");
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        int []array=new int[n];
        System.out.println("Dati elementele tabloului: ");
        for(int i=0; i<array.length; i++)
        {
            array[i]=scanner.nextInt();
        }

        System.out.println("Cel mai mic element este: "+ findMinValue(array));
        System.out.println("Cel mai amre element este: "+ findMaxValue(array));
        System.out.println("Media aritmetica este: "+ calculateAverage(array));
        System.out.println("Tablou nesortat: ");
        for(int num:array)
        {
            System.out.print(num+" ");
        }
        System.out.println("Tabloul sortat: ");
        bubbleSort(array);
        for(int num:array)
        {
            System.out.print(num+" ");
        }
    }
}
