package preparedstatement;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String user = "root";
        String password = "root@123";

        // SQL queries
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String delSQL = "DELETE FROM users WHERE name = ?";
        String updSQL = "UPDATE users SET name = ? WHERE id = 8";

        try (
            // Create connection and prepare statements
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmtIns = conn.prepareStatement(insertSQL);
            PreparedStatement pstmtDel = conn.prepareStatement(delSQL);
            PreparedStatement pstmtUpd = conn.prepareStatement(updSQL);
        ) {
            // Insert Adam
            pstmtIns.setString(1, "Adam");
            pstmtIns.setString(2, "adam@example.com");

            // Delete Adam
            pstmtDel.setString(1, "Adam");

            // Update name for id = 8 to 'Harry'
            pstmtUpd.setString(1, "Harry");

            // Execute statements
            int rowsInserted = pstmtIns.executeUpdate();
            int rowsDeleted = pstmtDel.executeUpdate();
            int rowsUpdated = pstmtUpd.executeUpdate();

            // Output results
            System.out.println(rowsInserted + " row(s) inserted.");
            System.out.println(rowsDeleted + " row(s) deleted.");
            System.out.println(rowsUpdated + " row(s) updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
