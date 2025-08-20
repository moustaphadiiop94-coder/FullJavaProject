import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An Event that interrupts the normal flow of a program
        // dividing by zero , file not found mismatch input type
        // surround any dangerous code whith try catch
        // try{} catch {} finaly {}
        Locale.setDefault(Locale.US);


        try (Scanner sc = new Scanner(System.in)) {
            //System.out.println(1/0);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Its not a number");

        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This allways execute");
        }

        //sc.close();



    }
}
