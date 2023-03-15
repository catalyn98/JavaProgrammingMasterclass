package _5.FloatAndDoublePrimitives;

public class FloatAndDoublePrimitives {

    public static void main(String[] args) {
        System.out.println("Min float " + Float.MIN_VALUE);
        System.out.println("Max float " + Float.MAX_VALUE);
        System.out.println("A float variable has a width of " + Float.SIZE + " and " + Float.BYTES + " bytes");

        System.out.println("Min double " + Float.MIN_VALUE);
        System.out.println("Max double " + Float.MAX_VALUE);
        System.out.println("A double variable has a width of " + Double.SIZE + " and " + Double.BYTES + " bytes");

        double myDouble = 10.99;
        System.out.println(myDouble);

        float myFloat = 10.985f;
        System.out.println(myFloat);

        long myLongVariable = 21474836471234L;
        System.out.println(myLongVariable);

        float myAnotherFloatVariable = (float) 10.9678;
        System.out.println(myAnotherFloatVariable);
    }
}
