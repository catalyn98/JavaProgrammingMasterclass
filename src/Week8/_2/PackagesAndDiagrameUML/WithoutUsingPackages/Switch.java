package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

//Code wrote by Catalan Catalin

public class Switch extends DispozitivRetea {
    public Switch(String ipAddress) {
        super(ipAddress);
    }

    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea switch-ului cu IP: " + ipAddress);
    }
}
