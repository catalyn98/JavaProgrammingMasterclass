package LearnJavaProgramming.laborator_10.abstractizare.pb1;

public class Laptop extends Device implements Networkable {
    @Override
    String deviceType() {
        return "Laptop";
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Laptop conectat la rețea.");
    }
}
