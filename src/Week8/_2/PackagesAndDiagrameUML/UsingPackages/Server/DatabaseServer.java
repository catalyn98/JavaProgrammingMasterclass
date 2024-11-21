package Week8._2.PackagesAndDiagrameUML.UsingPackages.Server;

public class DatabaseServer extends Server {
    public DatabaseServer(String hostname) {
        super(hostname);
    }

    @Override
    public void pornesteServerul() {
        System.out.println("Pornirea serverului de baze de date: " + hostname);
    }
}
