package org.ramon.jdbc337.jframe3;

import org.ramon.jdbc337.util.ConexionBaseDatos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaze3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel modelo3;
	
	private Connection con3 = null;
	
	private JButton btnConsulta;
	private JButton btnTotal;

	public Interfaze3() {
		setResizable(false);
		setTitle("Ventana Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		iniciarComponentes();
		mostrarValores();
		
	}

	private void iniciarComponentes() {
		JLabel dni = new JLabel();
		contentPane.add(dni);
		dni.setText("DNI:");
		dni.setBounds(40, 27, 153, 19);
		text1 = new JTextField();
		text1.setBounds(75, 27, 153, 19);
		contentPane.add(text1);
		text1.setColumns(10);

		JLabel nombre = new JLabel();
		contentPane.add(nombre);
		nombre.setText("NOMBRE:");
		nombre.setBounds(10, 60, 153, 19);
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(75, 60, 153, 19);
		contentPane.add(text2);

		JLabel apellido = new JLabel();
		contentPane.add(apellido);
		apellido.setText("APELLIDO:");
		apellido.setBounds(10, 91, 153, 19);
		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(75, 91, 153, 19);
		contentPane.add(text3);

		JLabel telefono = new JLabel();
		contentPane.add(telefono);
		telefono.setText("TLF:");
		telefono.setBounds(260, 27, 153, 19);
		text4 = new JTextField();
		text4.setColumns(10);
		text4.setBounds(297, 27, 171, 19);
		contentPane.add(text4);

		JLabel ventas = new JLabel();
		contentPane.add(ventas);
		ventas.setText("VENTAS:");
		ventas.setBounds(240, 60, 153, 19);
		text5 = new JTextField();
		text5.setColumns(10);
		text5.setBounds(297, 60, 171, 19);
		contentPane.add(text5);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 138, 395, 163);
		contentPane.add(scrollPane);
		
		String titulos3[] = {"id","DNI","Nombre","Correo","Telefono","Ventas"};
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				pillarValores(evt);
			}
		});
		modelo3 = new DefaultTableModel (null, titulos3);
		scrollPane.setViewportView(table);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(this);
		btnConsulta.setBounds(75, 314, 153, 21);
		contentPane.add(btnConsulta);
		
		btnTotal = new JButton("Total");
		btnTotal.addActionListener(this);
		btnTotal.setBounds(297, 314, 171, 21);
		contentPane.add(btnTotal);
	}

	public void limpiarTable() {
		String titulos3[] = {"id","DNI","Nombre","Correo","Telefono","Ventas"};
		table = new JTable();
		modelo3 = new DefaultTableModel (null, titulos3);
		scrollPane.setViewportView(table);
	}
	
	private void mostrarValores() {
		try {
			con3 = ConexionBaseDatos.getInstance();
			String datos[] = new String[6];
			String sql = "SELECT * FROM comerciales";
			java.sql.Statement st = con3.createStatement();
			ResultSet rs = st.executeQuery(sql);	
			while (rs.next()) {
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				datos[2] = rs.getString(3);
				datos[3] = rs.getString(4);
				datos[4] = rs.getString(5);
				datos[5] = rs.getString(6);
				modelo3.addRow(datos);
			}
			table.setModel(modelo3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void totales() {
		try {
		double total = 0;
		con3 = ConexionBaseDatos.getInstance();
		String datos[] = new String[1];			
		String sql = "SELECT ventas FROM comerciales";
		java.sql.Statement st = con3.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			datos[0] = rs.getString(1);
			total = total + Double.parseDouble(datos[0]);
		}
		JOptionPane.showMessageDialog(null, total);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConsulta==e.getSource()){
			
		}
		
		if(btnTotal==e.getSource()){
			totales();
		}
		
	}
	
	private void pillarValores(MouseEvent evt) {
		int fila = table.rowAtPoint(evt.getPoint());		
		text1.setText(table.getValueAt(fila, 1).toString());
		text2.setText(table.getValueAt(fila, 2).toString());
		text3.setText(table.getValueAt(fila, 3).toString());
		text4.setText(table.getValueAt(fila, 4).toString());
		text5.setText(table.getValueAt(fila, 5).toString());
	}
}
