package finalizando3;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion3 {
	
	private static Connection con3 = null;	//Creamos la conexion que permitira enlacar con el access
	private static String driver3 = "net.ucanaccess.jdbc.UcanaccessDriver";	//Driver pa que funcione todo
	private static String url3 = "jdbc:ucanaccess://C:\\Users\\alber\\OneDrive\\Documentos\\workspace\\eclipse\\Finalizando3\\Comerciales.accdb";			//Ruta donde tenemos la base de datos

	public static Connection conexion() {
		try {
			if(con3==null) {
				Class.forName(driver3);					//Cargamos la clase para activar el driver
				con3 = DriverManager.getConnection(url3);	//Hacemos la conexion con el driver correspondiente
				JOptionPane.showMessageDialog(null, "Conexion Establecida!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con3;	
	}
}
