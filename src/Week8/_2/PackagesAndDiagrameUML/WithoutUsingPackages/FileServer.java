package Week8._2.PackagesAndDiagrameUML.WithoutUsingPackages;

public class FileServer extends Server {
    public FileServer(String hostname) {
        super(hostname);
    }

    @Override
    public void pornesteServerul() {
        System.out.println("Pornirea serverului de fișiere: " + hostname);
    }
}
