package _34.AbstractClasses.AbstractClasses;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void movingSpeed() {
        if(type == "Chihuahua") {
            System.out.println(getExplicitType());
            System.out.println("Chihuahuas can run up to 15 miles per hour");
        } else {
            System.out.println(getExplicitType());
            System.out.println("Most dogs can run about 15 to 20 miles per hour for a short distance");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Chihuahua") {
            System.out.println("Ham ham!");
        } else {
            System.out.println("Woff woff!");
        }
    }
}
