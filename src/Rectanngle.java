public class Rectanngle extends Shape {
    double length;
    double width;

    Rectanngle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
