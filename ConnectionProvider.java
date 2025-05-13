package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getCon() {
        Connection con = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            System.out.println("✅ MySQL JDBC Driver Loaded Successfully.");

            // Set credentials manually (Ensure they are correct)
            String url = "jdbc:mysql://localhost:3306/lms?useSSL=false&allowPublicKeyRetrieval=true";
            String user = "root";  // ✅ Replace with correct MySQL username
            String password = "Subham@123";  // ✅ Replace with correct password

            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database Connected Successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ ERROR: MySQL JDBC Driver not found.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("❌ ERROR: Database connection failed.");
            e.printStackTrace();
            return null;
        }
        return con;
    }
}
