package Week4.Subgrupa_1722A.exercise3;
//Code wrote by Istoc Adelin
import java.util.Scanner;
public class ServerCalculator {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu numarul total de linii de cod ce trebuie procesate: ");
        int totalLinesOfCode=scanner.nextInt();
        System.out.println("Introdu capacitatea unui server de procesare: ");
        int linesPerServer=scanner.nextInt();
        double numberNeededServer=(double)totalLinesOfCode/linesPerServer;
        //rotunjim in sus numarul necesar de servere
        int roundNeedServer=(int)Math.ceil(numberNeededServer);
        System.out.println("Numarul necesar de servere este: "+roundNeedServer);
    }
}
