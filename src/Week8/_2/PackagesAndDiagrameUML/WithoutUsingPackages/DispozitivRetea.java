package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

public abstract class DispozitivRetea {
    protected String ipAddress;

    public DispozitivRetea(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public abstract void configureazaDispozitiv();
    public void afiseazaIP() {
        System.out.println("Adresa IP: " + ipAddress);
    }
}