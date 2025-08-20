import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Animal animal ;

        System.out.println("Would you like a dog or a cat ? (1 = dog, 2 = cat)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                animal = new Dog();
                animal.speak();
                break;
            case 2:
                animal = new Cat();
                animal.speak();
                break;
            default:
                System.out.println("Invalid choice");
        }





    }
}
