package _22.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Stars Wars");
        movie1.watchMovie();

        // we can assign an adventure object to a movie variable
        Movie movie2 = new Adventure("Stars Wars");
        movie2.watchMovie();
    }
}