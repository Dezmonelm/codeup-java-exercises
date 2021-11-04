package shapes;

import java.io.PrintStream;

public class Rectangle extends Quadralateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

////    t should have protected properties for both length and width.
//    protected int length;
//    protected int width;
//
//    public Rectangle () {};
////    public Rectangle (int side) {};
//
////    Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    public Rectangle (int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
////    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
//
//    public PrintStream getArea() {
//        return System.out.format(String.valueOf(length * width));
//    }
//
//    public PrintStream getPerimeter() {
//        return System.out.format(String.valueOf(2 * length + 2 * width));
//    }
}
