package _21.EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount < 0))
            return -1;
        return tonerLevel += tonerAmount;
    }

    public void printPages(int pages) {
        if(duplex) {
            System.out.println("I can print on 2 sides of a single sheet of paper");
            System.out.println("I use " + (pages / 2) + " sheets of paper to print " + pages + " pages");
        }
        else {
            System.out.println("I can print on 1 side of a single sheet of paper");
            System.out.println("I use " + pages + " sheets of paper to print " + pages + " pages");
        }
    }
}
