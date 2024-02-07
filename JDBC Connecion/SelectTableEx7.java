package JDBCconnector;

import java.sql.*;

public class SelectTableEx7 {
    public static void main(String[] args) {
        Connection cn =  null;
        Statement statement = null;
        try {
            cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            statement=cn.createStatement();
            //select the table.......
            String str = "select  * from employee1";
            ResultSet resultSet =  statement.executeQuery(str);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("e_id")+" "+resultSet.getString("name")+" "+resultSet.getDouble("salary")+" "+resultSet.getString("city"));
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                cn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
