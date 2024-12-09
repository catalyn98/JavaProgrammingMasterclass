package LearnJavaProgramming.solutii_exercitii_recapitulative.ex3;

// Clasa Test
public class Test {
    public static void main(String[] args) {
        // Instanțierea unui obiect Task
        Task task = new Task("Design UI", "High", "Blocked", false);

        // Afișarea detaliilor sarcinii
        System.out.println("Detalii sarcină inițială: " + task);

        // Schimbarea priorității, a statusului și setarea sarcinii ca finalizată
        task.setPriority("Medium");
        task.setStatus("Done");
        task.setCompleted(true);

        // Afișarea detaliilor actualizate
        System.out.println("Detalii sarcină actualizată: " + task);

        // Obținerea numelui sarcinii folosind metoda get()
        System.out.println("Numele sarcinii: " + task.getTaskName());
    }
}
