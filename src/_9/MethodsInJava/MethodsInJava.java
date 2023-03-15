package _9.MethodsInJava;

public class MethodsInJava {

    public static int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static void firstMethod(String name) {
        int position = calculateHighScorePosition(0);
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int position;
        if(score >= 1000)
            position = 1;
        else if(score >= 500)
            position = 2;
        else if(score >= 100)
            position = 3;
        else
            position = 4;
        return position;
    }
}
