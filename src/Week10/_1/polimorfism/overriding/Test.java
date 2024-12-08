package Week10._1.polimorfism.overriding;

public class Test {
    public static void main(String[] args) {
      Animal pisica = new Pisica();
      pisica.sunet(); // Va afișa "Pisica miaună"

      Animal caine = new Caine();
      caine.sunet(); // Va afișa "Câinele latră"
    }
}
