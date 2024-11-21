package Week6.Subgrupa1621A.exercise11;

import java.util.ArrayList;
import java.util.Scanner;
//Code wrote by Costinas Razvan Iulian

public class FrameworksManager {
    public static void main(String[] args){
        ArrayList<String> frameworks=new ArrayList<>();
        // ArrayList<Integer> numbers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            // Meniu
            System.out.println("Apasati tasta: ");
            System.out.println("1 - Adauga un framework");
            System.out.println("2 - Sterge un framework");
            System.out.println("3 - Cauta un framework");
            System.out.println("4 - Afiseaza toate frameworkurile");
            System.out.println("5 - Iesire din meniu");
            // Citire optiune
            System.out.println("Alege o optiune");
            int option=scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    // Adaugare framework in ArrayList
                    System.out.println("Adaugati un framework in lista");
                    String frameworkToAdd=scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    System.out.println("Frameworkul "+frameworkToAdd+" a fost adaugat in lista");
                    break;
                case 2:
                    // Stergere framework din ArrayList
                    System.out.println("Introduceti numele frameworkului pe care doriti sa il stergeti: ");
                    String frameworkToDelete=scanner.nextLine();
                    if(frameworks.remove(frameworkToDelete)){
                        System.out.println("Frameworkul a fost sters din lista");
                    }
                    else{
                        System.out.println("Frameworkul pe care l-ai introdus nu exista");
                    }
                    break;
                case 3:
                    // Cautare framework in ArrayList
                    System.out.println("Introduceti numele frameworkului pentru a vedea daca exista in lista: ");
                    String frameworkToSearch=scanner.nextLine();
                    if(frameworks.contains(frameworkToSearch)){
                        System.out.println("Frameworkul "+frameworkToSearch+" a fost gasit in lista");
                    }
                    else {
                        System.out.println("Frameworkul nu a fost gasit");
                    }
                    break;
                case 4:
                    // Afisare frameworkuri din lista
                    System.out.println("Lista frameworkurilor frontend: ");
                    if(frameworks.isEmpty()){
                        System.out.println("Lista de frameworkuri este goala");
                    }
                    else {
                        for (String framework:frameworks){
                            System.out.print(framework+" ");
                        }
                    }
                    break;
                case 5:
                    // Iesire din program
                    System.out.println("Am iesit din program. La revedere!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Optiunea introdusa nu exista!");
            }
        }
    }
}
