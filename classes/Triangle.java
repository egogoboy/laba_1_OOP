import java.lang.Math;

public class Triangle extends Figure{
    private double a;

    public Triangle(double x, double y, double side) {
        super(x, y);
        this.a = side;
    }

    @Override
    public double countSquare() {
        return a * a * Math.sqrt(3) / 4;
    }

    public void setSide(double rad) {
        this.a = rad;
    }

    public double getSide() {
        return this.a;
    }
}
