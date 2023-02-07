package Interfaces_36;

public class Main {

    private static void inFlight(FlightEnabled flightEnabled) {
        flightEnabled.takeOff();
        flightEnabled.land();
        if(flightEnabled instanceof Trackable trackable) {
            trackable.track();
        }
        flightEnabled.fly();
    }

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

        animal.move();
        inFlight(flightEnabled);

        System.out.println("_".repeat(30));
        inFlight(new Jet());

        System.out.println("_".repeat(30));
        Truck truck = new Truck();
        Trackable anotherTrackable = truck;
        anotherTrackable.track();

        System.out.println("_".repeat(30));
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.println("The truck traveled " + kmsTraveled + " km or " + milesTraveled + " miles");

        System.out.println("_".repeat(30));
        flightEnabled.transition(FlightStages.LAUNCH);

        System.out.println("_".repeat(30));
        Jet jet = new Jet();
        jet.transition(FlightStages.LAUNCH);

        // System.out.println("_".repeat(30));
        // OrbitEarth.log("Testing");
    }
}