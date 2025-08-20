import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle [] vehicles = {car , bike ,boat};

        for (Vehicle v : vehicles) {
            v.go();
        }


        CarBis carBis = new CarBis();
        carBis.go();
        BikeBis bikeBis = new BikeBis();
        bikeBis.go();
        BoatBis boatBis = new BoatBis();
        boatBis.go();







    }
}
