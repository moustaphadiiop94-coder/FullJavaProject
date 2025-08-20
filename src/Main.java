import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ArrayList = A resizeable array that stores objects (autoboxing).
        // Array are fixed in size , but ArrayLists can change .

      /*  ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Coconut");
        fruits.add("Banana");

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());

        System.out.println();

        Collections.sort(fruits);

        System.out.println(fruits);

        for (String fruit : fruits) {
            System.out.println(" for " +fruit);
        }

*/

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the number of foods you want to add: ");
        int numberOfFoods = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numberOfFoods; i++) {
            System.out.println("Enter the name of food " + i + ": ");
            String name = scanner.nextLine();
            foods.add(name);

        }

        System.out.println(foods);


        scanner.close();




    }
}
