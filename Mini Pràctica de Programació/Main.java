import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseManager dbManager = new DatabaseManager();
            dbManager.addBook(new Book(1, "Título 1", "Autor 1", 2020));
            dbManager.addBook(new Book(2, "Título 2", "Autor 2", 2019));

            List<Book> books = dbManager.getBooks();
            for (Book book : books) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }

            Book book = new Book(1, "Novela", "Autor 1", 2020);
            dbManager.updateBook(book);

            dbManager.deleteBook(2);

            books = dbManager.getBooks();
            for (Book book : books) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}