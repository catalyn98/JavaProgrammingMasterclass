package Week10._4.Abstractizare;

// Clasă concretă Router care extinde DispozitivRetea
public class Router extends DispozitivRetea {
    public Router(String adresaIP) {
        super(adresaIP);
    }

    // Implementarea metodei abstracte
    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea router-ului cu adresa IP: " + adresaIP);
    }
}

