package LearnJavaProgramming.exercise_5;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege un număr între 1 și 5 pentru a afla despre un limbaj de programare: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Java - un limbaj popular, orientat pe obiect, folosit pe scară largă pentru dezvoltarea aplicațiilor enterprise");
                break;
            case 2:
                System.out.println("Python - un limbaj de programare foarte utilizat pentru automatizări, analiză de date, machine learning și web development.");
                break;
            case 3:
                System.out.println("JavaScript - un limbaj de scripting folosit pentru a crea aplicații web interactive și dinamice.");
                break;
            case 4:
                System.out.println("C++ - un limbaj de programare puternic, utilizat în dezvoltarea de sisteme, aplicații performante și jocuri.");
                break;
            case 5:
                System.out.println("Ruby - un limbaj dinamic și ușor de învățat, cunoscut pentru framework-ul său web, Ruby on Rails.");
                break;
            default:
                System.out.println("Număr invalid! Alege un număr între 1 și 5.");
                break;
        }

        scanner.close();
    }
}
