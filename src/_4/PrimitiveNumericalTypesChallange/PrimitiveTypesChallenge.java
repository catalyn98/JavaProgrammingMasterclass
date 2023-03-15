package _4.PrimitiveNumericalTypesChallange;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 700;
        int myInt = 189;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("Te sum is " + myLong);
    }
}
