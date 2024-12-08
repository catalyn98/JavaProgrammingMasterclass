package Week10.Subgrupa1722B.abstractizare_pb1;

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
