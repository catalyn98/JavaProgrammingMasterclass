package Week4.Subgrupa_1621B.ex3;
import java.util.Scanner;
//Code wrote by Polevoi Florin
public class ServerCalculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul de lini de cod: ");
        int totalLinesOfCodes = scanner.nextInt();
        System.out.println("Introduceti capacitatea unui server de lucru: ");
        int linesPerServer = scanner.nextInt();
        //calcularea numar de server necesare
        double serverNeeded = (double) totalLinesOfCodes/linesPerServer;
        //rotunjim in sus
        int numarulRotunjitDeServere = (int)Math.ceil(serverNeeded);
        System.out.println("Numarul necesar de servere este: " + numarulRotunjitDeServere);
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
