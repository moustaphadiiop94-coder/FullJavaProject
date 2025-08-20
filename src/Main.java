import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(" Dog is Alive "+dog.isAlive);
        System.out.println(" Cat is Alive "+cat.isAlive);
        System.out.println("Dog has "+dog.lives+" lives");
        System.out.println("Cat has "+cat.lives+" lives");
        dog.speak();
        cat.speak();

    }
}
