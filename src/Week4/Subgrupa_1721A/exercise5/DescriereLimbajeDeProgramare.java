package Week4.Subgrupa_1721A.exercise5;
import java.util.Scanner;
//Code wrote by Codreanu Andrei Vasile
public class DescriereLimbajeDeProgramare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 5: ");
        int numarIndiceLimbaj = scanner.nextInt();
        switch (numarIndiceLimbaj){
            case 1:
                System.out.println("Java - un limbaj popular, orientat pe obiect, folosit pe scară largă pentru dezvoltarea aplicațiilor enterprise.");
                break;
            case 2:
                System.out.println("Python - un limbaj de programare foarte utilizat pentru automatizări, analiză de date, machine learning și web development.");
                break;
            case 3:
                System.out.println("JavaScript - un limbaj de scripting folosit pentru a crea aplicații web interactive și dinamice.");
                break;
            case 4:
                System.out.println("C++ - un limbaj de programare utilizat în dezvoltarea de sisteme, aplicații pentru Windows și jocuri.");
                break;
            case 5:
                System.out.println("Ruby - un limbaj dinamic și ușor de învățat, cunoscut pentru framework-ul său web, Ruby on Rails.");
                break;
            default:
                System.out.println("Eroare!");
        }
        // pentru a elibera resursele asociate cu Scanner
        /* este o bună practică să închizi scannerul pentru a preveni scurgerile de resurse
           și pentru a evita eventuale erori legate de gestionarea resurselor.*/
        scanner.close();
    }
}
