package Week8._1.POO;

//Code wrote by Catalan Catalin

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect (instanță a clasei Server)
        Server myServer = new Server("192.168.1.1", 8080, true);

        // Afișarea informațiilor despre server folosind metoda toString()
        System.out.println(myServer);

        // Utilizarea metodelor get() și set()
        myServer.setStatus(false);
        System.out.println("Status actualizat: " + myServer.isStatus());
    }
}
