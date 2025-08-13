package JDBC;

import java.sql.*;

public class StudentJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String username = "root";
		String password = "root@123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url, username, password);
			Statement st = c.createStatement();

			String createTable = "CREATE TABLE IF NOT EXISTS student (" +
					"id INT PRIMARY KEY," +
					"name VARCHAR(50)," +
					"age INT," +
					"gender VARCHAR(10)," +
					"email VARCHAR(100)," +
					"phone VARCHAR(10)," +
					"address VARCHAR(100)," +
					"department VARCHAR(50)," +
					"year INT," +
					"cgpa DECIMAL(3,2))";
			st.executeUpdate(createTable);
			System.out.println("Table created.");

			st.executeUpdate("DELETE FROM student");

			String insert = "INSERT INTO student (id, name, age, gender, email, phone, address, department, year, cgpa) VALUES" +
					"(1, 'Lata', 23, 'Female', 'lata@gmail.com', '1234567890', 'Pune', 'CS', 1, 8.5)," +
					"(2, 'Seema', 21, 'Female', 'seema@gmail.com', '3456782908', 'Mumbai', 'IT', 3, 8.7)," +
					"(3, 'Vedika', 24, 'Female', 'vedika@gmail.com', '4567328976', 'Delhi', 'CIVIL', 1, 7.9)," +
					"(4, 'Anjali', 20, 'Female', 'anjali@gmail.com', '6453786589', 'Nashik', 'ECE', 1, 9.0)," +
					"(5, 'Reema', 21, 'Female', 'reema@gmail.com', '7654356897', 'Pune', 'MECH', 2, 8.3)," +
					"(6, 'Pooja', 23, 'Female', 'pooja@gmail.com', '7867345687', 'Nagpur', 'ENTC', 4, 8.9)," +
					"(7, 'Kavita', 21, 'Female', 'kavita@gmail.com', '7345678654', 'Mumbai', 'CS', 3, 7.5)," +
					"(8, 'Neha', 22, 'Female', 'neha@gmail.com', '8765342518', 'Delhi', 'EEE', 2, 8.0)," +
					"(9, 'Anvi', 23, 'Female', 'anvi@gmail.com', '7654387621', 'Pune', 'IT', 4, 8.1)," +
					"(10, 'Divya', 20, 'Female', 'divya@gmail.com', '8865480876', 'Pune', 'CIVIL', 2, 9.1)";
			st.executeUpdate(insert);
			System.out.println("10 records inserted.");

			String delete = "DELETE FROM student WHERE id IN (2, 4)";
			st.executeUpdate(delete);
			System.out.println("ID 2 and 4 deleted.");

			String update = "UPDATE student SET email = 'reema.kulkarni@gmail.com', address = 'Solapur City', department = 'MECH-BRANCH' WHERE id = 5";
			st.executeUpdate(update);
			System.out.println("ID 5 updated.");

			//Displaying the student records
			String selqry="select * from student";
			ResultSet rs = st.executeQuery(selqry);
			try {
				while(rs.next()) {
					System.out.println(rs.getInt("id")+","+rs.getString("name")
					+","+rs.getInt("age")+","+rs.getString("gender")+","+rs.getString("address"));
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			
			st.close();
			c.close();
			System.out.println("Connection closed.");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver not found: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("SQL Error: " + e.getMessage());
		}
	}
}
