public class Car {
    String model;
    String color;
    String make;
    int year;

    Car(String model, String color, String make, int year) {
        this.model = model;
        this.color = color;
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.color+" "+this.make+" "+this.model+" "+this.year;
    }
}
