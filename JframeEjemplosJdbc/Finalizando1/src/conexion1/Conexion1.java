package conexion1;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion1 {

    private static String url = "jdbc:mysql://localhost:3306/jframe?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "1973";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
