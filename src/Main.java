import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // HashMap is a structure that stores key value pairs
        // keys are unique , but values can be duplicated
        //does not maintain any order , but is memory efficient
        // HashMap <Key , Value)

        HashMap<String , Double> map = new HashMap<>();
        map.put("apple",0.50);
        map.put("orange",0.40);
        map.put("banana",0.20);
        map.put("grapes",0.10);

        //map.remove("apple");
        //System.out.println(map.get("banana"));

        System.out.println(map.containsKey("apple"));

        System.out.println(map.containsValue(0.50));

        System.out.println(map.size());

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }


    }
}
