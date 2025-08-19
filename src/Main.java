import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static double balance =10.99;


    public static void main(String[] args) {

        // JAVA BANKING PROGRAM


        // DECLARE VARIABLES
        boolean isRunning = true;
        int choice;

        //DISPLAY MENU
        while (isRunning) {
            System.out.println("************************");
            System.out.println("Welcome to my BANK PROGRAM");
            System.out.println("************************");
            System.out.println("1. Show balance:");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();
            // GET AND PROCESS USERS CHOICE
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }


        //EXIT MESSAGE

        System.out.println("Thank you for using our program");

        scanner.close();

    }
    //SHOW BALANCE
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    // DEPOSIT
    static double deposit() {
        scanner.useLocale(Locale.US);
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount");
        }else {
            return amount;
        }
        return 0;
    }

    //WITHDRAW
    static double withdraw() {
        scanner.useLocale(Locale.US);
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;

        } else if (amount < 0) {
            System.out.println("amount cant be negative");
            return 0;
        } else {
            return amount;
        }
    }



}
