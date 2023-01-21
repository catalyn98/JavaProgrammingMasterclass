package ForStatement_14;

public class ForStatement {
    public static boolean isPrime(int number) {
        int counter = 0;
        for(int i = 1; i <= number; i++) {
            if((number % i) == 0){
                counter++;
                if(counter > 2)
                    return false;
            }
        }
        return true;
    }

    public static int sum(){
        int sum = 0;
        int counter = 0;
        System.out.print("The numbers are: ");
        for(int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i + " ");
                sum = sum + i;
                counter++;
                if ( counter == 5)
                    break;
            }
        }
        return sum;
    }
}
