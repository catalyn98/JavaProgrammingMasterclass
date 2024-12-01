package Week10._1.polimorfism.overriding;

public class Test {
    public static void main(String[] args) {
        Animal pisica = new Pisica();
        pisica.sunet(); // Va afișa "Pisica miaună"

        Animal câine = new Câine();
        câine.sunet(); // Va afișa "Pisica miaună"
    }
}
