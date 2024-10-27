package Week4.Subgrupa_1721B.exercise3;
import java.util.Scanner;
//Code wrote by Girz Ionut Alexandru
public class ServerCalculator {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introdu numarul total de linii de cod pentru procesare");
    int totalLinesOfCode = scanner.nextInt();
    System.out.println("Introdu capacitatea de procesare a serverului");
    int linesPerServer = scanner.nextInt();
    //conversie explicita
    double serverNeeded = (double) totalLinesOfCode/linesPerServer;
    // rotunjim in sus numarul de servere necesare
    int roundedNeededServer = (int)Math.ceil(serverNeeded);
    System.out.println("Numarul necesar de servere este: " + roundedNeededServer);
    // pentru a elibera resursele asociate cu Scanner
   /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
      și pentru a evita eventuale erori legate de gestionarea resurselor.*/
    scanner.close();
    }
}
