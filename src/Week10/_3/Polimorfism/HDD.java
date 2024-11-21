package Week10._3.Polimorfism;

// Clasa derivată HDD (Hard Disk Drive)
public class HDD extends DispozitivStocare {
    @Override
    public void afiseazaCapacitate() {
        System.out.println("Capacitatea HDD-ului este de 1 TB.");
    }
}