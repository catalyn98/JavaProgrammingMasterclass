package Week10._3.Polimorfism;

// Clasa principală pentru testarea polimorfismului
public class Main {
    public static void main(String[] args) {
        // Polimorfism la nivel de runtime
        DispozitivStocare dispozitiv1 = new HDD();
        DispozitivStocare dispozitiv2 = new SSD();
        DispozitivStocare dispozitiv3 = new FlashDrive();

        dispozitiv1.afiseazaCapacitate(); // Output: Capacitatea HDD-ului este de 1 TB.
        dispozitiv2.afiseazaCapacitate(); // Output: Capacitatea SSD-ului este de 500 GB.
        dispozitiv3.afiseazaCapacitate(); // Output: Capacitatea stick-ului USB este de 64 GB.
    }
}