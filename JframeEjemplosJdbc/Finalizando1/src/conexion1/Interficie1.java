package conexion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class Interficie1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	
	DefaultTableModel modelo1;
	Connection con = null;
	private JButton btn5;

	public Interficie1() throws SQLException {
		setTitle("Ventana principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 41, 361, 125);
		contentPane.add(scrollPane);
		
		String titulos1[]= {"id","Empleado","Departamento","Nombre","Apellido","Sueldo","Comision"};
		table = new JTable();
		modelo1 = new DefaultTableModel (null, titulos1);
		scrollPane.setViewportView(table);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setBounds(39, 181, 85, 21);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setBounds(134, 181, 85, 21);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn3.setBounds(225, 181, 85, 21);
		contentPane.add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setBounds(315, 181, 85, 21);
		contentPane.add(btn4);
		
		btn5 = new JButton("Mostrar Todo");
		btn5.addActionListener(this);
		btn5.setBounds(39, 212, 361, 21);
		contentPane.add(btn5);
		
	}
	
	private void limpiar() {
		String titulos1[]= {"id","Empleado","Departamento","Nombre","Apellido","Sueldo","Comision"};
		table = new JTable();
		modelo1 = new DefaultTableModel (null, titulos1);
		scrollPane.setViewportView(table);
	}
	
	private void mostrarTodo() {
		try {
			con = Conexion1.getInstance();
			String datos[] = new String[7];
			String sql = "SELECT * FROM empleados";
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {			
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				datos[2] = rs.getString(3);
				datos[3] = rs.getString(4);
				datos[4] = rs.getString(5);
				datos[5] = rs.getString(6);
				datos[6] = rs.getString(7);
				modelo1.addRow(datos);
			}
			table.setModel(modelo1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void sentencia1() {
		try {
			con = Conexion1.conexion1();
			String datos[] = new String[3];
			String sql = "SELECT Nombre, Apellido FROM Empleados ORDER BY Apellido;";
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {			
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				modelo1.addRow(datos);
			}
			table.setModel(modelo1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btn1==e.getSource()) {
			limpiar();
			sentencia1();
		}
		
		if (btn2==e.getSource()) {
			
		}
		
		if (btn3==e.getSource()) {
			
		}
		
		if (btn4==e.getSource()) {
			
		}
		
		if (btn5==e.getSource()) {
			limpiar();
			mostrarTodo();
		}
	}


}
