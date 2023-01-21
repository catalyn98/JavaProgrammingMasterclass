package CodingChallenge_10;

public class AreaCalculator_9 {

    public static double area(double radius) {
        double areaOfCircle;
        if (radius < 0) {
            return -1.0;
        } else {
            areaOfCircle = radius * radius * Math.PI;
        }
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        double areaOfRectangle;
        if ((x < 0) || (y < 0)) {
            return -1.0;
        } else {
            areaOfRectangle = x * y;
        }
        return areaOfRectangle;
    }
}
