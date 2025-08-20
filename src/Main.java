import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("the fellow of the ring",423);
        Book book2 = new Book("the two towers",352);
        Book book3 = new Book("the return of the king",416);

        Book[] books = {book1, book2, book3};

        /*for (Book book : books) {
            System.out.println(book.displayInfo());
        }*/

        Library library = new Library("NYC publc library",1897, books);
        library.displayInfo();




    }
}
