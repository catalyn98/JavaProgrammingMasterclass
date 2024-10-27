package Week4.Subgrupa_1722A.exercise2;
//Code wrote by Lauran Cezar
public class ComputerDetails {
    public static void main(String[] args){
        //cream o instanta
        Computer computer=new Computer();
        computer.ram=32;
        computer.capacitateDeStocare=512;
        computer.brand="Asus";
        computer.model="RTX";
        System.out.println("Memoria ram este "+computer.ram);
        System.out.println("Capacitatea de stocare este "+computer.capacitateDeStocare);
        System.out.println("Brandul este "+computer.brand);
        System.out.println("Modelul este "+computer.model);
    }
}
