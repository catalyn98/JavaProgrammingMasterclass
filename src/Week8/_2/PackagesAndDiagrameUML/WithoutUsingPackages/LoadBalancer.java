package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

public class LoadBalancer extends DispozitivRetea {
    public LoadBalancer(String ipAddress) {
        super(ipAddress);
    }

    @Override
    public void configureazaDispozitiv() {
        System.out.println("Configurarea load balancer-ului cu IP: " + ipAddress);
    }
}
