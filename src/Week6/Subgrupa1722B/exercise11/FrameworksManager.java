package Week6.Subgrupa1722B.exercise11;

import java.util.ArrayList;
import java.util.Scanner;
//Code wrote by Purdea Daniel

public class FrameworksManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> frameworks=new ArrayList<>();
        while (true) {
            // afisare meniu
            System.out.println("\nApasa tasta 1 pentru adaugare framework");
            System.out.println("Apasa tasta 2 pentru stergere framework");
            System.out.println("Apasa tasta 3 pentru a verifica daca frameworkul exista in lista");
            System.out.println("Apasa tasta 4 pentru a afisa continutul lui array list");
            System.out.println("Apasa tasta 5 pentru a incheia executia programului");
            System.out.println("Alegeti o optiune");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    //adaugare framework
                    System.out.println("Introduceti numele frameworkului pe care doriti sa il adaugati");
                    String frameworkToAdd = scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    break;
                case 2:
                    //stergere framework
                    System.out.println("Introduceti numele framework ului pe care doriti sa il stergeti");
                    String frameworkToRemove = scanner.nextLine();
                    if(frameworks.remove(frameworkToRemove))
                        System.out.println("Framework ul a fost sters");
                    else
                        System.out.println("Framework ul introdus nu exista");
                break;
                case 3:
                    //cautare framework
                    System.out.println("Introduceti numele framework ului pentru a vedea daca exista in lista");
                    String frameworkContains = scanner.nextLine();
                    if(frameworks.contains(frameworkContains))
                        System.out.println("Framework ul introdus exista in lista");
                    else
                        System.out.println("Framework ul nu exista in lista");
                    break;
                case 4:
                    //afisare intreaga lista
                    System.out.println("Array list-ul contine urmatoarele framework uri");
                    if(frameworks.isEmpty())
                        System.out.println("Array list ul nu contine nici un framework");
                    else {
                        for (String framework : frameworks)
                            System.out.print(framework+" ");
                    }
            break;
                case 5:
                    // iesire din program
                    System.out.println("Am incheiat executia programului");
                    scanner.close();
                    return;
            }
        }
    }
}
