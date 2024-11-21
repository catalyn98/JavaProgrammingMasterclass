package Week6.Subgrupa1621A.exercise10;

// Code wrote by Laza Lukas

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        if (number==0)
            return 0;
        return number%10+sumOfDigits(number/10);
    }

    public static void main(String[] args) {
        int number= 12345;
        System.out.println("Suma ciferlor numarului este: "+ sumOfDigits(number));
    }
}
