package finalizando2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;

public class Interficie2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private JScrollPane scrollPane;
	private DefaultTableModel modelo2;
	Connection con2 = null;

	public Interficie2() {
		setTitle("Ventana inicio");
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
		scrollPane.setBounds(43, 55, 335, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		String titulos[]= {"id","n1","n2","n3"};
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mandangon(e);
			}
		});
		modelo2 = new DefaultTableModel (null, titulos);
		scrollPane.setViewportView(table);
		mostrar();
	}
	
	private void mandangon(MouseEvent e) {
		int fila = table.rowAtPoint(e.getPoint());
		int num1 = Integer.parseInt(table.getValueAt(fila, 1).toString());
		int num2 = Integer.parseInt(table.getValueAt(fila, 2).toString());
		int num3 = Integer.parseInt(table.getValueAt(fila, 3).toString());
		int total = num1 + num2 + num3;
		JOptionPane.showMessageDialog(null, "total: " + total);
	}
	
	private void mostrar() {
		try {
			con2 = Coneixion2.conexion();
			String datos2[] = new String[4];
			String sql = "SELECT * FROM numeros";
			java.sql.Statement st = con2.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				datos2[0] = rs.getString(1);
				datos2[1] = rs.getString(2);
				datos2[2] = rs.getString(3);
				datos2[3] = rs.getString(4);
				modelo2.addRow(datos2);
			}
			table.setModel(modelo2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
