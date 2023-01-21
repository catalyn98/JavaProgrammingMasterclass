package CharAndBooleanPrimitiveDataTypes_7;

public class CharAndBooleanPrimitiveDataTypes {

    public static void main(String[] args) {
        char myChar = 'C';
        char myUnicode = '\u0044';
        System.out.println(myUnicode);
        System.out.println("A char variable has a width of " + Character.SIZE + " and " + Character.BYTES + " bytes");

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("Simple char - " + mySimpleChar);
        System.out.println("Unicode char - " + myUnicodeChar);
        System.out.println("Decimal char - " + myDecimalChar);

        boolean myBooleanTrueDataTypes = true;
        boolean myBooleanFalseDataTypes = false;
        if(myBooleanTrueDataTypes) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
