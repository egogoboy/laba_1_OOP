abstract class Figure implements Distance {
    protected double x;
    protected double y;

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    abstract public double countSquare(); 
}
