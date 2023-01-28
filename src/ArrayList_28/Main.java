package ArrayList_28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record PCItem(String name, String model, int numberOfPieces) {
    public PCItem(String name) {
        this(name, "generic model", 0);
    }

    @Override
    public String toString() {
        return "\tname='" + name + '\'' +
                "\tmodel='" + model + '\'' +
                "\tnumberOfPieces=" + numberOfPieces + "\n";
    }
}

public class Main {

    public static void main(String[] args) {
        Object[] pcItemArray1 = new Object[3];
        pcItemArray1[0] = new PCItem("motherboard");
        pcItemArray1[1] = new PCItem("monitor");
        // System.out.println(Arrays.toString(pcItemArray1));

        // BAD APPROACH
        // if we don't specify a type
        // it's going to use the Object class by default
        ArrayList pcItemArrayList1 = new ArrayList(); // because this declaration is too generic
        pcItemArrayList1.add(new PCItem("mouse"));
        pcItemArrayList1.add("keyboard"); // we can add any value of any type of the date to the array list
        // System.out.println(pcItemArrayList1); // Output [PCItem[name=mouse, model=generic model, numberOfPieces=0], keyboard]

        // GOOD APPROACH
        ArrayList<PCItem> pcItemArrayList2 = new ArrayList<>();
        pcItemArrayList2.add(new PCItem("web cam"));
        pcItemArrayList2.add(new PCItem("suit case"));
        pcItemArrayList2.add(new PCItem("cooler"));
        // pcItemArrayList2.add("microphone"); <- this generate an error
        // because we provided String, but expected to receive an object of type PCItem
        System.out.println(pcItemArrayList2);

        // add a new item on index position 0
        // add method will add the item amd move the other items to the right with one position
        pcItemArrayList2.add(0, new PCItem("RAM memory"));
        System.out.println("_".repeat(70));
        System.out.println(pcItemArrayList2);

        // set a new item on index position 0
        // set method will replace (override) the first item in the array list
        pcItemArrayList2.set(0, new PCItem("another RAM memory"));
        System.out.println("_".repeat(70));
        System.out.println(pcItemArrayList2);

        // remove an item from the array list
        // remove method will delete the first item in the array list
        // you can pass as an argument the index or the value
        pcItemArrayList2.remove(0);
        System.out.println("_".repeat(70));
        System.out.println(pcItemArrayList2);

        // this is an array of strings
        String[] arrayOfFruits = {"apples", "bananas", "peach", "strawberry", "pear"};
        List<String> listOfFruits = List.of(arrayOfFruits); // List.of(arrayOfFruits) transform the array into a list of string
        System.out.println("_".repeat(70));
        System.out.println(listOfFruits);
        // list.add("lemon"); <- this generate an error
        // because List.of(array) return an unmodifiable list

        ArrayList<String> fruitsList = new ArrayList<>(listOfFruits);
        fruitsList.add("grapes");
        fruitsList.add("cherry");
        System.out.println("_".repeat(70));
        System.out.println(fruitsList);

        // get an item from the array list
        System.out.println("_".repeat(70));
        System.out.println("First item from the array list is " + fruitsList.get(0));

        if(fruitsList.contains("cherry")) {
            System.out.println("_".repeat(70));
            System.out.println("The list contains cherry");
        } else {
            System.out.println("_".repeat(70));
            System.out.println("The list doesn't contain this item");
        }

        System.out.println("_".repeat(70));
        System.out.println("The index for strawberry from the array list is " + fruitsList.indexOf("strawberry"));

        // sort in alphabetical order the items of the array list
        fruitsList.sort(Comparator.naturalOrder());
        System.out.println("_".repeat(70));
        System.out.println(fruitsList);

        fruitsList.sort(Comparator.reverseOrder());
        System.out.println("_".repeat(70));
        System.out.println(fruitsList);
    }
}