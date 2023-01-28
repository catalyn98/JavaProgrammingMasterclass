package ArrayListChallenge_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void programTitle() {
        System.out.println();
        System.out.println("\t\t\t\t\t****************");
        System.out.println("\t\t\t\t\t* Grocery list *");
        System.out.println("\t\t\t\t\t****************");
        System.out.println();
    }

    public static void menu() {
        System.out.println("_".repeat(60));
        System.out.println("""
                    Available actions:
                    \t 0 - to shutdown;
                    \t 1 - to add item(s) to list (comma delimited list);
                    \t 2 - to remove any item(s) (comma delimited list).
                    Enter a number for which action you want to do
                    """);
    }

    public static void addItems(ArrayList<String> groceryItems) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add item(s) [separated items by comma ]:");
        String[] items = scanner.nextLine().split(",");
        // using this approach the list will not be sorted in alphabetical order
        // because we have leading and traveling spaces
        /*groceryItems.addAll(List.of(item));*/
        for(String i : items) {
            String trimmed = i.trim();
            if(!groceryItems.contains(trimmed)) {
                groceryItems.add(trimmed);
            } else {
                System.out.println(trimmed + " already exists");
            }
        }
    }

    public static void removeItems(ArrayList<String> groceryItems) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove item(s) [separated items by comma ]:");
        String[] items = scanner.nextLine().split(",");
        for(String i : items) {
            String trimmed = i.trim();
            if(groceryItems.contains(trimmed)) {
                groceryItems.remove(trimmed);
            } else {
                System.out.println(trimmed + " doesn't exist");
            }
        }
    }

    public static void printGroceriesList(ArrayList<String> groceryList) {
        if(groceryList.isEmpty()) {
            System.out.println("The grocery list is empty ");
        } else {
            System.out.println("The grocery list contains in alphabetical order the next item(s): " + groceryList);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 1;
        ArrayList<String> groceryList = new ArrayList<>();

        programTitle();
        while (option != 0) {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 0 -> {
                    System.out.println("Good bye!");
                }
                case 1 -> {
                    addItems(groceryList);
                }
                case 2 -> {
                    removeItems(groceryList);
                }
                default -> System.out.println("Invalid option");
            }
            groceryList.sort(Comparator.naturalOrder());
            printGroceriesList(groceryList);
        }
    }
}