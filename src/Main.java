import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Friend friend1 = new Friend("John Doe");
        Friend friend2 = new Friend("Jane Doe");
        Friend friend3 = new Friend("jojo Doe");
        /*System.out.println(friend1.numOFriend);
        System.out.println(friend2.numOFriend);
        System.out.println(friend3.numOFriend);*/
        //System.out.println(Friend.numOFriend);
        Friend.showFriend();

        Math.round(3.99);
        System.out.println(Math.round(3.99));








    }
}
