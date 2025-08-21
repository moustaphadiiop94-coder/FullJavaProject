import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Enum enumeration a special kind of class that represent a fixed set of constants.
        //they improve code readability and easy to maintain . More efficient whith switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);

        Day day = Day.MONDAY;

        System.out.println(day);

        System.out.println(day.getDayNumber());

        System.out.println("Enter a day of week");
        String dayOfWeek = scanner.nextLine().toUpperCase(Locale.US);

        try {
            day = Day.valueOf(dayOfWeek);

            switch(day) {
                case MONDAY ,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY-> System.out.println("its Week day");
                case SATURDAY,SUNDAY -> System.out.println("its Weekend");
            }



        }catch (IllegalArgumentException e){
            System.out.println("Illegal argument "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid day");
        }



        scanner.close();

    }
}
