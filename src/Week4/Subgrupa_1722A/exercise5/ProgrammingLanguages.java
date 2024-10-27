package Week4.Subgrupa_1722A.exercise5;
import java.util.Scanner;
// CODE WROTE BY MARICEAN IULIAN
public class ProgrammingLanguages {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Apasati 1 pentru Java, 2 pentru Python, 3 pentru JavaScript, 4 pentru C++, 5 pentru Ruby");
        int optiune=scanner.nextInt();
        switch(optiune){
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
                System.out.println("Numarul introdus nu corespunde cu nici una dintre optiuni");
        }
        scanner.close();
    }
}
