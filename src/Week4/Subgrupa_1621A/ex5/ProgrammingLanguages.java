package Week4.Subgrupa_1621A.ex5;
import java.util.Scanner;
//Code wrote by Foica David-Andrei
public class ProgrammingLanguages {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 5: 1. Java, 2. Python, 3. JavaScript, 4. C++, 5. Ruby");
        int numarOptiune = scanner.nextInt();
        switch(numarOptiune){
            case 1:
                System.out.println("o\t1: Java - un limbaj popular, orientat pe obiect, folosit pe scară largă pentru dezvoltarea aplicațiilor enterprise.");
                break;
            case 2:
                System.out.println("o\t2: Python - un limbaj de programare foarte utilizat pentru automatizări, analiză de date, machine learning și web development.");
                break;
            case 3:
                System.out.println("o\t3: JavaScript - un limbaj de scripting folosit pentru a crea aplicații web interactive și dinamice.");
                break;
            case 4:
                System.out.println("o\t4: C++ - un limbaj de programare utilizat în dezvoltarea de sisteme, aplicații pentru Windows și jocuri.");
                break;
            case 5:
                System.out.println("o\t5: Ruby - un limbaj dinamic și ușor de învățat, cunoscut pentru framework-ul său web, Ruby on Rails.");
                break;
            default:
                System.out.println("Numarul introdus nu corespunde niciunui optiuni.");
        }
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
