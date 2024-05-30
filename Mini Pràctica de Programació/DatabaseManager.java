import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseManager {
    private Connection conn;
    private Statement stmt;
    private String url = "jdbc:mysql://localhost:3306/adil";
    private String user = "adil";
    private String password = "123";

    public DatabaseManager() throws SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
        stmt = conn.createStatement();
    }

    public void addBook(Book book) throws SQLException {
        // Código para agregar el libro a la base de dato
    }

    public List<Book> getBooks() throws SQLException {
        // Código para obtener la lista de libros de la base de datos
        return null; // Devuelve una lista vacía por ahora
    }

    public void updateBook(Book book) throws SQLException {
        // Código para actualizar el libro en la base de datos
    }

    public void deleteBook(int id) throws SQLException {
        // Código para eliminar el libro de la base de datos
    }

    public void closeConnection() throws SQLException {
        conn.close();
    }
}