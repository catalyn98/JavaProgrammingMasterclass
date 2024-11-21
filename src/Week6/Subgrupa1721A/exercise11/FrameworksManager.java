package Week6.Subgrupa1721A.exercise11;

import java.util.ArrayList;
import java.util.Scanner;
//Code wrote by Covaci Andrei

public class FrameworksManager {
    public static void main(String[] args) {
        ArrayList<String> frameworks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            //Afiseaza meniu
            System.out.println("\n1.Adauga un framework");
            System.out.println("2.Sterge un framework");
            System.out.println("3.Cauta un framework");
            System.out.println("4.Afiseaza toate framework-urile din ArrayList");
            System.out.println("5.Iesire din program");
            int optiune = scanner.nextInt();
            scanner.nextLine();
            switch (optiune){
                case 1:
                    //Adaugare framework in lista
                    System.out.println("Dati titlul framework-ului pentru a-l adauga in lista");
                    String frameworkToAdd = scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    break;
                case 2:
                    //Stergere framework din lista
                    System.out.println("Dati titlul framework-ului pe care doriti sa il stergeti");
                    String frameworkToDelete = scanner.nextLine();
                    if(frameworks.remove(frameworkToDelete)){
                        System.out.println("Framework-ul introdus a fost sters din lista");
                    }else{
                        System.out.println("Framework-ul introdus nu exista");
                    }
                    break;
                case 3:
                    //Cauta un framework in lista
                    System.out.println("Introduceti numele framework-ului pentru a vedea daca exista in lista");
                    String frameworkToSearch = scanner.nextLine();
                    if (frameworks.contains(frameworkToSearch)){
                        System.out.println("Framework-ul cautat exista in lista");
                    }else{
                        System.out.println("Framework-ul cautat nu exista in lista");
                    }
                    break;
                case 4:
                    //Afisare toate framework-urile
                    System.out.println("ArrayList-ul contine urmatoarele framework-uri: ");
                    if (frameworks.isEmpty()){
                        System.out.println("ArrayList-ul este gol");
                    }else{
                        for(String framework:frameworks){
                            System.out.print(framework + " ");
                        }
                    }break;
                case 5:
                    //Iesire din executie
                    System.out.println("Executia programului s-a incheiat");
                    scanner.close();
                    return;
                default:
                    System.out.println("Optiunea introdusa nu exista");
            }
        }
    }
}
