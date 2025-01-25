import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {
    public static Connection getconnection() {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bank", "root", "root");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
