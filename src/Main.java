import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Composition trepresent a "part of " relationship between objects
        // for example , an Engine is a part of a car .


        Car car = new Car("Corvette",2025,"V8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();







    }
}
