package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

public class AccessPoint extends DispozitivRetea {
    public AccessPoint(String ipAddress) {
        super(ipAddress);
    }

    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea punctului de acces cu IP: " + ipAddress);
    }
}