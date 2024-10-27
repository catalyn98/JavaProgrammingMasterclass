package Week4.Subgrupa_1721A.exercise2;
//Code wrote by Bene Daniel Andrei
public class ComputerDetails {
    public static void main(String[] args){
        Computer computer = new Computer();
        computer.brand = "Asus";
        computer.model = "Rogue";
        computer.ram = 16;
        computer.stocare = 512;
        System.out.println("Brand: " + computer.brand);
        System.out.println("Model: " + computer.model);
        System.out.println("Ram: " + computer.ram + "GB");
        System.out.println("Stocare: " + computer.stocare + "GB");
    }
}
