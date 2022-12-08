package Interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import dba.Mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CapB extends javax.swing.JFrame {
    Connection conn;
    FondoPanel fondo = new FondoPanel();
    
    public CapB() {
        this.setContentPane(fondo);
        initComponents();
        conn=Mysql.getConnection();
        
        txtCodVivienda.setText(Encuestador.codVivienda);
        txtCodVivienda.setEditable(false);
    }
    
    private void deshabilitarBton(){
            jButton3.setEnabled(false);
    }
    private void habilitarBton(){
            jButton3.setEnabled(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioNoTiene = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton50 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jRadioButton106 = new javax.swing.JRadioButton();
        jRadioButton107 = new javax.swing.JRadioButton();
        jRadioButton108 = new javax.swing.JRadioButton();
        jRadioButton109 = new javax.swing.JRadioButton();
        jRadioButton110 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jRadioButton112 = new javax.swing.JRadioButton();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton114 = new javax.swing.JRadioButton();
        jRadioButton115 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        jRadioButton103 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jRadioButton105 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodVivienda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Vivienda colectiva");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 233, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Casa/Choza/Pahuichi");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 52, 205, 15));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Departamento");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, 204, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Cuarto(s)o habitacion(es) suelta(s)");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 106, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Vivienda improvisada");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 139, -1, -1));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Local  no destinado para vivienda ");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 172, 286, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Particular");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 97, -1));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Persona que vive en la calle ");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 359, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Colectiva");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, -1));

        jLabel11.setText("(Hoteles, hospitales,asilos,cuarteles y otros)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 266, -1, 16));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Sin vivienda ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 299, -1, -1));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("En transito");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 326, 286, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("1-Tipo vivienda ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 160, -1));

        jButton3.setText("Pase al capitulo F");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 397));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("<html>3. ¿Cuál es el material de construcción más utilizado<p> en las paredes exteriores de esta vivienda?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, -1, 40));

        buttonGroup7.add(jRadioButton17);
        jRadioButton17.setText("Ladrillo, bloque de cemento, hormigón");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        buttonGroup7.add(jRadioButton18);
        jRadioButton18.setText("Adobe,tapial");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 371, -1));

        buttonGroup7.add(jRadioButton19);
        jRadioButton19.setText("Tabique,quinche");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, 20));

        buttonGroup7.add(jRadioButton23);
        jRadioButton23.setText("Madera");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 21));

        buttonGroup7.add(jRadioButton25);
        jRadioButton25.setText("Caña,palma,tronco");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 15));

        buttonGroup7.add(jRadioButton27);
        jRadioButton27.setText("Otro");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 15));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 381, 230));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setText("<html>5. ¿Cuál es el material más utilizado en los<p> techos de esta vivienda?");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        buttonGroup9.add(jRadioButton20);
        jRadioButton20.setText("Calamina o plancha metálica");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 61, 267, 15));

        buttonGroup9.add(jRadioButton22);
        jRadioButton22.setText("Teja de arcilla, teja de cemento, fibrocemento");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 83, -1, -1));

        buttonGroup9.add(jRadioButton24);
        jRadioButton24.setText("Losa de hormigón armado");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 116, 265, -1));

        buttonGroup9.add(jRadioButton26);
        jRadioButton26.setText("Paja, palma, caña, barro");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 149, 265, -1));

        buttonGroup9.add(jRadioButton14);
        jRadioButton14.setText("Otro");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 182, 265, -1));

        buttonGroup9.add(jRadioButton21);
        jRadioButton21.setText("Piedra");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 215, 90, 15));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 380, 250));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setText("2. La vivienda esta ...");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 8, 190, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel17.setText("Vivienda ocupadas ");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 36, -1, -1));

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setText("ocupada por personas presentes ");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, -1, -1));

        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setText("ocupada con personas temporalmente ausentes ");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 91, 198, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel20.setText("Viviendas desocupadas");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 130, 190, -1));

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("para alquilar y/o vender ");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 152, -1, -1));

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("en construccion o reparacion");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 185, -1, -1));

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setText("abandonada ");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 218, 176, -1));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 450, 250));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("<HTML>4. ¿Las paredes interiores de esta vivienda <P>tienen revoque?");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        buttonGroup6.add(jRadioButton15);
        jRadioButton15.setText("Si");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 147, -1));

        buttonGroup6.add(jRadioButton16);
        jRadioButton16.setText("No");
        jPanel8.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 117, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 380, 150));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("6. ¿Cuál es el material más utilizado en los pisos de esta vivienda?");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 373, -1));

        buttonGroup5.add(jRadioButton28);
        jRadioButton28.setText("Tierra");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 24, 98, -1));

        buttonGroup5.add(jRadioButton29);
        jRadioButton29.setText("Tablon de madera");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 57, 174, -1));

        buttonGroup5.add(jRadioButton30);
        jRadioButton30.setText("Machihembre");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 90, 98, -1));

        buttonGroup5.add(jRadioButton31);
        jRadioButton31.setText("Parquet");
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 123, 174, -1));

        buttonGroup5.add(jRadioButton32);
        jRadioButton32.setText("Ceramica");
        jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton32ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 155, 174, -1));

        buttonGroup5.add(jRadioButton33);
        jRadioButton33.setText("Cemento");
        jPanel11.add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 188, 174, -1));

        buttonGroup5.add(jRadioButton34);
        jRadioButton34.setText("Mosaico,baldosa");
        jPanel11.add(jRadioButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 221, 174, -1));

        buttonGroup5.add(jRadioButton35);
        jRadioButton35.setText("Ladrillo");
        jPanel11.add(jRadioButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 254, 174, -1));

        buttonGroup5.add(jRadioButton36);
        jRadioButton36.setText("Otro");
        jPanel11.add(jRadioButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 287, 98, -1));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 24, -1, 320));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup8.add(jRadioButton37);
        jRadioButton37.setText("pileta pública?");
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 302, 30));

        buttonGroup8.add(jRadioButton38);
        jRadioButton38.setText("carro repartidor (aguatero)?");
        jPanel12.add(jRadioButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 302, 30));

        buttonGroup8.add(jRadioButton39);
        jRadioButton39.setText("pozo o noria con bomba?");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 302, 30));

        buttonGroup8.add(jRadioButton40);
        jRadioButton40.setText("pozo o noria sin bomba?");
        jPanel12.add(jRadioButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 302, 30));

        buttonGroup8.add(jRadioButton41);
        jRadioButton41.setText("lluvia, río, vertiente, acequia?");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 302, 30));

        buttonGroup8.add(jRadioButton42);
        jRadioButton42.setText("lago, laguna, curichi?");
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 302, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("7. Principalmente, ¿el agua que usan en la vivienda ");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 16, -1, -1));

        buttonGroup8.add(jRadioButton43);
        jRadioButton43.setText("cañería de red?");
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 302, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel25.setText("proviene de…");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 42, 94, -1));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 380, 320));

        jTabbedPane1.addTab("CapituloB1", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setText("8. ¿El agua que usan en la vivienda se distribuye…");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, -1, -1));

        buttonGroup10.add(jRadioButton44);
        jRadioButton44.setText("por cañería dentro de la vivienda?");
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 33, 449, -1));

        buttonGroup10.add(jRadioButton45);
        jRadioButton45.setText("por cañería fuera de la vivienda pero dentro del lote o terreno?");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 66, -1, -1));

        buttonGroup10.add(jRadioButton46);
        jRadioButton46.setText("por cañería fuera de la vivienda y del lote o terreno? ");
        jPanel7.add(jRadioButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 99, 403, -1));

        buttonGroup10.add(jRadioButton47);
        jRadioButton47.setText(" no se distribuye por cañería?");
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 132, 358, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 32, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup11.add(jRadioButton48);
        jRadioButton48.setText("Sí, de uso compartido");
        jPanel13.add(jRadioButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 63, -1, -1));

        buttonGroup11.add(jRadioNoTiene);
        jRadioNoTiene.setText("No tiene");
        jRadioNoTiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNoTieneActionPerformed(evt);
            }
        });
        jPanel13.add(jRadioNoTiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 139, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("9. ¿Tiene servicio sanitario, baño o letrina?");
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 247, -1));

        buttonGroup11.add(jRadioButton50);
        jRadioButton50.setText("Sí, de uso privado");
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });
        jPanel13.add(jRadioButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 175, -1));

        jLabel26.setText("Pase a la pregunta 11");
        jPanel13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 99, -1, -1));

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 205, 460, 150));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("10. ¿El servicio sanitario, baño o letrina tiene desagüe...");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        buttonGroup12.add(jRadioButton51);
        jRadioButton51.setText("al alcantarillado?");
        jPanel14.add(jRadioButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 154, 40));

        buttonGroup12.add(jRadioButton52);
        jRadioButton52.setText("a una camara septica?  ");
        jRadioButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton52ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 154, 40));

        buttonGroup12.add(jRadioButton53);
        jRadioButton53.setText("a un pozo ciego?");
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 154, 40));

        buttonGroup12.add(jRadioButton54);
        jRadioButton54.setText("a la calle?");
        jPanel14.add(jRadioButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 154, 40));

        buttonGroup12.add(jRadioButton55);
        jRadioButton55.setText("a la quebrada, rio?");
        jRadioButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton55ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 40));

        buttonGroup12.add(jRadioButton56);
        jRadioButton56.setText("a un lago ,laguna ,curichi");
        jPanel14.add(jRadioButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 40));

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 368, 460, 290));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(jRadioButton57);
        jRadioButton57.setText("red de empresa eléctrica (servicio público)?");
        jRadioButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton57ActionPerformed(evt);
            }
        });
        jPanel15.add(jRadioButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 325, -1));

        buttonGroup2.add(jRadioButton58);
        jRadioButton58.setText("motor propio?");
        jRadioButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton58ActionPerformed(evt);
            }
        });
        jPanel15.add(jRadioButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 63, 319, -1));

        buttonGroup2.add(jRadioButton59);
        jRadioButton59.setText("panel solar?");
        jRadioButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton59ActionPerformed(evt);
            }
        });
        jPanel15.add(jRadioButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 96, 319, -1));

        buttonGroup2.add(jRadioButton60);
        jRadioButton60.setText("otra?");
        jRadioButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton60ActionPerformed(evt);
            }
        });
        jPanel15.add(jRadioButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 129, 319, -1));

        buttonGroup2.add(jRadioButton61);
        jRadioButton61.setText("no tiene?");
        jRadioButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton61ActionPerformed(evt);
            }
        });
        jPanel15.add(jRadioButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 162, 254, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setText("11. ¿Tienen energía eléctrica que proviene de…");
        jPanel15.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 310, -1));

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 32, 333, 159));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setText("<html>12. ¿Cuál es el principal combustible o<p> energía que \nutilizan para cocinar?");
        jPanel16.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 327, -1));

        buttonGroup13.add(jRadioButton62);
        jRadioButton62.setText("Gas domiciliario (por cañeria)");
        jRadioButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton62ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 46, 205, -1));

        buttonGroup13.add(jRadioButton63);
        jRadioButton63.setText("Gas en garrafa");
        jPanel16.add(jRadioButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 79, 170, -1));

        buttonGroup13.add(jRadioButton64);
        jRadioButton64.setText("Electricidad");
        jRadioButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton64ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 112, 170, -1));

        buttonGroup13.add(jRadioButton65);
        jRadioButton65.setText("Energia solar ");
        jPanel16.add(jRadioButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 170, -1));

        buttonGroup13.add(jRadioButton66);
        jRadioButton66.setText("Leña");
        jRadioButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton66ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 178, 98, -1));

        buttonGroup13.add(jRadioButton67);
        jRadioButton67.setText("Guano,bostia o taquia");
        jRadioButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton67ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 211, 190, -1));

        buttonGroup13.add(jRadioButton68);
        jRadioButton68.setText("Otro");
        jRadioButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton68ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 79, 98, -1));

        buttonGroup13.add(jRadioButton69);
        jRadioButton69.setText("No cocina ");
        jRadioButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton69ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 112, -1, -1));

        jPanel4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 197, 337, 250));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel21.setText("13. ¿Tiene un cuarto sólo para cocinar?");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 290, -1));

        buttonGroup14.add(jRadioButton70);
        jRadioButton70.setText("Si");
        jRadioButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton70ActionPerformed(evt);
            }
        });
        jPanel17.add(jRadioButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 98, -1));

        buttonGroup14.add(jRadioButton71);
        jRadioButton71.setText("No");
        jRadioButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton71ActionPerformed(evt);
            }
        });
        jPanel17.add(jRadioButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 104, 30));

        jPanel4.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 337, 190));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel22.setText("<html>14. ¿Cuántos cuartos o habitaciones<p> ocupa su hogar, sin contar cuartos de baño y de cocina? ");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 8, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel18.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));

        jPanel4.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 32, 430, 100));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel23.setText("<html>15. Del total de cuartos o habitaciones<p> ¿cuántos se utilizan sólo para dormir?");
        jPanel19.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));
        jPanel19.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, -1));

        jPanel4.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 430, 150));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel24.setText("16. ¿Cómo eliminan principalmente la basura?");
        jPanel20.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 5, 320, -1));

        buttonGroup15.add(jRadioButton73);
        jRadioButton73.setText("La depositan en el basurero público o contenedor");
        jRadioButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton73ActionPerformed(evt);
            }
        });
        jPanel20.add(jRadioButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 437, -1));

        buttonGroup15.add(jRadioButton74);
        jRadioButton74.setText("Utilizan el servicio público de recolección (carro basurero)");
        jRadioButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton74ActionPerformed(evt);
            }
        });
        jPanel20.add(jRadioButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 437, -1));

        buttonGroup15.add(jRadioButton75);
        jRadioButton75.setText("La botan en un terreno baldío o en la calle");
        jRadioButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton75ActionPerformed(evt);
            }
        });
        jPanel20.add(jRadioButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 342, -1));

        buttonGroup15.add(jRadioButton76);
        jRadioButton76.setText("La botan al rio");
        jRadioButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton76ActionPerformed(evt);
            }
        });
        jPanel20.add(jRadioButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 104, -1));

        buttonGroup15.add(jRadioButton77);
        jRadioButton77.setText("La queman ");
        jPanel20.add(jRadioButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 104, -1));

        buttonGroup15.add(jRadioButton78);
        jRadioButton78.setText("La entierran");
        jPanel20.add(jRadioButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 104, -1));

        buttonGroup15.add(jRadioButton72);
        jRadioButton72.setText("Otra forma");
        jPanel20.add(jRadioButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 104, -1));

        jPanel4.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 322, 430, 340));

        jTabbedPane1.addTab("CapituloB2", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup16.add(jRadioButton106);
        jRadioButton106.setText("No");
        jRadioButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton106ActionPerformed(evt);
            }
        });
        jPanel24.add(jRadioButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 54, -1, -1));

        buttonGroup20.add(jRadioButton107);
        jRadioButton107.setText("Si");
        jPanel24.add(jRadioButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 186, -1, -1));

        buttonGroup18.add(jRadioButton108);
        jRadioButton108.setText("Si");
        jPanel24.add(jRadioButton108, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 120, -1, -1));

        buttonGroup19.add(jRadioButton109);
        jRadioButton109.setText("Si");
        jRadioButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton109ActionPerformed(evt);
            }
        });
        jPanel24.add(jRadioButton109, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 153, -1, -1));

        buttonGroup17.add(jRadioButton110);
        jRadioButton110.setText("Si");
        jRadioButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton110ActionPerformed(evt);
            }
        });
        jPanel24.add(jRadioButton110, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 90, 45, 21));

        buttonGroup16.add(jRadioButton111);
        jRadioButton111.setText("Si");
        jRadioButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton111ActionPerformed(evt);
            }
        });
        jPanel24.add(jRadioButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 54, -1, -1));

        jLabel38.setText("servicio de telefonía fija o celular?");
        jPanel24.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 189, -1, -1));

        jLabel39.setText("servicio de internet?");
        jPanel24.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 159, 114, -1));

        jLabel40.setText("Computadora?");
        jPanel24.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 123, 88, -1));

        jLabel41.setText("Televisor?");
        jPanel24.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 90, 88, -1));

        jLabel42.setText("Radio?");
        jPanel24.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 57, 66, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel43.setText("17. ¿Este hogar tiene…");
        jPanel24.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 221, -1));

        buttonGroup20.add(jRadioButton112);
        jRadioButton112.setText("No");
        jPanel24.add(jRadioButton112, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 186, -1, -1));

        buttonGroup19.add(jRadioButton113);
        jRadioButton113.setText("No");
        jPanel24.add(jRadioButton113, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 153, 55, -1));

        buttonGroup18.add(jRadioButton114);
        jRadioButton114.setText("No");
        jRadioButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton114ActionPerformed(evt);
            }
        });
        jPanel24.add(jRadioButton114, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 120, 55, -1));

        buttonGroup17.add(jRadioButton115);
        jRadioButton115.setText("No");
        jPanel24.add(jRadioButton115, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jPanel3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 400, 620));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup25.add(jRadioButton89);
        jRadioButton89.setText("No");
        jPanel22.add(jRadioButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 174, 54, -1));

        buttonGroup24.add(jRadioButton90);
        jRadioButton90.setText("No");
        jRadioButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton90ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 141, 54, -1));

        buttonGroup23.add(jRadioButton91);
        jRadioButton91.setText("No");
        jRadioButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton91ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 108, 54, -1));

        buttonGroup22.add(jRadioButton92);
        jRadioButton92.setText("No");
        jRadioButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton92ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 75, 54, -1));

        buttonGroup21.add(jRadioButton93);
        jRadioButton93.setText("No");
        jPanel22.add(jRadioButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 42, 54, -1));

        buttonGroup25.add(jRadioButton94);
        jRadioButton94.setText("Si");
        jRadioButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton94ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 174, 53, -1));

        buttonGroup24.add(jRadioButton95);
        jRadioButton95.setText("Si");
        jRadioButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton95ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 141, 53, -1));

        buttonGroup23.add(jRadioButton96);
        jRadioButton96.setText("Si");
        jRadioButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton96ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 108, 53, -1));

        buttonGroup22.add(jRadioButton97);
        jRadioButton97.setText("Si");
        jPanel22.add(jRadioButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 75, 53, -1));

        buttonGroup21.add(jRadioButton98);
        jRadioButton98.setText("Si");
        jPanel22.add(jRadioButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 42, 53, -1));

        jLabel31.setText("deslizador, balsa, canoa o bote?");
        jPanel22.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 180, -1, -1));

        jLabel32.setText("carreta o carretón?");
        jPanel22.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 147, 126, -1));

        jLabel33.setText("motocicleta o cuadratrac?");
        jPanel22.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 114, 189, -1));

        jLabel34.setText("bicicleta?");
        jPanel22.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 87, 77, -1));

        jLabel35.setText("vehículo automotor?");
        jPanel22.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 54, 157, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel36.setText("18. ¿Este hogar tiene…");
        jPanel22.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        jPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 380, 620));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup26.add(jRadioButton99);
        jRadioButton99.setText("otra?");
        jPanel23.add(jRadioButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 228, 104, -1));

        buttonGroup26.add(jRadioButton100);
        jRadioButton100.setText("prestada por parientes o amigos?");
        jPanel23.add(jRadioButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 195, -1, -1));

        buttonGroup26.add(jRadioButton101);
        jRadioButton101.setText("cedida por servicios?");
        jRadioButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton101ActionPerformed(evt);
            }
        });
        jPanel23.add(jRadioButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 162, 257, -1));

        buttonGroup26.add(jRadioButton102);
        jRadioButton102.setText("en contrato anticrético y alquiler?");
        jRadioButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton102ActionPerformed(evt);
            }
        });
        jPanel23.add(jRadioButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 129, 280, -1));

        buttonGroup26.add(jRadioButton103);
        jRadioButton103.setText("en contrato anticrético?");
        jPanel23.add(jRadioButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 96, -1, -1));

        buttonGroup26.add(jRadioButton104);
        jRadioButton104.setText("alquilada?");
        jRadioButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton104ActionPerformed(evt);
            }
        });
        jPanel23.add(jRadioButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 63, 104, -1));

        buttonGroup26.add(jRadioButton105);
        jRadioButton105.setText("propia?");
        jPanel23.add(jRadioButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 104, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel37.setText("19. ¿La vivienda que ocupa este hogar es…");
        jPanel23.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 330, -1));

        jPanel3.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 350, 620));

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, -1, -1));

        jTabbedPane1.addTab("CapituloB3", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 760));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("CAPITULO B. PRINCIPALES CARACTERISTICAS DE LA VIVIENDA ");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 628, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Codigo Vivienda");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 120, -1));

        txtCodVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodViviendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON SIGUIENTE Y GUARDAR
        int r = JOptionPane.showOptionDialog(this, "Los datos que guardara estan correctos?", "GUARDAR DATOS",JOptionPane.YES_NO_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(r==0){
            llenarDatos();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void llenarDatos(){
        
        if(txtCodVivienda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese Codigo de Vivienda porfavor");
        }else{
            setBotones(); // llenamos radio botones
            try {
                String sql = "insert into cap_b (codVivienda, tipo, estado, materialPared,"
                        + " interiorRevoque , materialTecho, materialPiso , agua , aguaDistribuye , sanitario, sanitarioDesague,"
                        + " energiaElectrica, energiaCocina, cuartoCocina, cuartoOcupado, cuartoDormir, basuraelimina, tieneRadio, "
                        + " tieneTelevisor, tieneComputadora, tieneServicioDeInternet, tieneServicioDeTelefonia, tieneVehiculoAutomotor,"
                        + " tieneBicicleta, tieneMotocicletaOCuadratac, tieneCarretaOCarreton, tieneBote, vivienda) "
                        +" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareCall(sql);
                ps.setString(1,  txtCodVivienda.getText());
                ps.setString(2,  buttonGroup1.getSelection().getActionCommand());
                ps.setString(3,  buttonGroup3.getSelection().getActionCommand());
                ps.setString(4,  buttonGroup7.getSelection().getActionCommand());
                ps.setString(5,  buttonGroup6.getSelection().getActionCommand());
                ps.setString(6,  buttonGroup9.getSelection().getActionCommand());
                ps.setString(7,  buttonGroup5.getSelection().getActionCommand());
                ps.setString(8,  buttonGroup8.getSelection().getActionCommand());
                ps.setString(9,  buttonGroup10.getSelection().getActionCommand());
                ps.setString(10, buttonGroup11.getSelection().getActionCommand());
                ps.setString(11, pregunta10());
                ps.setString(12, buttonGroup2.getSelection().getActionCommand());
                ps.setString(13, buttonGroup13.getSelection().getActionCommand());
                ps.setString(14, buttonGroup14.getSelection().getActionCommand());
                ps.setString(15, jTextField2.getText());
                ps.setString(16, jTextField3.getText());
                ps.setString(17, buttonGroup15.getSelection().getActionCommand());
                ps.setString(18, buttonGroup16.getSelection().getActionCommand());
                ps.setString(19, buttonGroup17.getSelection().getActionCommand());
                ps.setString(20, buttonGroup18.getSelection().getActionCommand());
                ps.setString(21, buttonGroup19.getSelection().getActionCommand());
                ps.setString(22, buttonGroup20.getSelection().getActionCommand());
                ps.setString(23, buttonGroup21.getSelection().getActionCommand());
                ps.setString(24, buttonGroup22.getSelection().getActionCommand());
                ps.setString(25, buttonGroup23.getSelection().getActionCommand());
                ps.setString(26, buttonGroup24.getSelection().getActionCommand());
                ps.setString(27, buttonGroup25.getSelection().getActionCommand());
                ps.setString(28, buttonGroup26.getSelection().getActionCommand());
               // ps.setString(18, preg17());
                //ps.setString(19, preg18());
                //ps.setString(20, buttonGroup26.getSelection().getActionCommand());
                
                int n = ps.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    // PASAR A CAPC
                    this.setVisible(false);
                    new CapC().setVisible(true);
                }

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error "+ e.getMessage());
        }
    }
    }
    
    private void setBotones(){
        // LLENA DAATOS A LOS RADIO BUTTON'S
        // Preg1
        jRadioButton1.setActionCommand("Particular: Casa/Choza/Pahuichi");
        jRadioButton2.setActionCommand("Particular: Departamento");
        jRadioButton3.setActionCommand("Particular: Cuarto(s)o habitacion(es) suelta(s)");
        jRadioButton4.setActionCommand("Particular: Vivienda improvisada");
        jRadioButton5.setActionCommand("Particular: Local  no destinado para vivienda ");
        
        jRadioButton8.setActionCommand("Colectiva: Vivienda colectiva");
        jRadioButton7.setActionCommand("Colectiva: Persona que vive en la calle ");
        // Preg2
        jRadioButton12.setActionCommand("Sin vivienda: ocupada por personas presentes ");
        jRadioButton13.setActionCommand("Sin vivienda: ocupada con personas temporalmente ausentes ");
        jRadioButton9.setActionCommand("Sin vivienda: para alquilar y/o vender ");
        jRadioButton10.setActionCommand("Sin vivienda: en construccion o reparacion");
        jRadioButton11.setActionCommand("Sin vivienda: abandonada");
        // Preg3
        jRadioButton17.setActionCommand("Ladrillo, bloque de cemento, hormigón");
        jRadioButton18.setActionCommand("Adobe,tapial");
        jRadioButton19.setActionCommand("Tabique,quinche");
        jRadioButton23.setActionCommand("Madera");
        jRadioButton25.setActionCommand("Caña,palma,tronco");
        jRadioButton27.setActionCommand("otro");
        // Preg4
        jRadioButton15.setActionCommand("Si");
        jRadioButton16.setActionCommand("No");
        // Preg5
        jRadioButton20.setActionCommand("Calamina o plancha metálica");
        jRadioButton22.setActionCommand("Persona en vivienda colectiva");
        jRadioButton24.setActionCommand("Losa de hormigón armado");
        jRadioButton26.setActionCommand("Paja, palma, caña, barro");
        jRadioButton14.setActionCommand("Otro");
        jRadioButton21.setActionCommand("Piedra");
        // Preg6
        jRadioButton28.setActionCommand("Tierra");
        jRadioButton29.setActionCommand("Tablon de madera");
        jRadioButton30.setActionCommand("Machihembre");
        jRadioButton31.setActionCommand("Parquet");
        jRadioButton32.setActionCommand("Ceramica");
        jRadioButton33.setActionCommand("Cemento");
        jRadioButton34.setActionCommand("Mosaico,baldosa");
        jRadioButton35.setActionCommand("Ladrillo");
        jRadioButton36.setActionCommand("Otro");
        // Preg7
        jRadioButton43.setActionCommand("cañería de red?");
        jRadioButton37.setActionCommand("pileta pública?");
        jRadioButton38.setActionCommand("carro repartidor (aguatero)?");
        jRadioButton39.setActionCommand("pozo o noria con bomba?");
        jRadioButton40.setActionCommand("pozo o noria sin bomba?");
        jRadioButton41.setActionCommand("lluvia, río, vertiente, acequia?");
        jRadioButton42.setActionCommand("lago, laguna, curichi?");
        // Preg8
        jRadioButton44.setActionCommand("por cañería dentro de la vivienda");
        jRadioButton45.setActionCommand("por cañería fuera de la vivienda pero dentro del lote o terreno");
        jRadioButton46.setActionCommand("por cañería fuera de la vivienda y del lote o terreno");
        jRadioButton47.setActionCommand(" no se distribuye por cañería");
        // Preg9
        jRadioButton50.setActionCommand("Sí, de uso privado");
        jRadioButton48.setActionCommand("Sí, de uso compartido");
        jRadioNoTiene.setActionCommand("No tiene");
        // Preg10
        // Preg11
        jRadioButton57.setActionCommand("red de empresa eléctrica (servicio público)?");
        jRadioButton58.setActionCommand("motor propio?");
        jRadioButton59.setActionCommand("panel solar?");
        jRadioButton60.setActionCommand("otra?");
        jRadioButton61.setActionCommand("no tiene?");
        // Preg12
        jRadioButton62.setActionCommand("Gas domiciliario (por cañeria)");
        jRadioButton63.setActionCommand("Gas en garrafa");
        jRadioButton64.setActionCommand("Electricidad");
        jRadioButton65.setActionCommand("Energia solar ");
        jRadioButton66.setActionCommand("Leña");
        jRadioButton67.setActionCommand("Guano,bostia o taquia");
        jRadioButton68.setActionCommand("Otro");
        jRadioButton69.setActionCommand("No cocina");
        // Preg13
        jRadioButton70.setActionCommand("Si");
        jRadioButton71.setActionCommand("No");
        // Preg16
        jRadioButton73.setActionCommand("La depositan en el basurero público o contenedor");
        jRadioButton74.setActionCommand("Utilizan el servicio público de recolección (carro basurero)");
        jRadioButton75.setActionCommand("La botan en un terreno baldío o en la calle");
        jRadioButton76.setActionCommand("La botan al rio");
        jRadioButton77.setActionCommand("La queman");
        jRadioButton78.setActionCommand("La entierran");
        jRadioButton72.setActionCommand("Otra forma");
        //preg17
        jRadioButton111.setActionCommand("Si");
        jRadioButton106.setActionCommand("No");
        jRadioButton110.setActionCommand("Si");
        jRadioButton115.setActionCommand("No");
        jRadioButton108.setActionCommand("Si");
        jRadioButton114.setActionCommand("No");
        jRadioButton109.setActionCommand("Si");
        jRadioButton113.setActionCommand("No");
        jRadioButton107.setActionCommand("Si");
        jRadioButton112.setActionCommand("No");
        //preg18
        jRadioButton98.setActionCommand("Si");
        jRadioButton93.setActionCommand("No");
        jRadioButton97.setActionCommand("Si");
        jRadioButton92.setActionCommand("No");
        jRadioButton96.setActionCommand("Si");
        jRadioButton91.setActionCommand("No");
        jRadioButton95.setActionCommand("Si");
        jRadioButton90.setActionCommand("No");
        jRadioButton94.setActionCommand("Si");
        jRadioButton89.setActionCommand("No");
        // Preg19
        jRadioButton105.setActionCommand("propia?");
        jRadioButton104.setActionCommand("alquilada");
        jRadioButton103.setActionCommand("en contrato anticrético?");
        jRadioButton102.setActionCommand("en contrato anticrético y alquiler?");
        jRadioButton101.setActionCommand("cedida por servicios?");
        jRadioButton100.setActionCommand("prestada por parientes o amigos?");
        jRadioButton99.setActionCommand("otra?");
    }
    
    private String pregunta10(){
        String respuesta;
        if(jRadioNoTiene.isSelected()){
            jRadioButton51.setActionCommand("");
            jRadioButton52.setActionCommand("");
            jRadioButton53.setActionCommand("");
            jRadioButton54.setActionCommand("");
            jRadioButton55.setActionCommand("");
            jRadioButton56.setActionCommand("");
            respuesta="";
        }else{
            jRadioButton51.setActionCommand("al alcantarillado?");
            jRadioButton52.setActionCommand("a una camara septica?  ");
            jRadioButton53.setActionCommand("a un pozo ciego?");
            jRadioButton54.setActionCommand("a la calle?");
            jRadioButton55.setActionCommand("a la quebrada, rio?");
            jRadioButton56.setActionCommand("a un lago ,laguna ,curichi");
            respuesta=buttonGroup12.getSelection().getActionCommand();
        }
        return respuesta;
    }
                      
    private void jRadioButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton104ActionPerformed

    private void jRadioButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton102ActionPerformed

    private void jRadioButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton96ActionPerformed

    private void jRadioButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton94ActionPerformed

    private void jRadioButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton92ActionPerformed

    private void jRadioButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton91ActionPerformed

    private void jRadioButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton90ActionPerformed

    private void jRadioButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton76ActionPerformed

    private void jRadioButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton75ActionPerformed

    private void jRadioButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton74ActionPerformed

    private void jRadioButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton73ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton71ActionPerformed

    private void jRadioButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton70ActionPerformed

    private void jRadioButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton69ActionPerformed

    private void jRadioButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton68ActionPerformed

    private void jRadioButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton67ActionPerformed

    private void jRadioButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton66ActionPerformed

    private void jRadioButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton64ActionPerformed

    private void jRadioButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton62ActionPerformed

    private void jRadioButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton61ActionPerformed

    private void jRadioButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton60ActionPerformed

    private void jRadioButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton59ActionPerformed

    private void jRadioButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton58ActionPerformed

    private void jRadioButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton57ActionPerformed

    private void jRadioButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton55ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jRadioButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton52ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        // TODO add your handling code here:
        jRadioButton51.setEnabled(true);
        jRadioButton52.setEnabled(true);
        jRadioButton53.setEnabled(true);
        jRadioButton54.setEnabled(true);
        jRadioButton55.setEnabled(true);
        jRadioButton56.setEnabled(true);
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioNoTieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNoTieneActionPerformed
        jRadioButton51.setEnabled(false);
        jRadioButton52.setEnabled(false);
        jRadioButton53.setEnabled(false);
        jRadioButton54.setEnabled(false);
        jRadioButton55.setEnabled(false);
        jRadioButton56.setEnabled(false);
    }//GEN-LAST:event_jRadioNoTieneActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        habilitarBton();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        habilitarBton();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        deshabilitarBton();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        deshabilitarBton();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        deshabilitarBton();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        deshabilitarBton();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        deshabilitarBton();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton106ActionPerformed

    private void jRadioButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton109ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton109ActionPerformed

    private void jRadioButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton110ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton110ActionPerformed

    private void jRadioButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton111ActionPerformed

    private void jRadioButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton114ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton114ActionPerformed

    private void txtCodViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodViviendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodViviendaActionPerformed

    private void jRadioButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton95ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON GUARDAR Y PASAR A CAPF
        int r = JOptionPane.showOptionDialog(this, "Los datos que guardara estan correctos?", "GUARDAR DATOS",JOptionPane.YES_NO_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(r==0){
            llenarDatosPasarCapF();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void llenarDatosPasarCapF(){
        if(txtCodVivienda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese Codigo de Vivienda porfavor");
        }else{
            // SET PREG1 RADIO BUTTON
            jRadioButton1.setActionCommand("Casa/Choza/Pahuichi");
            jRadioButton2.setActionCommand("Departamento");
            jRadioButton3.setActionCommand("Cuarto(s)o habitacion(es) suelta(s)");
            jRadioButton4.setActionCommand("Vivienda improvisada");
            jRadioButton5.setActionCommand("Local  no destinado para vivienda ");
            
            jRadioButton8.setActionCommand("Vivienda colectiva");
            jRadioButton6.setActionCommand("En transito ");
            jRadioButton7.setActionCommand("Persona que vive en la calle ");
            
            try {
                String sql = "insert into cap_b (codVivienda, tipo, estado, materialPared,"
                        + " interiorRevoque , materialTecho, materialPiso , agua , aguaDistribuye , sanitario, sanitarioDesague,"
                        + " energiaElectrica, energiaCocina, cuartoCocina, cuartoOcupado, cuartoDormir, basuraelimina, tieneRadio, "
                        + " tieneTelevisor, tieneComputadora, tieneServicioDeInternet, tieneServicioDeTelefonia, tieneVehiculoAutomotor,"
                        + " tieneBicicleta, tieneMotocicletaOCuadratac, tieneCarretaOCarreton, tieneBote, vivienda) "
                        +" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareCall(sql);
                ps.setString(1, txtCodVivienda.getText());
                ps.setString(2, buttonGroup1.getSelection().getActionCommand());
                ps.setString(3, "");
                ps.setString(4, "");
                ps.setString(5, "");
                ps.setString(6, "");
                ps.setString(7, "");
                ps.setString(8, "");
                ps.setString(9, "");
                ps.setString(10, "");
                ps.setString(11, "");
                ps.setString(12, "");
                ps.setString(13, "");
                ps.setString(14, "");
                ps.setString(15, "");
                ps.setString(16, "");
                ps.setString(17, "");
                ps.setString(18,"");
                ps.setString(19, "");
                ps.setString(20, "");
                ps.setString(21, "");
                ps.setString(22, "");
                ps.setString(23, "");
                ps.setString(24, "");
                ps.setString(25, "");
                ps.setString(26, "");
                ps.setString(27, "");
                ps.setString(28, "");
                
                int n = ps.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    // PASAR AL SIGUIENTE CAP
                    this.setVisible(false);
                    new CapF().setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }
    }
    
    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        habilitarBton();
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton101ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton42ActionPerformed

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
            java.util.logging.Logger.getLogger(CapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton105;
    private javax.swing.JRadioButton jRadioButton106;
    private javax.swing.JRadioButton jRadioButton107;
    private javax.swing.JRadioButton jRadioButton108;
    private javax.swing.JRadioButton jRadioButton109;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton110;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JRadioButton jRadioNoTiene;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtCodVivienda;
    // End of variables declaration//GEN-END:variables
}
class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondoFrame.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }