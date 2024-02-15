package org.ramon.jdbc337.examen17052022;

import org.ramon.jdbc337.util.ConexionBaseDatos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class InterfacePractico extends JFrame implements ActionListener {

    private JPanel contentPane;

    private JScrollPane scrollPane;
    private JTable table;
    private DefaultTableModel modelo1;
    Connection con = null;

    private JTextField textN;
    private JTextField textC;
    private JTextField textV;

    private ButtonGroup bg = new ButtonGroup();
    private JRadioButton radioTotal;
    private JRadioButton radioReus;
    private JRadioButton radioBarna;
    private JRadioButton radioPrades;

    private JButton botonTotal;

    private JLabel labelTotal;

    public InterfacePractico() {
        setTitle("VENTANA COMERCIALES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setLocationRelativeTo(null);
        contentPane.setLayout(null);
        Componentes();
        mostrar();

    }

    private void Componentes() {
        scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 23, 406, 137);
        contentPane.add(scrollPane);

        String titulos1[] = {"ID", "NOMBRE", "CIUDAD", "VENTAS"};
        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickMouse(e);
            }
        });
        scrollPane.setViewportView(table);
        modelo1 = new DefaultTableModel(null, titulos1);
        scrollPane.setViewportView(table);

        JLabel lblNewLabel = new JLabel("NOMBRE");
        lblNewLabel.setBounds(20, 181, 95, 19);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("CIUDAD");
        lblNewLabel_1.setBounds(20, 215, 95, 19);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("VENTAS");
        lblNewLabel_2.setBounds(20, 242, 95, 19);
        contentPane.add(lblNewLabel_2);

        textN = new JTextField();
        textN.setBounds(95, 181, 110, 19);
        contentPane.add(textN);
        textN.setColumns(10);

        textC = new JTextField();
        textC.setBounds(95, 215, 110, 19);
        contentPane.add(textC);
        textC.setColumns(10);

        textV = new JTextField();
        textV.setBounds(95, 242, 110, 19);
        contentPane.add(textV);
        textV.setColumns(10);

        botonTotal = new JButton("TOTAL");
        botonTotal.addActionListener(this);
        botonTotal.setBounds(222, 241, 204, 21);
        contentPane.add(botonTotal);

        radioTotal = new JRadioButton("TOTAL VENTAS");
        radioTotal.setSelected(true);
        radioTotal.setBounds(222, 180, 124, 21);
        contentPane.add(radioTotal);

        radioReus = new JRadioButton("REUS");
        radioReus.setBounds(348, 180, 78, 21);
        contentPane.add(radioReus);

        radioBarna = new JRadioButton("BARCELONA");
        radioBarna.setBounds(222, 214, 103, 21);
        contentPane.add(radioBarna);

        radioPrades = new JRadioButton("PRADES");
        radioPrades.setBounds(348, 214, 78, 21);
        contentPane.add(radioPrades);

        bg.add(radioTotal);
        bg.add(radioReus);
        bg.add(radioBarna);
        bg.add(radioPrades);

        labelTotal = new JLabel("");
        labelTotal.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
        labelTotal.setHorizontalAlignment(SwingConstants.CENTER);
        labelTotal.setBounds(20, 298, 406, 19);
        contentPane.add(labelTotal);

    }

    public void mostrar() {

        try {
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[4];
            String sql = "SELECT * FROM usuarios.comerciales";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo1.addRow(datos);
            }
            table.setModel(modelo1);

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void clickMouse(MouseEvent evt) {
        int fila = table.rowAtPoint(evt.getPoint());
        textN.setText(table.getValueAt(fila, 1).toString());
        textC.setText(table.getValueAt(fila, 2).toString());
        textV.setText(table.getValueAt(fila, 3).toString());

    }

    public void totalVentas() {
        try {
            int total = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(4);
                total = total + Integer.parseInt(datos[0]);
            }
            labelTotal.setText("El Total Global: " + total);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void totalReus() {
        try {
            int total = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales WHERE `ciudad` LIKE 'Reus'";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(4);  //AQUÍ4-3
                total = total + Integer.parseInt(datos[0]);
            }
            labelTotal.setText("El Total Ventas REUS: " + total);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void totalBarna() {
        try {
            int total = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales WHERE `ciudad` LIKE 'Barcelona'";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(4);
                total = total + Integer.parseInt(datos[0]);

            }
            labelTotal.setText("El Total Ventas BARCELONA: " + total);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void totalPrades() {
        try {
            int total = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales WHERE `ciudad` LIKE 'Prades'";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(4);
                total = total + Integer.parseInt(datos[0]);

            }
            labelTotal.setText("El Total Ventas PRADES: " + total);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void ComercialesPrades() {
        try {
            String total = "";
            int x = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales WHERE `ciudad` LIKE 'Prades'";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                total = total + datos[0];
                x++;
            }               //+ "\n" + total + "\n"
            JOptionPane.showMessageDialog(null, "comerciales de Prades: " + x);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void ComercialesReus() {
        try {
            String total = "";
            int x = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales WHERE `ciudad` LIKE 'Reus'";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                total = total + datos[0];
                x++;
            }               // + "\n" + total + "\n"
            JOptionPane.showMessageDialog(null, "comerciales de Reus: "+ x);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ComercialesBarna() {
        try {
            String total = "";
            int x = 0;
            con = ConexionBaseDatos.getInstance();
            String datos[] = new String[1];
            String sql = "SELECT * FROM usuarios.comerciales WHERE `ciudad` LIKE 'Barcelona'";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                System.out.println(datos[0]);
                total = total + datos[0];
                x++;
            }               //+ "\n" + total + "\n"
            JOptionPane.showMessageDialog(null, "comerciales de Barcelona: " + x);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (botonTotal == e.getSource()) {
            if (radioTotal.isSelected()) {
                totalVentas();
            }
            if (radioReus.isSelected()) {
                totalReus();
                ComercialesReus();
            }
            if (radioBarna.isSelected()) {
                totalBarna();
                ComercialesBarna();
            }
            if (radioPrades.isSelected()) {
                totalPrades();
                ComercialesPrades();
            }
        }
    }
}