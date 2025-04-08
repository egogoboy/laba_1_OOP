abstract class Figure implements Distance {
    protected double x;
    protected double y;

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

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    abstract public double countSquare(); 
}
