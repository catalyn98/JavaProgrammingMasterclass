package Week5.Subgrupa_1722B.exercise10;

//Code wrote by Perte Lavinia-Ioana-Maria
public class SumOfDigits {
    public static int sumOfDigits(int n){
        //caz de baza
        if(n==0)
            return 0;
        return n%10 + sumOfDigits(n/10);
    }

    public static void main(String[] args){
        int n;
        n=34234;
        System.out.println("Suma cifrelor numarului "+n+" este "+sumOfDigits(n));
    }
}
