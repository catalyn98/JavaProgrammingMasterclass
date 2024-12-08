package Week10.subgrupa1722A.abstractizare_pb1;

public class Laptop extends Device implements Networkable {
    @Override
    public void connectToNetwork() {
        System.out.println("M-am conectat la retea");
    }

    @Override
    public String deviceType() {
         return "Laptop";
    }
}
