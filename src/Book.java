public class Book {
    private String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo() {
        return "Title: " + this.title + " Pages: " + this.pages;
    }
}
