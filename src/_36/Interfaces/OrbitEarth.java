package _36.Interfaces;

import java.util.Date;

public interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description) {
        Date today = new Date();
        System.out.println(today + ": " + description);
    }
}
