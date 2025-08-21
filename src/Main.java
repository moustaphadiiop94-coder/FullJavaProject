import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Generics is a concept where you can write a class , interface or method that
        //is compatible whit different data types .
        // <T> type parameter (placeholder that gets replaced with a real type)
        // <String> type argument (specifies type)

        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");*/

        /*Box <String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());
*/
        /*Box <Integer> box = new Box<>();
        box.setItem(3);
        System.out.println(box.getItem());
*/
        Product <String ,Double> product = new Product<>("Apple",0.50);

        System.out.println(product.item);
        System.out.println(product.price);

        Product <String ,Integer> product2 = new Product<>("Ticket",2);
        System.out.println(product2.item);
        System.out.println(product2.price);





    }
}
