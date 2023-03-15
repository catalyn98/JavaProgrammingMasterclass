package _34.AbstractClasses.Enum;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.MONDAY;
        System.out.println(dayOfTheWeek);
        System.out.printf("Name is %s, ordinal value is %d", dayOfTheWeek.name(), dayOfTheWeek.ordinal());
    }
}