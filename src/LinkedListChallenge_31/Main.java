package LinkedListChallenge_31;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String town, int distance) {

}

public class Main {

    public static void menu() {
        System.out.println("Available actions (select word or letter):\n" +
                "\t\t(F)orward\n" +
                "\t\t(B)ackward\n" +
                "\t\t(L)ist Places\n" +
                "\t\t(M)enu\n" +
                "\t\t(Q)uit\n");
    }

    public static void addPlaceToVisit(LinkedList<Place> list, Place place) {

        for(Place element : list) {
            if(element.town().equalsIgnoreCase(place.town())) {
                System.out.println("This place already exists in the list");
                return;
            }
        }

        int index = 0;
        for(Place p : list) {
            if(place.distance() < p.distance()) {
                list.add(index, place);
                return;
            }
            index++;
        }
        list.add(place);
    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        LinkedList<Place> placeToVisit = new LinkedList<>();

        menu();

        addPlaceToVisit(placeToVisit, new Place("Adelaide", 1374));
        addPlaceToVisit(placeToVisit, new Place("Adelaide", 1374));
        addPlaceToVisit(placeToVisit, new Place("Alice Springs", 2771));
        addPlaceToVisit(placeToVisit, new Place("Brisbane", 917));
        addPlaceToVisit(placeToVisit, new Place("Darwin", 3972));
        addPlaceToVisit(placeToVisit, new Place("Melbourne", 877));
        addPlaceToVisit(placeToVisit, new Place("Perth", 3923));

        placeToVisit.addFirst(new Place("Sydney", 0));

        var iterator = placeToVisit.listIterator();

        while (flag) {
            System.out.print("Choose an option ");
            String menuOption = scanner.nextLine().toUpperCase().substring(0,1);
            switch (menuOption) {
                case "F":
                    System.out.println("User wants to go forward");
                    System.out.println(iterator.next());
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    System.out.println(iterator.previous());
                    break;
                case "L":
                    System.out.println("Places to visit " + placeToVisit);
                    break;
                case "M":
                    menu();
                    break;
                case "Q":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}