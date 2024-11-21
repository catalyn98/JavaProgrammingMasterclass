package Week6.Subgrupa1621B.exercise10;

//Code wrote by Florin Polevoi

public class SumOfDigits {
    public static int sumOfDigits(int n){
        if(n == 0)
            return 0;
        return n % 10 + sumOfDigits(n/10);
    }

    public static void main (String[] args){
        int n = 3752;
        System.out.println("Suma cifrelor nr n este: " +sumOfDigits(n));
    }
}
