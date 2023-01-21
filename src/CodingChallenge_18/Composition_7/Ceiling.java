package CodingChallenge_18.Composition_7;

public class Ceiling {
    private int paintedColor;
    private int height;

    public Ceiling(int paintedColor, int height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public int getHeight() {
        return height;
    }
}
