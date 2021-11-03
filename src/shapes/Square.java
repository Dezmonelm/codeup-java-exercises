package shapes;

import java.io.PrintStream;

//Create a class named Square, also inside of shapes, that extends Rectangle.
public class Square extends Rectangle {
protected int side;
//    Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
public Square(int side) {
    super(side, side);
    this.side = side;  //include this to set value
}

//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
public PrintStream getArea () {
    System.out.println("Square area: ");
    return System.out.format(String.valueOf(4 * this.side));
}

public PrintStream getPerimeter() {
    System.out.println("Square perimeter: ");
    return System.out.format(String.valueOf(this.side * this.side));
}

}

