package Week4.Subgrupa_1721A.exercise4;
import java.util.Scanner;
//Code wrote by Blidar Larisa
public class OreDeProgramare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul de ore petrecut programand: ");
        int numarDeOre = scanner.nextInt();
        if(numarDeOre <= 2)
            System.out.println("Programator Junior");
        else if(numarDeOre >= 3 && numarDeOre <= 5)
            System.out.println("Programator Mid");
        else if(numarDeOre >= 6 && numarDeOre <= 8)
            System.out.println("Programator Senior");
        else
            System.out.println("Valoarea introdusă nu se află în nici un interval");
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
