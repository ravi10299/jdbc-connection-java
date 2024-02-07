package JDBCconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class ConnectionEx1 {
    public static void main(String[] args) throws SQLException {

        //step 1
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Testdb","root","root");
        //step 2
        Statement statement = cn.createStatement();
        //step3 create the table
//        String str = "create table Employee(id int,name varchar(20),city varchar(20),salary double(7,2))";

        //step4

//         statement.executeUpdate(str);
//        System.out.println("the Employee table is created");

        //insert the values in the table;

        String str1 = "Insert into Employee values(3,'shashi kumar','chandauli',30000 )";
        statement.executeUpdate(str1);
        System.out.println("insert the data successfully....");



        //update the table

//        String str2 = "update Employee set salary = 50000 where id=1";
//        statement.executeUpdate(str2);
//        System.out.println("the query is the successfully updated....");
    }
}
