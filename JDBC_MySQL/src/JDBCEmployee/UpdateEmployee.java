package JDBCEmployee;

import java.sql.*;

public class UpdateEmployee {
    public void updateRecord() {
        try {
            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();

            String query = "UPDATE employee SET empname = 'Kavita Patil', empsal = 55000 WHERE empid = 104";
            int result = st.executeUpdate(query);
            System.out.println(result + " record updated.");
            
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
