package Week6.Subgrupa1621B.exercise11;

import java.util.ArrayList;
import java.util.Scanner;

//Code wrote by Onita Dan Alex

public class FrameworkManager {
    public static void main(String[] args){
        ArrayList<String> frameworks = new ArrayList<>();
        //ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            //Afiseaza meniul
            System.out.println("\n" + "Meniu: ");
            System.out.println("1-Adauga framework");
            System.out.println("2-Sterge framework");
            System.out.println("3-Cauta Framework");
            System.out.println("4-Afiseaza toate framework-urile");
            System.out.println("5-Iesire din program");
            System.out.println("Alegeti o optiune");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    //adaugare framework
                    System.out.println("Introduceti numele framework-ului: ");
                    String frameworkToAdd = scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    break;
                case 2:
                    //sterge un framework:
                    System.out.println("Introduceti numee framework-ului pe care doriti sa-l stergeti: ");
                    String frameworkToRemove = scanner.nextLine();
                    if (frameworks.remove(frameworkToRemove)){
                        System.out.println("Framework-ul a fost sters din lista.");
                    }
                    else
                        System.out.println("Frameworkul introdus nu exista.");
                    break;
                case 3:
                    //cauta un framework
                    System.out.println("Introduceti numele framework-ului cautat: ");
                    String frameworkToSearch = scanner.nextLine();
                    if (frameworks.contains(frameworkToSearch)){
                        System.out.println("Framework-ul introdus exista in lista.");
                    }
                    else
                        System.out.println("Frameworkul introdus nu exista.");
                    break;
                case 4:
                    //afisare toate framework-urile din lista
                    System.out.println("Framework-urile din lista sunt: ");
                    if (frameworks.isEmpty()){
                        System.out.println("Lista este goala.");
                    }
                    else {
                        //foreach pt iterare
                        for (String framework: frameworks){
                            System.out.print(framework + " ");
                        }
                    }
                    break;

                case 5:
                    //iesire din program
                    System.out.println("La revedere!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Optiunea aleasa nu exista.");
            }
        }
    }
}
