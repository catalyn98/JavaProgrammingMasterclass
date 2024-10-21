package LearnJavaProgramming.exercise_2;

public class ComputerDetails {
    public static void main(String[] args) {
        // Crearea unui obiect de tip Computer (tip de referință)
        Computer myComputer = new Computer();

        // Atribuirea de valori (tipuri primitive și de referință)
        myComputer.brand = "Dell";
        myComputer.model = "XPS 15";
        myComputer.ram = 16;       // Tip primitiv (int)
        myComputer.storage = 512;  // Tip primitiv (int)

        // Afișarea detaliilor despre computer
        System.out.println("Detalii despre computer:");
        System.out.println("Marca: " + myComputer.brand);       // Tip de referință
        System.out.println("Model: " + myComputer.model);       // Tip de referință
        System.out.println("Memorie RAM: " + myComputer.ram + " GB");    // Tip primitiv
        System.out.println("Capacitate de stocare: " + myComputer.storage + " GB");  // Tip primitiv
    }
}