package Week4.Subgrupa_1722B.exercise5;
import java.util.Scanner;
//Code wrote by Ticarat Andrei Ionut
public class ProgrammingLanguage {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un nr. de la 1 - 5\n" +
                "1. Java\n" +
                "2. Python\n" +
                "3. JavaScript\n" +
                "4. C++\n" +
                "5. Ruby");
        int optiune = scanner.nextInt();
        switch (optiune){
            case 1 -> System.out.println("Java - un limbaj popular, orientat pe obiect, folosit pe scară largă pentru dezvoltarea aplicațiilor enterprise.");

            case 2 -> System.out.println("Python - un limbaj de programare foarte utilizat pentru automatizări, analiză de date, machine learning și web development.");

            case 3 -> System.out.println("JavaScript - un limbaj de scripting folosit pentru a crea aplicații web interactive și dinamice.");

            case 4 -> System.out.println("C++ - un limbaj de programare utilizat în dezvoltarea de sisteme, aplicații pentru Windows și jocuri.");

            case 5 -> System.out.println("Ruby - un limbaj dinamic și ușor de învățat, cunoscut pentru framework-ul său web, Ruby on Rails.");

            default -> System.out.println("Nr. tastat nu corespunde");
        }
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
