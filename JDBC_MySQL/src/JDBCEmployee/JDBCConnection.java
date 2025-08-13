package JDBCEmployee;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	Connection con=null;
	public Connection getConnection() {
		try {
			// Replace with your database name
			String url="jdbc:mysql://localhost:3306/java_selenium";

			String username = "root";

			// Replace with your MySQL password
			String password = "root@123";

			// Load MySQL Type-4 driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			con = DriverManager.getConnection(url, username, password);

		}catch(Exception e) {e.printStackTrace();}

		return con;

	}
}
