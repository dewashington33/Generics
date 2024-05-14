public class MyGenericClass<T, V> {
    private T x;
    private V y;

    MyGenericClass(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    // Create a toString method to display the values of x and y
    @Override
    public String toString() {
        return x.toString() + y.toString();
    }

}
