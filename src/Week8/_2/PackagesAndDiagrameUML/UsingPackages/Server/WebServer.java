package Week8._2.PackagesAndDiagrameUML.UsingPackages.Server;

public class WebServer extends Server {
    public WebServer(String hostname) {
        super(hostname);
    }

    @Override
    public void pornesteServerul() {
        System.out.println("Pornirea serverului web: " + hostname);
    }
}
