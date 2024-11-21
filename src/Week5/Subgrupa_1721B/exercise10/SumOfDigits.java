package Week5.Subgrupa_1721B.exercise10;
//Doba Bogdan-Darius
public class SumOfDigits {
    public static void main(String[] args)
    {
        int number=1234;
        System.out.println("Suma este: "+sumOfDigits(number));
    }
    public static int sumOfDigits(int number)
    {
        //caz de baza
        if(number==0) return 0;
        //apel recursiv
        return number%10+sumOfDigits(number/10);
    }
}
