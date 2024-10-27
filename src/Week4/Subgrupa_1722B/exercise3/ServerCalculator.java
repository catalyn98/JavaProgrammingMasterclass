package Week4.Subgrupa_1722B.exercise3;
import java.util.Scanner;
//Code wrote by Perte Lavinia-Ioana-Maria
public class ServerCalculator {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul de linii de cod ce trebuie procesate:");
        int totalLinesOfCode=scanner.nextInt();
        System.out.println("Introduceti capacitatea de procesare a serverului:");
        int linesPerServer=scanner.nextInt();
        //Calculam numarul de servere necesare
        double serverNeeded=(double)totalLinesOfCode/linesPerServer;
        //Rotunjim in sus numarul de servere necesare
        int roundedNeededServer=(int)Math.ceil(serverNeeded);
        System.out.println("Numarul necesar de servere este: "+roundedNeededServer);
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
