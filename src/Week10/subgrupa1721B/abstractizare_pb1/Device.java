package Week10.subgrupa1721B.abstractizare_pb1;

public abstract class Device {
    void turnOn() {
        System.out.println("Dispozitivul a fost pornit.");
    }

    void turnOff() {
        System.out.println("Dispozitivul a fost oprit.");
    }

    abstract String deviceType(); // Fiecare subclasă va implementa acestă metodă.
}
