package Week10._3.Polimorfism;

// Clasa derivată FlashDrive (stick USB)
public class FlashDrive extends DispozitivStocare {
    @Override
    public void afiseazaCapacitate() {
        System.out.println("Capacitatea stick-ului USB este de 64 GB.");
    }
}
