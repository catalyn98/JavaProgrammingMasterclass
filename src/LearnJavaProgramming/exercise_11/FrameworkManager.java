package LearnJavaProgramming.exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class FrameworkManager {
    public static void main(String[] args) {
        ArrayList<String> frameworks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Afișează meniu
            System.out.println("\n1. Adaugă un framework");
            System.out.println("2. Șterge un framework");
            System.out.println("3. Caută un framework");
            System.out.println("4. Afișează toate framework-urile");
            System.out.println("5. Ieșire");
            System.out.print("Alege o opțiune: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character left by nextInt()

            switch (choice) {
                case 1:
                    // Adaugă un framework
                    System.out.print("Introduceți numele framework-ului frontend de adăugat: ");
                    String frameworkToAdd = scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    System.out.println(frameworkToAdd + " a fost adăugat în listă.");
                    break;

                case 2:
                    // Șterge un framework
                    System.out.print("Introduceți numele framework-ului frontend de șters: ");
                    String frameworkToRemove = scanner.nextLine();
                    if (frameworks.remove(frameworkToRemove)) {
                        System.out.println(frameworkToRemove + " a fost șters din listă.");
                    } else {
                        System.out.println(frameworkToRemove + " nu a fost găsit în listă.");
                    }
                    break;

                case 3:
                    // Caută un framework
                    System.out.print("Introduceți numele framework-ului frontend de căutat: ");
                    String frameworkToSearch = scanner.nextLine();
                    if (frameworks.contains(frameworkToSearch)) {
                        System.out.println(frameworkToSearch + " este în listă.");
                    } else {
                        System.out.println(frameworkToSearch + " nu a fost găsit în listă.");
                    }
                    break;

                case 4:
                    // Afișează toate framework-urile
                    System.out.println("Lista framework-urilor frontend:");
                    if (frameworks.isEmpty()) {
                        System.out.println("Lista este goală.");
                    } else {
                        for (String framework : frameworks) {
                            System.out.println("- " + framework);
                        }
                    }
                    break;

                case 5:
                    // Ieșire din program
                    System.out.println("Ieșire din program. La revedere!");
                    scanner.close();
                    return;

                default:
                    // Opțiune invalidă
                    System.out.println("Opțiune invalidă. Vă rugăm să alegeți din nou.");
            }
        }
    }
}
