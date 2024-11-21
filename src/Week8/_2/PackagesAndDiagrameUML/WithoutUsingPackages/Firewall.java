package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

public class Firewall extends DispozitivRetea {
    public Firewall(String ipAddress) {
        super(ipAddress);
    }

    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea firewall-ului cu IP: " + ipAddress);
    }
}