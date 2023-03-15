package _19.Composition;

public class Main {
    
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Monitor Gaming ASUS TUF", "Asus INC", 23, "1920 x 1080");
        Motherboard motherboard = new Motherboard("Asus ProArt X670E", "Asus INC", 5, 5, "UEFI AMI");
        ComputerCase computerCase = new ComputerCase("Asus TUF", "Asus INC", "250 V");

        PersonalComputer personalComputer = new PersonalComputer("Asus TUF", "Asus INC", monitor, motherboard, computerCase);
/*        personalComputer.getMonitor().drawPixelAt(20, 20, "blue");
        personalComputer.getMotherboard().loadProgram("Windows 11");
        personalComputer.getComputerCase().pressPowerButton();*/

        personalComputer.powerUp();
    }
}