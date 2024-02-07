package JDBCconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableEx5 {
    public static void main(String[] args) throws SQLException {
        Connection cn  = null;
        Statement statement  =null;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            statement=cn.createStatement();
            //update the table ......
            String str = "update employee1 set salary  = 26000 where id =  2";
            statement.executeUpdate(str);
            System.out.println("update the tab table is successfully.......");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            cn.close();
            statement.close();        }
    }
}
