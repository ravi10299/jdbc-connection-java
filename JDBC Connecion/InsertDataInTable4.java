package JDBCconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataInTable4 {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        Statement statement  =null;
        try {
            cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            statement = cn.createStatement();
            //insert the values in the table employee1..........
            String str = "insert into employee1 values( 3,'ravindra',25000,'bhadoi');";

            statement.executeUpdate(str);

            System.out.println("the insertion is successfully..........");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }finally {
            cn.close();
            statement.close();
        }
    }
}
