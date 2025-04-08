import java.lang.Math;

public class Circle extends Figure{
    private double r;

    public Circle(double x, double y, double rad) {
        super(x, y);
        this.r = rad;
    }

    @Override
    public double countSquare() {
        return Math.PI * r*r;
    }

    public void setRadius(double rad) {
        this.r = rad;
    }

    public double getRadius() {
        return  this.r;
    }
}
