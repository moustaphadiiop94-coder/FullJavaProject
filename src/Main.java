import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Car car1 = new Car("Mustang" , "red");
        Car car2 = new Car("Carvette" , "blue");
        Car car3 = new Car("Charger" , "yellow");*/

        //Car [] cars = {car1, car2, car3};
        Car [] cars = {new Car("Mustang","red"),
                    new Car("Carvette" , "blue"),
                    new Car("Charger" , "yellow")};

        /*for (int i = 0; i < cars.length; i++) {
            cars[i].drive();

        }*/

        System.out.println();

        for (Car car : cars) {
           // car.drive();
            car.color = "black";
        }

        for (Car car : cars) {
             car.drive();
        }


    }
}
