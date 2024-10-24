package LearnJavaProgramming.exercise_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Computer> computers = new ArrayList<>();
        int option;

        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Adaugă un calculator");
            System.out.println("2. Afișează toate calculatoarele");
            System.out.println("3. Șterge un calculator după nume");
            System.out.println("4. Modifică specificațiile unui calculator");
            System.out.println("5. Ieși din aplicație");
            System.out.print("Alege o opțiune: ");
            option = scanner.nextInt();
            scanner.nextLine();  // consumă newline

            switch (option) {
                case 1:
                    // Adăugare calculator
                    System.out.print("Introdu numele calculatorului: ");
                    String name = scanner.nextLine();
                    System.out.print("Introdu CPU: ");
                    String cpu = scanner.nextLine();
                    System.out.print("Introdu RAM (GB): ");
                    int ram = scanner.nextInt();
                    System.out.print("Introdu HDD (GB): ");
                    int hdd = scanner.nextInt();
                    computers.add(new Computer(name, cpu, ram, hdd));
                    System.out.println("Calculator adăugat cu succes!");
                    break;
                case 2:
                    // Afișare calculatoare
                    System.out.println("Calculatoarele înregistrate:");
                    for (Computer comp : computers) {
                        System.out.println(comp);
                    }
                    break;
                case 3:
                    // Ștergere calculator după nume
                    System.out.print("Introdu numele calculatorului pe care vrei să-l ștergi: ");
                    String nameToDelete = scanner.nextLine();
                    computers.removeIf(comp -> comp.name.equalsIgnoreCase(nameToDelete));
                    System.out.println("Calculatorul a fost șters.");
                    break;
                case 4:
                    // Modificare specificații calculator
                    System.out.print("Introdu numele calculatorului pentru modificare: ");
                    String nameToModify = scanner.nextLine();
                    for (Computer comp : computers) {
                        if (comp.name.equalsIgnoreCase(nameToModify)) {
                            System.out.print("Introdu noul CPU: ");
                            comp.cpu = scanner.nextLine();
                            System.out.print("Introdu noul RAM (GB): ");
                            comp.ram = scanner.nextInt();
                            System.out.print("Introdu noul HDD (GB): ");
                            comp.hdd = scanner.nextInt();
                            scanner.nextLine();  // consumă newline
                            System.out.println("Specificatiile au fost modificate.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ieșire din aplicație.");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Încearcă din nou.");
            }
        } while (option != 5);

        scanner.close();
    }
}
