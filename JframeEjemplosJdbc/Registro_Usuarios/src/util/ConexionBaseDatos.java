/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

	private static String url = "jdbc:mysql://localhost:3306/usuarios?serverTimezone=Europe/Madrid";
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
