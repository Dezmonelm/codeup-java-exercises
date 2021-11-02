package shapes;

public class Rectangle {

//    t should have protected properties for both length and width.
    protected int length;
    protected int width;

//    public Rectangle () {};

//    Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }
}
