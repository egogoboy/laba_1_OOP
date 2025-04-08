abstract class Figure implements Distance {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Pair<Double, Double> getCoordinates() {
        return new Pair(this.x, this.y);
    }

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    abstract public double countSquare(); 
}
