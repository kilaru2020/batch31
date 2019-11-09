package jrout.tutorial.batch31.jdbc;
//import com.mysql.jdbc.Driver;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class JDBCProgram {
    // import required packages
    // loading the required classes
    // connection to database
    // making sql queries
    public static void main(String[] args) {
        /*try {
            Class.forName("jrout.tutorial.batch31.jdbc.Flute");
//            ClassLoader.getSystemClassLoader().loadClass("jrout.tutorial.batch31.jdbc.Flute");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            System.out.println("Connection established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees where first_name = 'Georgi' and last_name = 'Barinka'");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
