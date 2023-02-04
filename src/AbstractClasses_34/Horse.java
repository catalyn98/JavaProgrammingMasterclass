package AbstractClasses_34;

public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void movingSpeed() {
        System.out.println(getExplicitType());
        System.out.println("The average racehorses speed is approximately 40 to 44 mph (64 to 70 km/h)");
    }

    @Override
    public void makeNoise() {
        System.out.println(getExplicitType());
        System.out.println("The sound that a horse makes is called a neigh");
    }
}
