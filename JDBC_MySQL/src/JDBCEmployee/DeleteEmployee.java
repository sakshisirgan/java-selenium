package JDBCEmployee;

import java.sql.*;

public class DeleteEmployee {
    public void deleteRecord() {
        try {
            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();

            String query = "DELETE FROM employee WHERE empid = 105";
            int result = st.executeUpdate(query);
            System.out.println(result + " record deleted.");

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
