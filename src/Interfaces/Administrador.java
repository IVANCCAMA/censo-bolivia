/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import dba.Mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ARMAGEDON
 */
public class Administrador extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel model;
    Statement sent;
    
    public String usuario;
    public String zona;
    
    public Administrador() {
        initComponents();
        
        conn=Mysql.getConnection();
        
        Deshabilitar();
        llenarTablaJefes();
        llenarTablaEncuestador();
        llenarTablaCenso();
        setNumViviendas();
        setNumEnc();
        setNombreAdm();
        //jTextField1.setText(InicioSesion.zona);
        //jTextField1.setEditable(false);
    }
    
    private void setNumViviendas(){
        String total = "" ;
        try {
                String sql = "SELECT COUNT(codVivienda) as cantVivienda FROM cap_a";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                total = rs.getString("cantVivienda");

            } catch (Exception e) {
                e.printStackTrace();
            }
        textNumViviendas.setText(total);
        textNumViviendas.setEditable(false);
    }
    
    private void setNumEnc(){
        String total = "" ;
        try {
                String sql = "SELECT COUNT(codUsr) as cantEnc FROM censo.usuario Where tipoUsr = 'Encuestador'";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                total = rs.getString("cantEnc");

            } catch (Exception e) {
                e.printStackTrace();
            }
        textNumEnc.setText(total);
        textNumEnc.setEditable(false);
    }
    
    private void setNombreAdm(){
        textNombre.setText(InicioSesion.nombreUrs);
        textNombre.setEditable(false);
    }
    
    private void llenarTablaEncuestador(){
        try {
            
            conn = Mysql.getConnection();
            String[]titulos = {"codUsr", "nombreUsr", "dirUsr", "telfUsr", "correoUsr", "ZonaCensal"}; // colocar mismos nombres de la tabla
            String sql = "select codUsr,nombreUsr,dirUsr,telfUsr,correoUsr,ZonaCensal from usuario "
                    + "where tipoUsr = 'Encuestador'";
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); // 
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("codUsr"); //No colocar repetidos
                fila[1]=rs.getString("nombreUsr");
                fila[2]=rs.getString("dirUsr");
                fila[3]=rs.getString("telfUsr");
                fila[4]=rs.getString("correoUsr");
                fila[5]=rs.getString("ZonaCensal");
                model.addRow(fila);
            }
            tablaEncuestador.setModel(model);
            //tablaEncuestador.setEnabled(false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    private void llenarTablaCenso(){
        try {
            
            conn = Mysql.getConnection();
            String[]titulos = {"codVivienda", "comunidad", "localidad", "barrio", "calle", "numPuerta", "totalPersonas"}; // colocar mismos nombres de la tabla
            String sql = "select codVivienda, comunidad, localidad, barrio, calle, numPuerta, totalPersonas from censo.cap_a";
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); // 
            
            String[]fila = new String[7];
            while(rs.next()){
                fila[0]=rs.getString("codVivienda"); //No colocar repetidos
                fila[1]=rs.getString("comunidad");
                fila[2]=rs.getString("localidad");
                fila[3]=rs.getString("barrio");
                fila[4]=rs.getString("calle");
                fila[5]=rs.getString("numPuerta");
                fila[6]=rs.getString("totalPersonas");
                model.addRow(fila);
            }
            tablaCenso.setModel(model);
            tablaCenso.setEnabled(false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarTablaJefes(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codUsr", "nombreUsr", "dirUsr", "telfUsr", "correoUsr", "ZonaCensal"}; // colocar mismos nombres de la tabla
            String sql = "select codUsr,nombreUsr,dirUsr,telfUsr,correoUsr,ZonaCensal from usuario "
                    + "where tipoUsr = 'Jefe de Zona'";
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); // 
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("codUsr"); //No colocar repetidos
                fila[1]=rs.getString("nombreUsr");
                fila[2]=rs.getString("dirUsr");
                fila[3]=rs.getString("telfUsr");
                fila[4]=rs.getString("correoUsr");
                fila[5]=rs.getString("ZonaCensal");
                model.addRow(fila);
            }
            tablaJefes.setModel(model);//la tabla sql adoptará el modelo "model", establecido anteriormente
            //tablaJefes.setEnabled(false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    void Deshabilitar(){
       jTextField1.setEditable(false);
       jTextField2.setEditable(false);
       jTextField3.setEditable(false);
       jTextField4.setEditable(false);
       jTextField13.setEditable(false);
       jTextField16.setEditable(false);
    }
     void Limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField13.setText("");
        jTextField16.setText("");
    }
    void Habilitar(boolean modContra){
       jTextField1.setEditable(true);
       jTextField2.setEditable(true);
       jTextField3.setEditable(true);
       jTextField4.setEditable(true);
       jTextField13.setEditable(true);
       if (modContra) jTextField16.setEditable(true);
       jTextField1.requestFocus();
    }
    public void actualizarRegistro(){
        /*int fila = tablaJefes.getSelectedRow();//obtenemos el nro de la fila seleccionada
        int id = Integer.parseInt(tablaJefes.getValueAt(fila, 0).toString());
        String nombreUser = tablaJefes.getValueAt(fila, 1).toString();
        String dirUser = tablaJefes.getValueAt(fila, 2).toString();
        String telfUser = tablaJefes.getValueAt(fila, 3).toString();
        String correoUser = tablaJefes.getValueAt(fila, 4).toString();
        String zonaCensal = tablaJefes.getValueAt(fila, 5).toString();
        try {
            conn = Mysql.getConnection();
            PreparedStatement actualizar = conn.prepareStatement("UPDATE usuario SET nombreUsr='"+nombreUser+"',dirUsr='"+dirUser+"',telfUsr='"+telfUser+"',correoUsr='"+correoUser+"',ZonaCensal='"+zonaCensal+"' WHERE codUsr = '"+id+"'");
            actualizar.executeUpdate();
            llenarTablaJefes();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelNavegador = new javax.swing.JPanel();
        BotonEncuestador = new javax.swing.JButton();
        BotonCenso = new javax.swing.JButton();
        BotonJefes = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelJefe = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJefes = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        textNumJefesZona = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        panelEncuestador = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textNumEnc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaEncuestador = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        PanelViviendas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCenso = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        textNumViviendas = new javax.swing.JTextField();
        PanelReportes = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        PanelJefesFam = new javax.swing.JPanel();
        textNumJefesFam = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNavegador.setBackground(new java.awt.Color(0, 102, 255));
        PanelNavegador.setForeground(new java.awt.Color(51, 102, 255));
        PanelNavegador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEncuestador.setText("ENCUENTADORES");
        BotonEncuestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEncuestadorActionPerformed(evt);
            }
        });
        PanelNavegador.add(BotonEncuestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 260, 70));

        BotonCenso.setText("VIVIENDAS CENSADAS");
        BotonCenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCensoActionPerformed(evt);
            }
        });
        PanelNavegador.add(BotonCenso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 260, 70));

        BotonJefes.setText("JEFES DE ZONA");
        BotonJefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJefesActionPerformed(evt);
            }
        });
        PanelNavegador.add(BotonJefes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 70));

        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        PanelNavegador.add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        jButton4.setText("VER REPORTES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelNavegador.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 260, 70));

        jButton5.setText("JEFES DE FAMILIA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PanelNavegador.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 260, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE ADMINISTRADOR:");
        PanelNavegador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNombre.setBorder(null);
        PanelNavegador.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 28));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("ADMINISTRADOR");
        PanelNavegador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel1.add(PanelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 750));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");

        panelJefe.setBackground(new java.awt.Color(255, 255, 255));
        panelJefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("DATOS USUARIO");
        panelJefe.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, -1, -1));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelJefe.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 100, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelJefe.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 630, 100, -1));

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelJefe.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, -1, -1));

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelJefe.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, -1, -1));

        jButton7.setText("Cerrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelJefe.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 630, 100, -1));

        jLabel6.setText("Nombre");
        panelJefe.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jLabel7.setText("Dirección");
        panelJefe.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jLabel8.setText("Teléfono");
        panelJefe.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));
        panelJefe.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 490, -1));
        panelJefe.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 490, -1));
        panelJefe.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 490, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        panelJefe.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 490, -1));

        tablaJefes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaJefes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaJefes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaJefesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJefes);

        panelJefe.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 580, 147));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("JEFES DE ZONA:");
        panelJefe.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, -1));

        textNumJefesZona.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNumJefesZona.setBorder(null);
        textNumJefesZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumJefesZonaActionPerformed(evt);
            }
        });
        panelJefe.add(textNumJefesZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 113, -1));

        jLabel20.setText("Correo");
        panelJefe.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));
        panelJefe.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 490, -1));

        jLabel21.setText("Zona Censal");
        panelJefe.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));
        panelJefe.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 490, -1));

        jLabel26.setText("Contraseña");
        panelJefe.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jTabbedPane1.addTab("JZ", panelJefe);

        panelEncuestador.setBackground(new java.awt.Color(255, 255, 255));
        panelEncuestador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("ENCUESTADORES:");
        panelEncuestador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        textNumEnc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNumEnc.setBorder(null);
        panelEncuestador.add(textNumEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 113, -1));

        jLabel13.setText("DATOS USUARIO");
        panelEncuestador.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        jButton13.setText("Nuevo");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panelEncuestador.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, -1, -1));

        jButton14.setText("Guardar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panelEncuestador.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, -1, -1));

        jButton15.setText("Actualizar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        panelEncuestador.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 600, -1, -1));

        jButton16.setText("Eliminar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        panelEncuestador.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 600, -1, -1));

        jButton17.setText("Cerrar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        panelEncuestador.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 122, -1));

        jLabel14.setText("Nombre");
        panelEncuestador.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel15.setText("Direccion");
        panelEncuestador.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel16.setText("Telefono");
        panelEncuestador.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));
        panelEncuestador.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 490, -1));
        panelEncuestador.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 490, -1));
        panelEncuestador.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 490, -1));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        panelEncuestador.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 490, -1));

        tablaEncuestador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEncuestador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaEncuestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEncuestadorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaEncuestador);

        panelEncuestador.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 580, 147));

        jLabel24.setText("Correo");
        panelEncuestador.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));
        panelEncuestador.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 490, -1));

        jLabel25.setText("Zona Censal");
        panelEncuestador.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        jTabbedPane1.addTab("ENC", panelEncuestador);

        PanelViviendas.setBackground(new java.awt.Color(255, 255, 255));
        PanelViviendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCenso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "codVivienda", "comunidad", "localidad", "barrio", "calle", "numPuerta", "totalPersonas"
            }
        ));
        jScrollPane3.setViewportView(tablaCenso);

        PanelViviendas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 73, 840, 680));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("VIVIENDAS CENSADAS:");
        PanelViviendas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 35, -1, -1));

        textNumViviendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNumViviendas.setBorder(null);
        PanelViviendas.add(textNumViviendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 0, 132, 29));

        jTabbedPane1.addTab("VIV", PanelViviendas);

        PanelReportes.setBackground(new java.awt.Color(255, 255, 255));
        PanelReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setText("REPORTES");
        PanelReportes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 190, 50));

        jTabbedPane1.addTab("REP", PanelReportes);

        PanelJefesFam.setBackground(new java.awt.Color(255, 255, 255));
        PanelJefesFam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textNumJefesFam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNumJefesFam.setBorder(null);
        PanelJefesFam.add(textNumJefesFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 113, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("JEFES DE FAMILIA:");
        PanelJefesFam.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel9.setText("DATOS USUARIO");
        PanelJefesFam.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, -1, -1));

        jButton8.setText("Nuevo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        PanelJefesFam.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, -1, -1));

        jButton9.setText("Guardar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        PanelJefesFam.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, -1, -1));

        jButton10.setText("Actualizar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        PanelJefesFam.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 650, -1, -1));

        jButton11.setText("Eliminar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        PanelJefesFam.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, -1, -1));

        jButton12.setText("Cerrar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        PanelJefesFam.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 650, 122, -1));

        jLabel10.setText("Nombre");
        PanelJefesFam.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel11.setText("Direccion");
        PanelJefesFam.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jLabel12.setText("Telefono");
        PanelJefesFam.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));
        PanelJefesFam.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 490, -1));
        PanelJefesFam.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 490, -1));
        PanelJefesFam.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 490, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        PanelJefesFam.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 490, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        PanelJefesFam.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 580, 147));

        jLabel22.setText("Correo");
        PanelJefesFam.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));
        PanelJefesFam.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 490, -1));

        jLabel23.setText("Zona Censal");
        PanelJefesFam.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jTabbedPane1.addTab("JF", PanelJefesFam);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -10, 1270, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, -1, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEncuestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEncuestadorActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.getSelectedIndex();
    }//GEN-LAST:event_BotonEncuestadorActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        //Boton atras
           new InicioSesion().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonCensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCensoActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        jTabbedPane1.getSelectedIndex();
    }//GEN-LAST:event_BotonCensoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON NUEVO
        Limpiar();
        Habilitar(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON GUARDAR
        try {
            String sql = "insert into usuario (nombreUsr,dirUsr,telfUsr,correoUsr,tipoUsr, contrUsr,ZonaCensal)"+
            "values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jTextField2.getText());
            ps.setString(3, jTextField3.getText());
            ps.setString(4, jTextField4.getText());
            ps.setString(5, "Jefe de Zona");
            ps.setString(6, jTextField16.getText());
            ps.setString(7, jTextField13.getText());

            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
            }
            llenarTablaJefes();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
        }
        llenarTablaJefes();
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON ACTUALIZAR
        try {
            String sql = "UPDATE usuario set nombreUsr=?, dirUsr=?, telfUsr=?, correoUsr=?, ZonaCensal=?"
            + "where codUsr=?";
            int fila = tablaJefes.getSelectedRow();
            String id = (String)tablaJefes.getValueAt(fila, 0);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jTextField2.getText());
            ps.setString(3, jTextField3.getText());
            ps.setString(4, jTextField4.getText());
            ps.setString(5, jTextField13.getText());
            ps.setString(6, id);
            int n = ps.executeUpdate();
            if(n>0){ // Si se ejecuto
                Limpiar();
                llenarTablaJefes();
                JOptionPane.showMessageDialog(null,"Registro modificado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // BOTON ELIMINAR
        try {
            int fila = tablaJefes.getSelectedRow();
            String sql = "DELETE from usuario where codUsr="+tablaJefes.getValueAt(fila, 0);
            sent=conn.createStatement();
            int n = sent.executeUpdate(sql);
            if(n>0){
                llenarTablaJefes();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BOTON CERRAR
        int r =JOptionPane.showOptionDialog(this, "¿Está seguro de cerrar la sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "No");
        if (r == 0){
            this.setVisible(false);
            new InicioSesion().setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tablaJefesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJefesMouseClicked
        // MOUSE CLICLED
        if (evt.getButton()==1){
            int fila = tablaJefes.getSelectedRow();
            try {
                Habilitar(false);
                String sql = "SELECT codUsr,nombreUsr,dirUsr,telfUsr,correoUsr,contrUsr,ZonaCensal from usuario where codUsr="+tablaJefes.getValueAt(fila,0);
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                jTextField1.setText(rs.getString("nombreUsr"));
                jTextField2.setText(rs.getString("dirUsr"));
                jTextField3.setText(rs.getString("telfUsr"));
                jTextField4.setText(rs.getString("correoUsr"));
                jTextField13.setText(rs.getString("ZonaCensal"));
                jTextField16.setText(rs.getString("contrUsr"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tablaJefesMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void tablaEncuestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEncuestadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEncuestadorMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
        jTabbedPane1.getSelectedIndex();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BotonJefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJefesActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.getSelectedIndex();
    }//GEN-LAST:event_BotonJefesActionPerformed

    private void textNumJefesZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumJefesZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumJefesZonaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        jTabbedPane1.getSelectedIndex();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonCenso;
    private javax.swing.JButton BotonEncuestador;
    private javax.swing.JButton BotonJefes;
    private javax.swing.JPanel PanelJefesFam;
    private javax.swing.JPanel PanelNavegador;
    private javax.swing.JPanel PanelReportes;
    private javax.swing.JPanel PanelViviendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelEncuestador;
    private javax.swing.JPanel panelJefe;
    private javax.swing.JTable tablaCenso;
    private javax.swing.JTable tablaEncuestador;
    private javax.swing.JTable tablaJefes;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNumEnc;
    private javax.swing.JTextField textNumJefesFam;
    private javax.swing.JTextField textNumJefesZona;
    private javax.swing.JTextField textNumViviendas;
    // End of variables declaration//GEN-END:variables
}
