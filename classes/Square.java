public class Square extends Figure {
    private double size;

    public Square(double x, double y, double size) {
        super(x, y);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double countSquare() {
        return size * size;
    }
}
