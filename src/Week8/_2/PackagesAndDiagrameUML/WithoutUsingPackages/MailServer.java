package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

public class MailServer extends Server {
    public MailServer(String hostname) {
        super(hostname);
    }

    @Override
    public void pornesteServerul() {
        System.out.println("Pornirea serverului de mail: " + hostname);
    }
}