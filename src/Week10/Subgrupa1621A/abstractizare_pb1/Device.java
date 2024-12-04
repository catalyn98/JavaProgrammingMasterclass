package Week10.Subgrupa1621A.abstractizare_pb1;

public abstract class Device {
    void turnOn() {
        System.out.println("Dispozitivul a fost pornit.");
    }

    void turnOff() {
        System.out.println("Dispozitivul a fost oprit.");
    }

    abstract String deviceType(); // Fiecare subclasă va implementa acestă metodă.
}
