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
        
        txtNombre.setText(InicioSesion.nombreUrs);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        PanelNavegador = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        BotonReporte = new javax.swing.JButton();
        BotonEstadoEnc = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNavegador.setBackground(new java.awt.Color(4, 22, 47));
        PanelNavegador.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("JEFE DE FAMILIA");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Encuestador.jpg"))); // NOI18N

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        BotonReporte.setBackground(new java.awt.Color(204, 255, 255));
        BotonReporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonReporte.setText("ENVIAR REPORTE");
        BotonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteActionPerformed(evt);
            }
        });

        BotonEstadoEnc.setBackground(new java.awt.Color(204, 255, 255));
        BotonEstadoEnc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonEstadoEnc.setText("VER ESTADO DE ENCUESTA");
        BotonEstadoEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstadoEncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelNavegadorLayout = new javax.swing.GroupLayout(PanelNavegador);
        PanelNavegador.setLayout(PanelNavegadorLayout);
        PanelNavegadorLayout.setHorizontalGroup(
            PanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavegadorLayout.createSequentialGroup()
                .addGroup(PanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelNavegadorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtNombre)))
                    .addGroup(PanelNavegadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonEstadoEnc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelNavegadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelNavegadorLayout.setVerticalGroup(
            PanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavegadorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(BotonEstadoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BotonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        PanelFondo.add(PanelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");

        PanelReporte.setBackground(new java.awt.Color(204, 255, 255));
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

        PanelReporte.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 720, 300));

        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelReporte.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("         AVISO: \t\n         ESCRIBA LA DESCRIPCIÓN DEL PROBLEMA QUE ENCONTRO EN SU ENCUENTA\n\t\n         DICHO REPORTE SE LE ENVIARÁ A UN ADMINISTRADOR\n\n         TENGA EN CUENTA QUE SOLO SOLO PUEDE INGRESAR MAXIMO 100 CARACTERES ");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        PanelReporte.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 720, 170));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("REPORTE");
        PanelReporte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 170, 60));
        PanelReporte.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 240, 10));

        jTabbedPane1.addTab("Reporte", PanelReporte);

        PanelFondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 960, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEstadoEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstadoEncActionPerformed
        // VER ESTADO DE ENCUESTA
        
        this.setVisible(false);
        new Encuesta().setVisible(true);
        //capituloA.llenarCapA();
        
    }//GEN-LAST:event_BotonEstadoEncActionPerformed

    private void BotonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteActionPerformed
        // ENVIAR REPORTE AL ADMINISTRADOR
        jTextArea1.setText("");
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.getSelectedIndex();
        jTextArea2.setEditable(false);
        
        
    }//GEN-LAST:event_BotonReporteActionPerformed

    private void BotonAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtras2ActionPerformed
        // BOTON ATRAS
        this.setVisible(false);
        new InicioSesion().setVisible(true);
    }//GEN-LAST:event_BotonAtras2ActionPerformed

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
                ps.setString(1,InicioSesion.codUsuario);
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
    private javax.swing.JButton BotonAtras2;
    private javax.swing.JButton BotonEstadoEnc;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelNavegador;
    private javax.swing.JPanel PanelReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
