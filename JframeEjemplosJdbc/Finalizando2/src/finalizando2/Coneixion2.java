package finalizando2;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Coneixion2 {
	
	private static Connection con2 = null;	//Creamos la conexion que permitira enlacar con el access
	private static String driver2 = "net.ucanaccess.jdbc.UcanaccessDriver";	//Driver pa que funcione todo
	private static String url2 = "jdbc:ucanaccess://C:\\Users\\alber\\OneDrive\\Documentos\\workspace\\eclipse\\Finalizando2\\num.accdb";			//Ruta donde tenemos la base de datos

	
	public static Connection conexion() {
		try {
			if(con2==null) {
				Class.forName(driver2);					//Cargamos la clase para activar el driver
				con2 = DriverManager.getConnection(url2);	//Hacemos la conexion con el driver correspondiente
				JOptionPane.showMessageDialog(null, "Conexion Establecida!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con2;	
	}
}
