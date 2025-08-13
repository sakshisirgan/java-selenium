package main.java;

import java.sql.*;

public class Operations {
    private Connection con;

    public void connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found!", e);
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root@123");
    }

    public void close() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    public int insertData(int id, String name) throws SQLException {
        String query = "INSERT INTO student (id, name) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            return ps.executeUpdate();
        }
    }

    public int updateData(int id, String newName) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setInt(2, id);
            return ps.executeUpdate();
        }
    }

    public int deleteData(int id) throws SQLException {
        String query = "DELETE FROM student WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }

    public Connection getConnection() {
        return con;
    }
}
