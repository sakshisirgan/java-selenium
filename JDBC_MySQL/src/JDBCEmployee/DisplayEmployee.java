package JDBCEmployee;

import java.sql.*;
public class DisplayEmployee {
    public void displayAll() {
        try {
            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();

            String selqry = "SELECT * FROM employee";
            ResultSet rs = st.executeQuery(selqry);

            System.out.println("\nEmpID\tName\tSalary");
            System.out.println("------------------------");

            while (rs.next()) {
                System.out.println(rs.getInt("empid") + ", "
                        + rs.getString("empname") + ", "
                        + rs.getDouble("empsal"));
            }
            
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
