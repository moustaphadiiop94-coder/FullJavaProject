import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        /*double result ;
        result = Math.pow(2,5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10 ,20);
        System.out.println(result);*/

        // hypotenuse c=Math.sqrt(a carre + b carre)
        Locale.setDefault(Locale.US);
        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A : ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(" the hypotenuse (side c) is :" +c+"cm");



        scanner.close();
    }
}
