package JDBCconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx3 {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        Statement statement = null;


        try {
            //load the jdbc driver.......
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            statement = cn.createStatement();
            String str = "create table employee11(id int ,name varchar(20),salary double(7,2),city varchar(20))";
            statement.executeUpdate(str);
            System.out.println("the table is created successfully........");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            cn.close();
            statement.close();

        }
    }
}
