package CodingChallenge_13;

public class FlourPacker_12 {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;
        int sumOfKilos = bigCount +  smallCount;

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if(sumOfKilos == goal) {
            return true;
        }

        if(smallCount == 0){
            return bigCount % goal == 0;
        } else {
            return bigCount > goal && bigCount % goal != 0;
        }
    }
}
