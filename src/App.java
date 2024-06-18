import model.Author;
import model.Book;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Author author = new Author("George", "Martin");
        Author author2 = new Author("Yoshihiro", "Togashi");
        Book book = new Book("The Winds of Winter", author, 2024);
        Book book2 = new Book("Hunter × Hunter, Vol. 38", author2, 2024);
        book.setYear(2026);
        System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + "  " +
                book.getTitle() + "  " + book.getYear());
        System.out.println(book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + "  " +
                book2.getTitle() + "  " + book2.getYear());

        System.out.println(Objects.equals(book, book2));
        System.out.println(Objects.equals(author, author2));
    }
}
