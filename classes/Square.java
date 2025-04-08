public class Square extends Figure {
    private double size;

    public Square(double size) {
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
