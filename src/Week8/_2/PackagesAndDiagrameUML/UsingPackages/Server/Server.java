package Week8._2.PackagesAndDiagrameUML.UsingPackages.Server;

public abstract class Server {
    protected String hostname;

    public Server(String hostname) {
        this.hostname = hostname;
    }

    public abstract void pornesteServerul();
    public void afiseazaHostname() {
        System.out.println("Hostname: " + hostname);
    }
}
