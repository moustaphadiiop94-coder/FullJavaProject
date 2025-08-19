import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US); // <-- accepte 2.0


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old!");

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is: " + gpa);

        // clear the newline left by nextDouble
        scanner.nextLine();

        System.out.print("Are you a student? (Y/N): ");
        String studentInput = scanner.nextLine();

        boolean isStudent = studentInput.equalsIgnoreCase("Y");

        if (isStudent) {
            System.out.println("You are enrolled as a student.");
        } else {
            System.out.println("You are not enrolled as a student.");
        }

        scanner.close();
    }
}
