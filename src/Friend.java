public class Friend {
    String name;
    static int numOFriend;


    Friend(String name) {
        this.name = name;
        numOFriend++;
    }

    static void showFriend() {
        System.out.println("You have "+numOFriend+" friends");
    }
}
