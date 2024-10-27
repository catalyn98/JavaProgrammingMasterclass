package Week4.Subgrupa_1721A.exercise3;
import java.util.Scanner;
//Code wrote by Blidar Larisa
public class ServerCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul total de linii de cod pe care serverul trebuie sa le proceseze: ");
        int totalLinesOfCode = scanner.nextInt();
        System.out.println("Introdu capacitatea serverului de procesare: ");
        int linesPerServer = scanner.nextInt();
        double totalNumberOfServers = (double)totalLinesOfCode/linesPerServer;
        //rotunjim numarul de servere necesare in sus
        int numberOfNedeedServer = (int) Math.ceil(totalNumberOfServers);
        System.out.println("Numarul necesar de servere este: " + numberOfNedeedServer);
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
