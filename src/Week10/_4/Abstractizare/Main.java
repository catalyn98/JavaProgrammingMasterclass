package Week10._4.Abstractizare;

// Clasa principală pentru testarea abstractizării
public class Main {
    public static void main(String[] args) {
        DispozitivRetea router = new Router("192.168.0.1");
        DispozitivRetea switchDevice = new Switch("192.168.0.2");

        // Apelarea metodelor
        router.afiseazaIP();
        router.configureazaDispozitiv();

        switchDevice.afiseazaIP();
        switchDevice.configureazaDispozitiv();
    }
}
