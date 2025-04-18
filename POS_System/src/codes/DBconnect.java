package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnect {
    public static Connection connect() {
        Connection conn=null;
        try{
            //Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //open a connection
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
            //System.out.println("success");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}