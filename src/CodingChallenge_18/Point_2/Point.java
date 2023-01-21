package CodingChallenge_18.Point_2;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((Math.pow((-x), 2)) + (Math.pow((-y), 2)));
    }
    public double distance(int x, int y){
        return Math.sqrt((Math.pow((this.x - x), 2)) + (Math.pow((this.y - y), 2)));
    }

    public double distance(Point point){
        System.out.println("x " + x + " y " + y + " px " + point.x + " py " + point.y);
        return Math.sqrt((Math.pow((x - point.x), 2)) + (Math.pow((y - point.y), 2)));
    }
}
