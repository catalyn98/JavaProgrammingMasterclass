package CodingChallenge_10;

public class PlayingCat_12 {
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if(isSummer && (temperature >= 25) && (temperature <= 45))
            return true;
        else return !isSummer && (temperature >= 25) && (temperature <= 35);
    }
}
