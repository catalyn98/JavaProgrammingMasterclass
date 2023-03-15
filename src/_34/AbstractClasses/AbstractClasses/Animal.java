package _34.AbstractClasses.AbstractClasses;

abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }


}

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void movingSpeed ();

    public abstract void makeNoise();

    @Override
    public String toString() {
        return  "{" + "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight + "}";
    }

    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
