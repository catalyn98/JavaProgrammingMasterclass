package Week9.problemă_propusă_rezolvare_ex1;

public class Main {
    public static void main(String[] args) {
        User admin = new User("admin");
        User regularUser = new User("user123");

        Product product = new Product();

        // Admin-ul poate modifica detaliile produsului
        product.updateProductDetails(admin, "New Software", 2.0);
        System.out.println(product.getProductDetails(admin));

        // Utilizatorul obișnuit nu poate modifica produsul
        try {
            product.updateProductDetails(regularUser, "Hacked Software", 3.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Vizualizarea detaliilor produsului pentru utilizator diferit de null
        System.out.println(product.getProductDetails(regularUser));

        // Utilizator null
        System.out.println(product.getProductDetails(null));
    }
}
