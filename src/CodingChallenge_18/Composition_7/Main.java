package CodingChallenge_18.Composition_7;

public class Main {
    public static void main(String[] args) {

/*        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());*/

        /*Monitor monitor = new Monitor("Monitor Gaming ASUS TUF", "Asus INC", 23, "1920 x 1080");
        Motherboard motherboard = new Motherboard("Asus ProArt X670E", "Asus INC", 5, 5, "UEFI AMI");
        ComputerCase computerCase = new ComputerCase("Asus TUF", "Asus INC", "250 V");

        PersonalComputer personalComputer = new PersonalComputer("Asus TUF", "Asus INC", monitor, motherboard, computerCase);
*/
/*        personalComputer.getMonitor().drawPixelAt(20, 20, "blue");
        personalComputer.getMotherboard().loadProgram("Windows 11");
        personalComputer.getComputerCase().pressPowerButton();*/

        /*personalComputer.powerUp();*/

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Victor", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}