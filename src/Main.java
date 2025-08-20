import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Charger ","Yellow ",10000 );
        //car.model = "BMW";

        car.setModel("BMW");
        car.setColor("Red");
        car.setPrice(15000);
        System.out.println(car.getModel() + " " +car.getColor()+" "+ car.getPrice());





    }
}
