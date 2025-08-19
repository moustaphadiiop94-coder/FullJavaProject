import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*for (int i = 0 ; i <= 10 ; i ++){
            System.out.println(i);
        }

        for (int i = 0 ; i <= 10 ; i +=2){
            System.out.println(i);
        }

        for (int i = 10 ; i >= 0 ; i -=2){
            System.out.println(i);
        }*/

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter how many times you want to loop ");
        int times = scanner.nextInt();

        for (int i = 1; i <= times; i++) {
            System.out.println("time " +i);
        }*/
        int start=10;

        for(int i= start ;i > 0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new year !");

        scanner.close();


    }
}
