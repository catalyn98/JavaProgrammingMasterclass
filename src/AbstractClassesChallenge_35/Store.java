package AbstractClassesChallenge_35;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}

public class Store {
    static ArrayList<ProductForSale> productsList = new ArrayList<>();

    public static void printProducts(ArrayList<ProductForSale> productsList) {
        for(ProductForSale p : productsList) {
            System.out.println("_".repeat(30));
            p.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        OrderItem orderItem = new OrderItem(quantity, productsList.get(orderIndex));
        order.add(orderItem);
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double totalSales = 0;
        for (OrderItem item : order) {
            item.product().printPricedItem(item.quantity());
            totalSales += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("Sales Total = " + totalSales);
    }

    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Samsung Galaxy S22", 2899.00, "The Samsung Galaxy S22 specs are top-notch including a Snapdragon 8 Gen 1 chipset, 8GB RAM coupled with 128/256GB storage, and a 3700mAh battery with 25W charging speed");
        Smartphone smartphone2 = new Smartphone("iPhone 14", 9999.99, "iPhone 14 has the same superspeedy chip that's in iPhone 13 Pro. A15 Bionic, with a 5‑core GPU, powers all the latest features and makes graphically intense games and AR apps feel ultra fluid");

        Laptop laptop1 = new Laptop("Laptop Lenovo", 21919.00, "Laptop Lenovo ThinkPad E14 Gen 2, 14\" FHD IPS, AMD Ryzen 3 4300U 4-core, 12 GB DDR4, 512 GB SSD m2 PCIe, AMD Radon Graphics, 1.64 kg Black");
        Laptop laptop2 = new Laptop("Laptop Asus ROG Strix", 4199.90, "Strix G15 is one of the best gaming laptops under $1,500, offering strong gaming and productivity performance, loud speakers and a soft-touch and metal housing. It's not without its flaws, and AMD has no option for 4K gaming at the moment, but AMD laptops are catching up");

        productsList.add(smartphone1);
        productsList.add(smartphone2);
        productsList.add(laptop1);
        productsList.add(laptop2);

        printProducts(productsList);

        System.out.println("\nOrder 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 0, 1);
        addItemToOrder(order1, 1, 2);
        printOrder(order1);

        System.out.println("\nOrder 2");
        ArrayList<OrderItem> order2 = new ArrayList<>();
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        addItemToOrder(order2, 3, 5);
        printOrder(order2);
    }
}
