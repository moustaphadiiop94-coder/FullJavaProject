import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior=false;
        double price = 9.99;

        if (isStudent){
            if(isSenior){
                System.out.println("You get a senior discount 20%");
                System.out.println("You get a student discount 10%");
                price *= 0.7;
                System.out.printf("the price of a ticket is : %.2f", price);

            }else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
                System.out.printf("the price of a ticket is : %.2f", price);

            }
        }else if(isSenior){
            System.out.println("You get a senior discount of 20%");
            price *= 0.8;
            System.out.printf("the price of a ticket is : %.2f", price);
        }else {
            System.out.println("You get no discount of 0%");
            System.out.printf("the price of a ticket is : %.2f", price);
        }






    }
}
