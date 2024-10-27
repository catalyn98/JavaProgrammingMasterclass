package Week4.Subgrupa_1621A.ex2;
//Code wrote by Fildan Lucian
public class ComputerDetails {
    public static void main(String[] args)
    {
        // Instantiere obiect
        Computer comp=new Computer();
        comp.brand="Hp";
        comp.model="v1";
        comp.ram= 1024;
        comp.capacitate_de_stocare= 1000;
        System.out.println("Brandul laptopului este: "+ comp.brand);
        System.out.println("Modelul laptopului este:"+comp.model);
        System.out.println("Capacitatea ram a laptopului este:"+comp.ram);
        System.out.println("Capacitatea de stocare a laptopului este:"+comp.capacitate_de_stocare);
    }
}
