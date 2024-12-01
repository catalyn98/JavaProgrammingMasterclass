package Week8._1.POO;

//Code wrote by Catalan Catalin

public class Server {
    // Atribut (variabile de instanță)
    private String ipAddress;
    private int port;
    private boolean status;

    // Constructor
    public Server(String ipAddress, int port, boolean status) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.status = status;
    }

    // Metodele get() și set()
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Metoda toString() suprascrisă
    @Override
    public String toString() {
        return "Server [IP Address=" + ipAddress + ", Port=" + port + ", Status=" + (status ? "Online" : "Offline") + "]";
    }
}
