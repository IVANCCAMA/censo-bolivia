/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import dba.Mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ARMAGEDON
 */
public class JefeFamilia extends javax.swing.JFrame {
    Connection conn;
    Statement sent;
    
    public JefeFamilia() {
        initComponents();
        conn=Mysql.getConnection();
        
        txtNombre.setText(DatosUsuario.nombre);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelNavegador = new javax.swing.JPanel();
        BotonEstadoEnc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelEstado = new javax.swing.JPanel();
        BotonAtras1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelReporte = new javax.swing.JPanel();
        BotonAtras2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNavegador.setBackground(new java.awt.Color(0, 0, 255));
        PanelNavegador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEstadoEnc.setText("VER ESTADO DE ENCUESTA");
        BotonEstadoEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstadoEncActionPerformed(evt);
            }
        });
        PanelNavegador.add(BotonEstadoEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, 80));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENVIAR REPORTE ");
        PanelNavegador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EN CASO DE ALGUN ERROR");
        PanelNavegador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        BotonReporte.setText("ENVIAR REPORTE");
        BotonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteActionPerformed(evt);
            }
        });
        PanelNavegador.add(BotonReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 230, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JEFE DE FAMILIA");
        PanelNavegador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(PanelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 730));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");

        PanelEstado.setBackground(new java.awt.Color(255, 204, 0));
        PanelEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAtras1.setText("Atras");
        BotonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtras1ActionPerformed(evt);
            }
        });
        PanelEstado.add(BotonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 690, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("NOMBRE:");
        PanelEstado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        PanelEstado.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 330, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("BIENVENIDO");
        PanelEstado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));
        PanelEstado.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 290, 10));

        jTabbedPane1.addTab("1", PanelEstado);

        PanelReporte.setBackground(new java.awt.Color(0, 255, 102));
        PanelReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAtras2.setText("Atras");
        BotonAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtras2ActionPerformed(evt);
            }
        });
        PanelReporte.add(BotonAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 690, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        PanelReporte.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 720, 300));

        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelReporte.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("         AVISO: \t\n         ESCRIBA LA DESCRIPCIÓN DEL PROBLEMA QUE ENCONTRO EN SU ENCUENTA\n\t\n         DICHO REPORTE SE LE ENVIARÁ A UN ADMINISTRADOR\n\n         TENGA EN CUENTA QUE SOLO SOLO PUEDE INGRESAR MAXIMO 100 CARACTERES ");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        PanelReporte.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 720, 170));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("REPORTE");
        PanelReporte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 170, 60));
        PanelReporte.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 240, 10));

        jTabbedPane1.addTab("2", PanelReporte);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1220, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEstadoEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstadoEncActionPerformed
        // VER ESTADO DE ENCUESTA
        //PanelNavegador.setVisible(false);
        
        this.setVisible(false);
        CapA capituloA = new CapA();
        capituloA.setVisible(true);
        //capituloA.llenarCapA();
        
    }//GEN-LAST:event_BotonEstadoEncActionPerformed

    private void BotonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteActionPerformed
        // ENVIAR REPORTE AL ADMINISTRADOR
        jTextArea1.setText("");
        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.getSelectedIndex();
        jTextArea2.setEditable(false);
        
        
    }//GEN-LAST:event_BotonReporteActionPerformed

    private void BotonAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtras2ActionPerformed
        // BOTON ATRAS
        this.setVisible(false);
        new InicioSesion().setVisible(true);
    }//GEN-LAST:event_BotonAtras2ActionPerformed

    private void BotonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtras1ActionPerformed
        // BOTON ATRAS
        this.setVisible(false);
        new InicioSesion().setVisible(true);
    }//GEN-LAST:event_BotonAtras1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON ENVIAR REPORTE
        int tamTexto = jTextArea1.getText().length();
        
        if(tamTexto > 100){
           JOptionPane.showMessageDialog(null, "El tamaño de su reporte es muy grande: "
                   + tamTexto + ". Por favor sea mas breve"); 
        }else{
            try {
                String sql = "insert into censo.reporte values(?,?)";
                PreparedStatement ps = conn.prepareCall(sql);
                ps.setString(1,DatosUsuario.usuario);
                ps.setString(2,jTextArea1.getText());

                int n = ps.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Se envio correctamente su mensaje al adminitrador");
                }
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JefeFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JefeFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JefeFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JefeFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JefeFamilia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras1;
    private javax.swing.JButton BotonAtras2;
    private javax.swing.JButton BotonEstadoEnc;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JPanel PanelEstado;
    private javax.swing.JPanel PanelNavegador;
    private javax.swing.JPanel PanelReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
