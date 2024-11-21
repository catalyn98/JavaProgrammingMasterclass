package Week10._3.Polimorfism;

// Clasa derivată SSD (Solid State Drive)
public class SSD extends DispozitivStocare {
    @Override
    public void afiseazaCapacitate() {
        System.out.println("Capacitatea SSD-ului este de 500 GB.");
    }
}
