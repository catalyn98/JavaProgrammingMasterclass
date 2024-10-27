package Week4.Subgrupa_1621A.ex3;
import java.util.Scanner;
//Code wrote by Bodea Luca
public class ServerCalculator {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul total de linii de cod: ");
        int totalLinesOfCode = scanner.nextInt();
        System.out.println("Introduceti capacitatea de procesare a serverului: ");
        int maximumCapacity = scanner.nextInt();
        double numarDeServerNecesare = (double)totalLinesOfCode/maximumCapacity;
        // Rotunjim in sus numarul obtinut.
        int numarRotunjitDeServere = (int)Math.ceil(numarDeServerNecesare);
        System.out.println("Numarul necear de servere este: "+ numarRotunjitDeServere);
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
