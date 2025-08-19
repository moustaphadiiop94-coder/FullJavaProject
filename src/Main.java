import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] fruits = {"apple" , "banana", "orange", "pineapple"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        fruits[0] = "tomato";
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        for (int i = 0; i < numOfFruits; i++) {
            System.out.print(fruits[i]+" ");
        }
        System.out.println();

        Arrays.sort(fruits);

        Arrays.fill(fruits, "apple");

        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }


    }
}
