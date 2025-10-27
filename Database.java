import java.sql.*;

public class Database {
    private static final String URL = "jdbc:sqlite:expenses.db";
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
