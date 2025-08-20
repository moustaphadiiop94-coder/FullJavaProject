import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        //Scanner sc = new Scanner(System.in);

        Car car = new Car();

        car.isRunning = true;

        /*System.out.println(car);
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);*/

        System.out.println();

        /*car.start();
        car.stop();
        car.drive();
        car.brake();

*/
        Car car1 = new Car();
        Car car2 = new Car();
        car1.model="renault";
        car2.model="dacia";
        System.out.println(car1.model);
        System.out.println(car2.model);




        //sc.close();



    }
}
