import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        
        System.out.print("What item would you like to buy? : ");
        item = sc.nextLine();
        System.out.print("What is the price for each item ? : ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("how many items would you like to buy? : ");
        quantity = sc.nextInt();
        
        total = price * quantity;
        
        System.out.println("\n You have bought " +quantity + " " + item + "/s");
        System.out.println("\n Total price is " + currency + + total);
        sc.close();
        
 
    }
}
