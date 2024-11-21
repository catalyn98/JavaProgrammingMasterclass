package Week5.Subgrupa_1721A.exercise10;

//Code wrote by  Girz Ionut Alexandru
public class SumOfDigits {
    public static int sumOfDigits(int n){
        //Conditia de baza
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }

    public static void main(String[] args){
        int n = 523;
        System.out.println("Suma numerelor este: "+sumOfDigits(n));
    }
}
