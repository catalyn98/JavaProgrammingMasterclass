package Week8._2.PackagesAndDiagrameUML.UsingPackages.DispozitivRetea;

public class Router extends DispozitivRetea {
    public Router(String ipAddress) {
        super(ipAddress);
    }

    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea router-ului cu IP: " + ipAddress);
    }
}