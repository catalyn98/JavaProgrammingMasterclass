package LearnJavaProgramming.laborator_9.Homework;

public class NetworkPrinter {
    // Atributele clasei
    private String model;
    private String ipAddress;
    private int pagesPrinted;

    // Constructor
    public NetworkPrinter(String model, String ipAddress, int pagesPrinted) {
        this.model = model;
        this.ipAddress = ipAddress;
        this.pagesPrinted = pagesPrinted;
    }

    // Metodele get()
    public String getModel() {
        return model;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    // Metodele set()
    public void setModel(String model) {
        this.model = model;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "NetworkPrinter [Model: " + model + ", IP Address: " + ipAddress + ", Pages Printed: " + pagesPrinted + "]";
    }

    // Main pentru testare
    public static void main(String[] args) {
        // Creare obiect și afișare detalii
        NetworkPrinter printer = new NetworkPrinter("HP LaserJet Pro", "192.168.1.50", 150);
        System.out.println(printer);

        // Modificarea unor atribute
        printer.setPagesPrinted(200);
        printer.setIpAddress("192.168.1.51");

        // Afișarea detaliilor actualizate
        System.out.println(printer);
    }
}
