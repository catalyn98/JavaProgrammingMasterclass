package LinkedList_30;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void addMoreElements(LinkedList<String> list) {

        // Linked list can be used as different types of data collections
        // The LinkedList class has all the same methods as the ArrayList class because they both implement the List interface
        // --- Array List ---
        list.add("Bucharest");
        list.addFirst("Berlin"); // priority 3
        list.addLast("Los Angeles");

        // Also Linked list implement the Queue and Stack methods
        // --- Queue ---
        // Queue - it is based on first-in-first-out principle
        // poll - removes from head
        // offer - insert at tail
        list.offer("Denver");
        list.offerFirst("New York"); // priority 2
        list.offerLast("Sydney");

        // --- Stack ---
        // Stack - it is based on principle last-in-first-out principle
        // push - insert an element at the top of stack
        // pop - remove an element from the top of stack
        list.push("London"); // priority 1
    }

    public static void removeElements(LinkedList<String> list) {

        // --- Array List ---
        list.remove("Los Angeles");
        list.removeFirst();
        list.removeLast();

        // --- Queue ---
        list.poll();
        list.pollFirst();
        list.pollLast();

        // --- Stack ---
        list.pop();
    }

    public static void gettingElements(LinkedList<String> list) {
        // ArrayList retrieval method
        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());
        System.out.println("London is at position = " + list.indexOf("London"));
        System.out.println("Sydney is at position = " + list.lastIndexOf("Sydney"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary1(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("--> From: " + list.get(i) + " to " + list.get(i + 1));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town );
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> listIterator = list.listIterator(1);
        while(listIterator.hasNext()) {
            var town = listIterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {
        // The iterator provides a safe way to remove elements, while still iterating through the list
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            // System.out.println(iterator.next());
            if(iterator.next().equals("Berlin")) {
                // list.remove() <- this generate an error
                iterator.remove();
            }
        }
    }

    // Iterator vs. ListIterator
    // Iterator supports the remove method
    // ListIterator supports remove, add and set methods

    public static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
            // System.out.println(iterator.next());
            if(iterator.next().equals("Berlin")) {
                // list.remove() <- this generate an error
                iterator.remove();
            }
            iterator.add("San Francisco");
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        // Another way to declare a linked list
        // var placesToVisit = new LinkedList<String>();

        // Add more elements
        addMoreElements(placesToVisit);
        // System.out.println(placesToVisit);

        // Remove elements
        // removeElements(placesToVisit);
        // System.out.println(placesToVisit);
        // gettingElements(placesToVisit);
        // printItinerary1(placesToVisit);
        // printItinerary2(placesToVisit);
        // printItinerary3(placesToVisit);
        // testIterator(placesToVisit);
        // System.out.println(placesToVisit);

        testListIterator(placesToVisit);
    }
}