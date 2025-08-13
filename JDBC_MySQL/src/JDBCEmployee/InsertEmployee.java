package JDBCEmployee;

import java.sql.*;

public class InsertEmployee {
    public void insertRecord() {
        try {
            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();

            String query = "INSERT INTO employee VALUES (107, 'Meena', 65000)";
            int result = st.executeUpdate(query);
            System.out.println(result + " record inserted.");
            
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
