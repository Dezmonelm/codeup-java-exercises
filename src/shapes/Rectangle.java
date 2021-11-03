package shapes;

import java.io.PrintStream;

public class Rectangle {

//    t should have protected properties for both length and width.
    protected int length;
    protected int width;

    public Rectangle () {};
//    public Rectangle (int side) {};

//    Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.

    public PrintStream getArea() {
        return System.out.format(String.valueOf(length * width));
    }

    public PrintStream getPerimeter() {
        return System.out.format(String.valueOf(2 * length + 2 * width));
    }
}
