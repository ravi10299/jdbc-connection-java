package JDBCconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTableValuesEx6 {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        Statement statement = null;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            statement = cn.createStatement();
            //delete the values in table.......
            String str = "delete from employee1 where id =3";
            statement.executeUpdate(str);
            System.out.println("the table values is the deleted successfully......");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            cn.close();
            statement.close();
        }
    }
}
