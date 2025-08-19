import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 25;
        double height = 1.5;
        boolean isEmplyed = true;

        System.out.printf("Hello %s \n",name);
        System.out.printf("Your name starts with a %c \n",firstLetter);
        System.out.printf("Your are %d years old \n",age);
        System.out.printf("Your are %.2f inches tall \n",height);
        System.out.printf("Employed: %b \n",isEmplyed);

        System.out.printf("%s is %d years old \n",name,age);

    }
}
