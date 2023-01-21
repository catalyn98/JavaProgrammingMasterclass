package MethodOverloading_11;

public class ConvertToCentimeters {
    public static double convertToCentimeters(int heightInInch) {
        double heightInCentimeters;
        heightInCentimeters = heightInInch * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        double heightInCentimeters;
        heightInCentimeters = (heightInFeet * 30.48) + (remainingHeightInInches * 2.54);
        return heightInCentimeters;
    }
}
