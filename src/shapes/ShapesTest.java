package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1 = new Rectangle(6, 4);
        Measurable myShape2 = new Square(9);

        System.out.println("myShape1 Perimeter = " + myShape1.getPerimeter());
        System.out.println("myShape1 Area = " + myShape1.getArea());
        System.out.println();

        System.out.println("myShape2 Perimeter = " + myShape2.getPerimeter());
        System.out.println("myShape2 Area = " + myShape2.getArea());
        System.out.println();

////        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//
//        Rectangle box1 = new Rectangle(5, 4);
//
////        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//
//        box1.getPerimeter();
//        System.out.println();
//        box1.getArea();
//
////                create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//
//Rectangle box2 = new Square(5);
//        System.out.println();
//
////        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//
//        box2.getPerimeter();
//        System.out.println();
//        box2.getArea();
//
    }
}
