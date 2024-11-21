package Week10._4.Abstractizare;

// Clasă abstractă
public abstract class DispozitivRetea {
    // Atribut comun
    protected String adresaIP;

    // Constructor
    public DispozitivRetea(String adresaIP) {
        this.adresaIP = adresaIP;
    }

    // Metodă abstractă (fără implementare)
    public abstract void configureazaDispozitiv();

    // Metodă concretă
    public void afiseazaIP() {
        System.out.println("Adresa IP a dispozitivului: " + adresaIP);
    }
}