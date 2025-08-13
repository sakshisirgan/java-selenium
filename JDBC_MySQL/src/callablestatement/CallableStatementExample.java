package callablestatement;

import java.sql.*;

public class CallableStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/product";
        String user = "root";
        String password = "root@123";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            CallableStatement cstmt = con.prepareCall("{call addProduct(?, ?, ?)}")
        ) {
            cstmt.setString(1, "Laptop");
            cstmt.setString(2, "Electronics");
            cstmt.setDouble(3, 55000.00);
            cstmt.execute();

            cstmt.setString(1, "Notebook");
            cstmt.setString(2, "Stationery");
            cstmt.setDouble(3, 45.00);
            cstmt.execute();
            
            cstmt.setString(1, "Pen");
            cstmt.setString(2, "Stationery");
            cstmt.setDouble(3, 10.00);
            cstmt.execute();

            System.out.println("Rows inserted.........");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
