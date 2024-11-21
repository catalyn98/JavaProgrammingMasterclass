package Week8._2.PackagesAndDiagrameUML.UsingPackages.Server;

public class ApplicationServer extends Server {
    public ApplicationServer(String hostname) {
        super(hostname);
    }

    @Override
    public void pornesteServerul() {
        System.out.println("Pornirea serverului de aplicații: " + hostname);
    }
}
