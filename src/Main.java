import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        /*System.out.println(" Dog is Alive "+dog.isAlive);
        System.out.println(" Cat is Alive "+cat.isAlive);
        System.out.println("Dog has "+dog.lives+" lives");
        System.out.println("Cat has "+cat.lives+" lives");
        dog.speak();
        cat.speak();*/

        System.out.printf("The dog is ");dog.move();
        System.out.printf("The cat is ");cat.move();
        System.out.printf("The fish is ");fish.move();


        // new class plant
        /*Plant plant = new Plant();
        System.out.println(" Plant is Alive "+plant.isAlive);
        plant.photosynthesis();

        // Super

        Person person = new Person("Tom ", "Riddle");
        person.showName();

        Student student = new Student("maodo","kane",3.25);
        student.showName();
        student.showGpa();

        Employee employee = new Employee("Diary","Diouf",500000);
        employee.showSalary();*/

    }
}
