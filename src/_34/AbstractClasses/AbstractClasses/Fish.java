package _34.AbstractClasses.AbstractClasses;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void movingSpeed() {
        if(type == "Sailfish") {
            System.out.println(getExplicitType());
            System.out.println("Sailfish swim at up to 70 miles per hour");
        } else {
            System.out.println(getExplicitType());
            System.out.println("Most fish can swim at up to 50 miles per hour");
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("Fish don't make noise");
    }
}
