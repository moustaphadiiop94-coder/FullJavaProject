import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*String name = "";

        while (name.isEmpty()){
            System.out.println("Please enter your name");
            name = scanner.nextLine();
        }

        System.out.println("Welcome " + name);

      */

       /* while (1==1){
            System.out.println("I m stuck to this loop");
        }*/


        /*String response="";

        while (!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to exit the game");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You quit the game");
*/
        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        do{
            System.out.println("You are negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while (age < 0);
        System.out.print("Your age is: "+age+" years old");


        scanner.close();

    }
}
