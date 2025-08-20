import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String [] fruits = {"apple ","orange ","banana "};
        String [] vegetables = {"potato ","onion ","carrot "};
        String [] meats = {"chicken ","beef ","fish ","pork"};

        //String [][] groceries = {fruits,vegetables,meats};
        String [][] groceries = {{"apple ","orange ","banana "},
                                 {"potato ","onion ","carrot "},
                                 {"chicken ","beef ","fish ","pork"}};
        groceries[0][0] = "pineapple ";
        groceries[1][0] = "celery ";
        groceries[1][2] = "grape ";
        groceries[2][1] = "eggs ";
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food);
            }
            System.out.println();
        }




        sc.close();


    }
}
