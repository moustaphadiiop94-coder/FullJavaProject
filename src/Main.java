import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String [] foods = new String [3];

        foods[0] = "apple";
        foods[1] = "orange";
        foods[2] = "water";

        for (String food : foods) {
            System.out.println(food);
        }
*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int size;

        System.out.println("Enter the size of foods: ");
        size = sc.nextInt();
        sc.nextLine();

        String[] foodsArray = new String[size];



        //String [] foods = new String [3];
        for (int i = 0; i < foodsArray.length; i++) {
            System.out.print("Enter food name: ");
            foodsArray[i] = sc.nextLine();
        }

        for (String food : foodsArray) {
            System.out.println(food);
        }

        sc.close();


    }
}
