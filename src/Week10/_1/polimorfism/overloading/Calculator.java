package Week10._1.polimorfism.overloading;

public class Calculator {
    int aduna(int a, int b) {
        return a + b;
    }

    double aduna(double a, double b) {
        return a + b;
    }

    // același tip de dată ca și în prima funcție, dar diferă umărul de parametrii
    int aduna(int a, int b, int c) {
        return a + b + c;
    }
}
