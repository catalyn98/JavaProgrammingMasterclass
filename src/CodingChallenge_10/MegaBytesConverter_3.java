package CodingChallenge_10;

public class MegaBytesConverter_3 {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes, remainingKilobytes;
        if(kiloBytes <= 0) {
            System.out.println("Invalid Value");
        } else {
            megaBytes = kiloBytes / 1024;
            remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
