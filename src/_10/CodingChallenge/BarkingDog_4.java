package _10.CodingChallenge;

public class BarkingDog_4 {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking) {
            if ((hourOfDay < 0) || (hourOfDay > 23)) {
                return false;
            } else return (hourOfDay < 8) || (hourOfDay > 22);
        } else
            return false;
    }
}
