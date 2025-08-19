import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        Scanner scanner = new Scanner(System.in);


       /* for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }*/

        /*for(int i= 1 ; i<=9; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i= 1 ; i<=9; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i= 1 ; i<=9; i++){
            System.out.print(i + " ");
        }
        System.out.println();*/

        for(int i= 1 ; i<=3; i++){
            for(int j= 1 ; j<=9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }



        scanner.close();


    }
}
