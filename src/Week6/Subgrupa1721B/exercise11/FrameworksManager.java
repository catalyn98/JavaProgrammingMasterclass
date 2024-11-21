package Week6.Subgrupa1721B.exercise11;

import java.util.ArrayList;
import java.util.Scanner;
//Code wrote by Fret Dario

public class FrameworksManager {
    public static void main(String[] args) {
        ArrayList<String> frameworks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            //afisare meniu
            System.out.println("Apasa tasta 1 pentru adaugare framework");
            System.out.println("Apasa tasta 2 pentru stergere framework");
            System.out.println("Apasa tasta 3 pentru cautare framework");
            System.out.println("Apasa tasta 4 pentru a afisa toate framework-urile");
            System.out.println("Apasa tasta 5 pentru a incheia executia programului");
            //citire optiune
            System.out.println("Introduceti una dintre optiuni");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option)
            {
                case 1:
                    //adaugare framework
                    System.out.println("Introduceti numele framework-ului");
                    String frameworkToAdd = scanner.nextLine();
                    frameworks.add(frameworkToAdd);
                    break;
                case 2:
                    //stergere framework
                    System.out.println("Introduceti numele framework-ului pe care doriti sa-l stergeti");
                    String frameworkToDelete = scanner.nextLine();
                    if (frameworks.remove(frameworkToDelete))
                    {
                        System.out.println("Framework-ul a fost sters din arraylist");
                    }
                    else
                        System.out.println("Framework-ul introdus nu exista in arraylist");
                    break;
                case 3:
                    //cautare framework
                    System.out.println("Introduceti numele framework-ului pentru a vedea daca exista in lista");
                    String frameworkToSearch = scanner.nextLine();
                    if (frameworks.contains(frameworkToSearch))
                        System.out.println("Framework-ul introdus exista in lista");
                    else
                        System.out.println("Framework-ul introdus nu se afla in lista");
                    break;
                case 4:
                    //afisare toate elementele arraylist-ului
                    System.out.println("Arraylist-ul contine urmatoarele framework-uri");
                    if (frameworks.isEmpty())
                        System.out.println("Lista este goala");
                    else
                    {
                        for (String framework:frameworks)
                        {
                            System.out.print(framework+" ");
                        }
                    }
                    break;
                case 5:
                    //iesire din program
                    System.out.println("Executia programului s-a terminat");
                    scanner.close();
                    return;
                default:
                    System.out.println("Valoarea introdusa nu corespunde cu nicio optiune din meniu");
            }
        }
    }
}
