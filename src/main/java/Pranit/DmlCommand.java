package Pranit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlCommand {
    public static void main(String[] args) throws SQLException {
//crate connection to database
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing_db","root","password");
//create statement
        Statement stmt = con.createStatement();
        String s ="INSERT INTO EMP VALUES(13,'Abc',25)";
        //execute the query
        stmt.execute(s);
// close connection
        con.close();
    }
}
