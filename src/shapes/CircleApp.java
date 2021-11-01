package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please enter a circle's radius");
        double radius = input.getDouble();

        Circle circle =new Circle(radius);

        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("The radius is %f", radius);
        System.out.printf("The circle's circumference is %f and the area is %f.%n", circumference, area);

        System.out.println();
    }
}
