public class Car {
    String make= "Ford";
    String model = "Mustang";
    int year = 2025;
    double price =58000.99;
    boolean isRunning = false;

    void start() {
        System.out.println("Car is started");
    }

    void stop() {
        System.out.println("Car is stoped");
    }

    void drive() {
        System.out.println("you drive the "+model);
    }

    void brake(){
        System.out.println("you brake the "+model);
    }
}
