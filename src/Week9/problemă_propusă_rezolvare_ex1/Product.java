package Week9.problemă_propusă_rezolvare_ex1;

public class Product {
    private String name = "AutoCAD";
    private double version = 2024.1;

    // Oricine poate vizualiza detaliile dacă user-ul nu este null
    public String getProductDetails(User user) {
        if (user != null) {
            return "Product: " + name + ", Version: " + version;
        } else {
            return "User invalid! Nu poți vizualiza detaliile produsului.";
        }
    }

    // Doar admin-ul poate modifica detaliile produsului
    public void updateProductDetails(User user, String newName, double newVersion) {
        if (user.isAdmin()) {
            this.name = newName;
            this.version = newVersion;
            System.out.println("Detaliile produsului au fost actualizate!");
        } else {
            throw new IllegalArgumentException("Acces restricționat! Doar admin-ul poate modifica produsul.");
        }
    }
}
