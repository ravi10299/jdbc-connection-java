package JDBCconnector;

import java.sql.*;

public class ConnectionEx2 {
    public static void main(String[] args) throws SQLException {
        Connection cn1=null;
        Statement statement = null;
        try {
             cn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Testdb","root","root");
            statement = cn1.createStatement();
            String str3  ="SELECT * FROM EMPLOYEE";
            ResultSet resultSet  = statement.executeQuery(str3);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +" "+resultSet.getString("name")+" "+resultSet.getString("city")+" "+ resultSet.getDouble("salary"));
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            cn1.close();
            statement.close();

        }




    }
}
