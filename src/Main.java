import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        int age ;
        String name ;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        System.out.print("Are you a student (true/false) ? ");
        boolean isStudent = scanner.nextBoolean();
        //Group1
        if(name.isEmpty()){
            System.out.println("You did not enter a name.");
        }else {
            System.out.println(" Hello Your name is "+name);
        }

        System.out.print("Enter your age: ");
        age = scanner.nextInt();


        //group 2

        if (age >= 65) {
            System.out.println("You are a senior!");
        }else if (age >= 18) {
            System.out.println("You are an adult !");
        }else if (age < 0) {
            System.out.println(" you haven't born yet");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        }else {
            System.out.println("you are a child");
        }

        // group 3
        if(isStudent){
            System.out.println("You are a student");
        }else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
