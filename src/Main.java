import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int [] numbers = { 1 , 2 , 3 , 4 , 5 };
        String [] fruits ={"apple","orange","banana"};
        //int target = 3;
        System.out.println("Enter a fruit to search for :");
        String target = sc.nextLine();
        boolean isFound = false;

        /*for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]) {
                System.out.println("element found at index "+i);
                isFound = true;
                break;
            }
        }*/
        for(int i = 0 ; i < fruits.length ; i++){
            if(fruits[i].equals(target)){
                isFound = true;
                System.out.println("Element found at index : "+i);
                break;
            }
        }
        if(!isFound) {
            System.out.println("element not found");
        }




        sc.close();


    }
}
