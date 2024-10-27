package Week4.Subgrupa_1722B.exercise2;
//Code wrote by Sava Alexandru
public class ComputerDetails {
    public static void main(String[] args)
    {
        //Instantiere obiect
        Computer computer=new Computer();
        computer.brand="Asus";
        computer.capacitateDeStocare=128;
        computer.memorieRam=64;
        computer.model="RTX";
        System.out.println("Brandul este:"+computer.brand+"\n"+
                "Capcitatea de stocare este:"+computer.capacitateDeStocare+"\n"+
                "Memorie RAM:"+computer.memorieRam+"\n"+
                "Model:"+computer.model
                );
    }
}
