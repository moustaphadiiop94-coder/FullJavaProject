import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*double temperature= -20;
        boolean isSunny = true;

        if(temperature <= 30 && temperature >= 0 && isSunny){
            System.out.println("The weather is good ");
            System.out.println("Sunny");
        } else if (temperature <=30 && temperature >=0 && !isSunny) {
            System.out.println(" is not Sunny");
            System.out.println("The weather is good ");
        } else if (temperature > 30 || temperature < 0) {
            System.out.println("The weather is bad ");


        }
*/
        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12
        //username must not contains spaces or underscores

        String username;
        System.out.print("Enter ypur Username: ");
        username = scanner.nextLine();
        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username ust be between 4-12");
        } else if (username.contains(" ") && username.contains("_")) {
            System.out.println("username must not contains spaces or underscores");

        } else {
            System.out.println("Username is valid "+username);
        }



        scanner.close();

    }
}
