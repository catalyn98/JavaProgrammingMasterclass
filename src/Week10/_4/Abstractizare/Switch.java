package Week10._4.Abstractizare;

// Clasă concretă Switch care extinde DispozitivRetea
public class Switch extends DispozitivRetea {
    public Switch(String adresaIP) {
        super(adresaIP);
    }

    // Implementarea metodei abstracte
    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea switch-ului cu adresa IP: " + adresaIP);
    }
}
