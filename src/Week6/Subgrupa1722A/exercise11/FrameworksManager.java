package Week6.Subgrupa1722A.exercise11;

import java.util.ArrayList;
import java.util.Scanner;
//Code wrote by Leah Nicu Alexandru

public class FrameworksManager {
    public static void main(String[] args) {
        ArrayList<String> frameworks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            //afisare meniu
            System.out.println("\n1.Adauga framework");
            System.out.println("2.Sterge framework");
            System.out.println("3.Cauta framework");
            System.out.println("4.Afiseaza toate frameworkurile");
            System.out.println("5.Iesire");
            System.out.println("Introdu o optiune");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                //adaugare framework
                case 1:
                    System.out.println("Introduceti numele frameworkului");
                    String frameworkToAdd = scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    break;
                //stergere framework
                case 2:
                    System.out.println("Introduceti numele frameworkului pentru a l sterge");
                    String frameworkToDelete = scanner.nextLine();
                    if (frameworks.remove(frameworkToDelete))
                        System.out.println("Frameworkul a fost sters");
                    else
                        System.out.println("Frameworkul introdus nu exista");
                    break;
                //cautare framework
                case 3:
                    System.out.println("Introduceti numele frameworkului");
                    String frameworkToSearch = scanner.nextLine();
                    if (frameworks.contains(frameworkToSearch))
                        System.out.println("Frameworkul cautat exista");
                    else
                        System.out.println("Frameworkul introdus nu exista");
                    break;
                //afisare arraylist
                case 4:
                    System.out.println("Arraylistul contine:");
                    if (frameworks.isEmpty())
                        System.out.println("Arraylistul este gol");
                    else {
                        for (String framework : frameworks)
                            System.out.print(framework + " ");
                    }
                    break;
                case 5:
                    System.out.println("Programul s-a incheiat");
                    scanner.close();
                    return;
                default:
                    System.out.println("Optiunea introdusa nu exista");
            }
        }
    }
}
