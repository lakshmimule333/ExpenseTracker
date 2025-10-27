import java.sql.*;
import java.util.*;

public class ExpenseDAO {
    public static void addExpense(Expense e) {
        String sql = "INSERT INTO expenses(category, amount, date, note) VALUES(?,?,?,?)";
        try (Connection conn = Database.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, e.getCategory());
            ps.setDouble(2, e.getAmount());
            ps.setString(3, e.getDate());
            ps.setString(4, e.getNote());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static List<Expense> getAll() {
        List<Expense> list = new ArrayList<>();
        try (Connection conn = Database.connect();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM expenses")) {
            while (rs.next()) {
                list.add(new Expense(rs.getString("category"), rs.getDouble("amount"),
                        rs.getString("date"), rs.getString("note")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
