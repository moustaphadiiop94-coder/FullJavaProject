import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

       /* LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);
*/

       /* LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);
*/

        /*LocalDate date = LocalDate.of(2024,12,25);
        System.out.println(date);*/

        LocalDateTime date1 = LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0, 0);
        LocalDateTime date = LocalDateTime.of(2024, 12, 1, 0, 0, 0);
        System.out.println(date1);
        System.out.println(date);

        if (date.isBefore(date1)) {
            System.out.println(date1 + " is earlier " + date);
        } else if (date.isEqual(date1)) {
            System.out.println(date1 + " is equal to " + date);

        } else {
            System.out.println(date1 + " is later " + date);
        }




    }
}
