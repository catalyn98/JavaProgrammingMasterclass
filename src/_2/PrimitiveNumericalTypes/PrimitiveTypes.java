package _2.PrimitiveNumericalTypes;

public class PrimitiveTypes {

    public static void main(String[] args) {
        System.out.println("Min int " + Integer.MIN_VALUE);
        System.out.println("Max int " + Integer.MAX_VALUE);
        System.out.println("An int variable has a width of " + Integer.SIZE + " and " + Integer.BYTES + " bytes");

        System.out.println("Min byte " + Byte.MIN_VALUE);
        System.out.println("Max byte " + Byte.MAX_VALUE);
        System.out.println("A byte variable has a width of " + Byte.SIZE + " and " + Byte.BYTES + " bytes");

        System.out.println("Min short " + Short.MIN_VALUE);
        System.out.println("Max short " + Short.MAX_VALUE);
        System.out.println("A short variable has a width of " + Short.SIZE + " and " + Short.BYTES + " bytes");

        System.out.println("Min long " + Long.MIN_VALUE);
        System.out.println("Max long " + Long.MAX_VALUE);
        System.out.println("A long variable has a width of " + Long.SIZE + " and " + Long.BYTES + " bytes");
    }
}
