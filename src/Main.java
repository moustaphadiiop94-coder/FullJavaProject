import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        User user1 = new User("Diara");
        System.out.println(user1.userName);
        System.out.println(user1.age);
        System.out.println(user1.email);

        User user2 = new User("tapha","tapha@gmail.com");
        System.out.println(user2.userName);
        System.out.println(user2.age);
        System.out.println(user2.email);

        User user3 = new User("bamba","bamba@gmail.com",30);
        System.out.println(user3.userName);
        System.out.println(user3.age);
        System.out.println(user3.email);

        User user4 = new User();
        System.out.println(user4.userName);
        System.out.println(user4.age);
        System.out.println(user4.email);





    }
}
