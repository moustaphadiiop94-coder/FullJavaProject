import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String name = "password";
        int length = name.length();
        int lastIndex = name.lastIndexOf("a");
        int index = name.indexOf(" ");

        System.out.println(index);

        if(name.isEmpty()){
            System.out.println("Empty name");
        }else {
            System.out.println("your name is "+name);
        }


        if(name.contains(" ")){
            System.out.println("name contains space");
        }else {
            System.out.println("name doesnt contain any space");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        }else {
            System.out.println("Your name is "+name);
        }

*/

        /*String email = "hello@gmail.com";
        String username = email.substring(0,5);
        String domain = email.substring(6);
        System.out.println(username);
        System.out.println(domain);*/

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);
        }else {
            System.out.print("Email must contain @ characters ");

        }

         //email = "hello@gmail.com";





        scanner.close();

    }
}
