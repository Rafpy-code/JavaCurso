package Formularios;

import java.awt.Button;
import java.awt.TextField;
import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import util.ConexionBaseDatos;

public class Registro extends javax.swing.JFrame {
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JTable Tabla;
	private Button btnBorrar;
	private Button btnGuardar;
	private Button btnModificar;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JScrollPane jScrollPane1;
	private JPanel panel1;
	private JPanel panelShadow1;
	private TextField txtBuscar;
	private TextField txtDireccion;
	private TextField txtEmail;
	private TextField txtIdentidad;
	private TextField txtNombre;
	private TextField txtTelefono;
	// End of variables declaration//GEN-END:variables

	conec=ConexionBaseDatos.getInstance();conec.conectar();

	public Registro() {
		initComponents();
		this.setLocationRelativeTo(this);
		Mostrar("");
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated

	private void initComponents() {

		panel1 = new JPanel();
		// panelShadow1 = new PanelShadow();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		txtNombre = new TextField();
		txtIdentidad = new TextField();
		txtDireccion = new TextField();
		txtTelefono = new TextField();
		txtEmail = new TextField();
		btnModificar = new Button();
		btnGuardar = new Button();
		btnBorrar = new Button();
		jScrollPane1 = new JScrollPane();
		Tabla = new JTable();
		txtBuscar = new TextField();
		jLabel8 = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane();

		panelShadow1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Usuarios",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

		jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Nombre:");
		// panelShadow1.add(jLabel1, new
		// org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 155, 40));

		jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Identidad:");
		// panelShadow1.add(jLabel2, new
		// org.netbeans.lib.awtextra.AbsoluteConstraints(59, 52, 155, 40));

		jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Dirección:");
		// panelShadow1.add(jLabel4, new
		// org.netbeans.lib.awtextra.AbsoluteConstraints(59, 156, 155, 40));

		jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("Teléfono:");
		// panelShadow1.add(jLabel5, new
		// org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 155, 40));

		jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("Buscar");
		// panelShadow1.add(jLabel7, new
		// org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 90, 40));

		txtNombre.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNombreActionPerformed(evt);
			}
		});
		panelShadow1.add(txtNombre);
		panelShadow1.add(txtIdentidad);
		panelShadow1.add(txtDireccion);
		panelShadow1.add(txtTelefono);
		panelShadow1.add(txtEmail);

		// btnModificar.setText("Modificar");
		btnModificar.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnModificarActionPerformed(evt);
			}
		});
		panelShadow1.add(btnModificar);

		// btnGuardar.setText("Guardar");
		btnGuardar.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnGuardarActionPerformed(evt);
			}
		});
		panelShadow1.add(btnGuardar);

		// btnBorrar.setText("Borrar");
		btnBorrar.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBorrarActionPerformed(evt);
			}
		});
		panelShadow1.add(btnBorrar);

		Tabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				TablaMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(Tabla);

		panelShadow1.add(jScrollPane1);

		txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyReleased(java.awt.event.KeyEvent evt) {
				txtBuscarKeyReleased(evt);
			}
		});
		panelShadow1.add(txtBuscar);

		jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Email:");
		panelShadow1.add(jLabel8);

		panel1.add(panelShadow1);

		getContentPane().add(panel1);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNombreActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNombreActionPerformed

	private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGuardarActionPerformed
		// TODO add your handling code here:
		Guardar();
		Mostrar("");
		txtIdentidad.setText("");
		txtNombre.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtEmail.setText("");

	}// GEN-LAST:event_btnGuardarActionPerformed

	private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtBuscarKeyReleased
		// TODO add your handling code here:
		Mostrar(txtBuscar.getText());

	}// GEN-LAST:event_txtBuscarKeyReleased

	private void TablaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TablaMouseClicked
		// TODO add your handling code here:
		Modificar();
	}// GEN-LAST:event_TablaMouseClicked

	private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnModificarActionPerformed
		// TODO add your handling code here:
		ModificarDatos();
	}// GEN-LAST:event_btnModificarActionPerformed

	private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBorrarActionPerformed
		// TODO add your handling code here:
		Borrar();

	}// GEN-LAST:event_btnBorrarActionPerformed

	public void Mostrar(String Nombre) {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Identidad");
		modelo.addColumn("Nombre");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		modelo.addColumn("Email");
		Tabla.setModel(modelo);
		String sql = "";
		if (Nombre.equals("")) {
			sql = "Select*from usuarios";
		} else {
			sql = "Select*from usuarios where Nombre like'%" + Nombre + "%'";
		}
		String Usuarios[] = new String[5];
		Statement set;
		try {
			set = conectar.createStatement();
			ResultSet resul = set.executeQuery(sql);
			while (resul.next()) {
				Usuarios[0] = resul.getString(1);
				Usuarios[1] = resul.getString(2);
				Usuarios[2] = resul.getString(3);
				Usuarios[3] = resul.getString(4);
				Usuarios[4] = resul.getString(5);
				modelo.addRow(Usuarios);

			}
			Tabla.setModel(modelo);
		} catch (SQLException ex) {
			Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void Guardar() {
		String Identidad = txtIdentidad.getText(), Nombre = txtNombre.getText(), Direccion = txtDireccion.getText(),
				Telefono = txtTelefono.getText(), Email = txtEmail.getText();
		String Sql = "Insert into usuarios() Values(?,?,?,?,?)";
		try {
			Statement set = conectar.createStatement();
			ResultSet resultado = set
					.executeQuery("Select*from usuarios where Identidad like'" + txtIdentidad.getText() + "'");
			if (resultado.next()) {
				getToolkit().beep();
				JOptionPane.showMessageDialog(null, "Usuario ya existe");
				txtIdentidad.requestFocus();
			} else if (txtIdentidad.getText().isEmpty()) {
				getToolkit().beep();
				JOptionPane.showMessageDialog(null, "Identidad Obligatoria");
				txtIdentidad.requestFocus();
			} else {
				PreparedStatement pasar = conectar.prepareStatement(Sql);
				pasar.setString(1, Identidad);
				pasar.setString(2, Nombre);
				pasar.setString(3, Direccion);
				pasar.setString(4, Telefono);
				pasar.setString(5, Email);
				pasar.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro Exitoso");
			}

		} catch (SQLException ex) {
			Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void Modificar() {
		int fila = Tabla.getSelectedRow();
		if (fila >= 0) {
			txtIdentidad.setText(Tabla.getValueAt(fila, 0).toString());
			txtNombre.setText(Tabla.getValueAt(fila, 1).toString());
			txtDireccion.setText(Tabla.getValueAt(fila, 2).toString());
			txtTelefono.setText(Tabla.getValueAt(fila, 3).toString());
			txtEmail.setText(Tabla.getValueAt(fila, 4).toString());
		} else {
			JOptionPane.showMessageDialog(null, "Seleccione fila");
		}
	}

	public void ModificarDatos() {
		try {
			PreparedStatement pasar = conectar.prepareStatement("Update usuarios set Nombre='" + txtNombre.getText()
					+ "',Dirección='" + txtDireccion.getText() + "',Telefono='" + txtTelefono.getText() + "',Email='"
					+ txtEmail.getText() + "' where Identidad='" + txtIdentidad.getText() + "'");
			pasar.executeUpdate();
			Mostrar("");

		} catch (SQLException ex) {
			Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void Borrar() {
		int fila = Tabla.getSelectedRow();
		String Identidad = Tabla.getValueAt(fila, 0).toString();
		int n = JOptionPane.showConfirmDialog(null, "Desea eliminar registro", "Registro", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (n == JOptionPane.YES_NO_OPTION) {
			try {
				PreparedStatement borrar = conectar
						.prepareStatement("Delete from usuarios where Identidad='" + Identidad + "'");
				borrar.executeUpdate();
				Mostrar("");
			} catch (SQLException ex) {
				Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Registro().setVisible(true);
			}
		});
	}catch(

	SQLException e)
	{
		throw new RuntimeException(e);
	}
}
