import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Car car = new Car("Mustang","RED","Ford",2025);
        System.out.println(car);
        //System.out.println(car.color+" "+car.model+" "+car.year+" "+car.make);
        Car car2 = new Car("Corvette","Blue","Chevrolet",2026);
        System.out.println(car2);

    */

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectanngle rectangle = new Rectanngle(6,7);
        circle.display();
        triangle.display();
        rectangle.display();
        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The area of the triangle is: " + triangle.area());
        System.out.println("The area of the rectangle is: " + rectangle.area());




    }
}
