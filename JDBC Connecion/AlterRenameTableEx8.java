package JDBCconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterRenameTableEx8 {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        Statement statement  = null;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            statement = cn.createStatement();
            //alter the tables
            String str = "alter table employee rename column e_id to id ";
            statement.executeUpdate(str);
            System.out.println("the table rename is the successfully.........");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            cn.close();
            statement.close();
        }
    }
}
