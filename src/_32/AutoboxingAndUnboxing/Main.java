package _32.AutoboxingAndUnboxing;

import java.util.Arrays;

public class Main {

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }

    public static void main(String[] args) {

        // Manual
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        Integer autoboxedInt1 = Integer.valueOf(15); // preferred but unnecessary
        int unboxedInt1 = autoboxedInt1.intValue(); // unnecessary

        // Automatic
        Integer autoboxedInt2 = 15;
        int unboxedInt2 = autoboxedInt2;
        System.out.println(autoboxedInt2.getClass().getName());
        // System.out.println(unboxedInt2.getClass().getName()); <- this generate an error

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));
        System.out.println(characterArray.getClass().getName());
    }
}