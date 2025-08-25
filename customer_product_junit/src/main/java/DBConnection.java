package main.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	String url = "jdbc:mysql://localhost:3306/productdb";
	String username = "root";
	String password = "root@123";
	Connection con = null;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Database Connected Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
