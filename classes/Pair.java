public class Pair <T, K>{
    private T first;
    private K second;
    public Pair() { first = null; second = null; }
    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() { return first; }
    public K getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(K newValue) { second = newValue; }
}
