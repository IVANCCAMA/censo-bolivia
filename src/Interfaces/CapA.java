/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author GRUPO MTTP
 * 
 */
import dba.Mysql;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CapA extends javax.swing.JFrame {
    
    fondoPanel fondo = new fondoPanel();
    Connection conn; // para hcer conexion con bd
    
    public CapA() {
        this.setContentPane(fondo);    
        initComponents();
        conn=Mysql.getConnection();
    }
    
    @SuppressWarnings("unchecked") // suprime advertencias no comprobadas
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCodMun = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtZonaCensal = new javax.swing.JTextField();
        txtSector = new javax.swing.JTextField();
        txtSegmento = new javax.swing.JTextField();
        txtManzana = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCiudadCom = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtBarrio = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumPuerta = new javax.swing.JTextField();
        txtPiso = new javax.swing.JTextField();
        txtNumDep = new javax.swing.JTextField();
        txtNombreEd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtNumOrdenV = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNumBoleta = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTotalPers = new javax.swing.JTextField();
        txtNumHom = new javax.swing.JTextField();
        txtNumMuj = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTxtCodVid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        jLabel24.setText("jLabel24");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("1.1 Copie los datos de la ubicación geográfica que figura en la carátula ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 14, -1, -1));

        jLabel11.setText("Código municipal");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 41, -1, -1));

        jLabel12.setText("Distrito");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 41, -1, -1));

        jLabel13.setText("Ciudad / Comunidad");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 41, -1, -1));

        jLabel14.setText("Zona Censal");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 41, 97, -1));

        jLabel15.setText("Sector");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 41, -1, -1));

        jLabel16.setText("Segmento");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 41, -1, -1));

        jLabel17.setText("Manzana");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 41, -1, -1));
        jPanel3.add(txtCodMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 74, 118, -1));
        jPanel3.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 74, 81, -1));
        jPanel3.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 74, 138, -1));

        txtZonaCensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZonaCensalActionPerformed(evt);
            }
        });
        jPanel3.add(txtZonaCensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 74, 72, -1));
        jPanel3.add(txtSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 74, 100, -1));
        jPanel3.add(txtSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 74, 76, -1));

        txtManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManzanaActionPerformed(evt);
            }
        });
        jPanel3.add(txtManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 74, 76, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1100, 120));
        jPanel3.getAccessibleContext().setAccessibleName("1.");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ciudad / Comunidad");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 39, -1, -1));

        jLabel3.setText("Localidad / Centro poblado ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, -1, -1));

        jLabel4.setText("Barrio/Zona/Unidad vecinal ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 119, -1, -1));

        jLabel5.setText("Calle, avenida, camino o carretera ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 150, -1, -1));

        jLabel6.setText("Número de puerta");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 150, -1, -1));

        jLabel7.setText("Piso");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 191, -1, -1));

        jLabel8.setText("Número de departamento");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 187, -1, 16));

        jLabel9.setText("Nombre del edificio");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 191, -1, -1));
        jPanel4.add(txtCiudadCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 35, 720, -1));
        jPanel4.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 76, 714, -1));
        jPanel4.add(txtBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 111, 714, -1));
        jPanel4.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 146, 252, -1));

        txtNumPuerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPuertaActionPerformed(evt);
            }
        });
        jPanel4.add(txtNumPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 146, 220, -1));
        jPanel4.add(txtPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 187, 107, -1));
        jPanel4.add(txtNumDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 187, 96, -1));
        jPanel4.add(txtNombreEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 187, 310, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel26.setText("1.2 Dirección de la vivienda");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1100, 230));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setText("<html>2.1 Número de orden<p> de la vivienda<html>");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));
        jPanel5.add(txtNumOrdenV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setText("<html>2.2 Número de boleta<p> en la vivienda");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, 50));
        jPanel5.add(txtNumBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 150, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 450, 150));
        jPanel5.getAccessibleContext().setAccessibleName("2. ");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel20.setText("(No olvide incluir a niñas, niños, recién nacidos, ancianas y ancianos)");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel21.setText("Total personas");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel22.setText("Hombres");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel23.setText("Mujeres");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));
        jPanel6.add(txtTotalPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 58, -1));

        txtNumHom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumHomActionPerformed(evt);
            }
        });
        jPanel6.add(txtNumHom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 58, -1));
        jPanel6.add(txtNumMuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 66, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel25.setText("<html>3. En esta vivienda, ¿cuántas personas pasaron la noche anterior<p> al día del Censo?");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 600, 150));

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, -1, -1));

        jTabbedPane1.addTab("Capítulo A", jPanel1);

        jTxtCodVid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodVidActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("CAPÍTULO A. UBICACIÓN GEOGRÁFICA DE LA VIVIENDA");
        jLabel1.setToolTipText("");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel28.setText("Codigo Vivienda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel28)
                .addGap(29, 29, 29)
                .addComponent(jTxtCodVid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTxtCodVid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManzanaActionPerformed

    private void txtZonaCensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZonaCensalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZonaCensalActionPerformed

    private void txtNumPuertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPuertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPuertaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON SIGUIENTE Y GUARDAR
        int r = JOptionPane.showOptionDialog(this, "Los datos que guardara estan correctos?", "GUARDAR DATOS",JOptionPane.YES_NO_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(r==0){
            llenarDatos();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void llenarDatos(){
        if(jTxtCodVid.getText().isEmpty()){ // verifica codVivienda
            JOptionPane.showMessageDialog(null, "Ingrese Codigo de Vivienda porfavor");
        }else{ 
            try {
                String sql = "insert into cap_a values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareCall(sql);
                ps.setString(1, jTxtCodVid.getText());
                ps.setString(2, txtCodMun.getText());
                ps.setString(3, txtDistrito.getText());
                ps.setString(4, txtCiudad.getText());
                ps.setString(5, txtZonaCensal.getText());
                ps.setString(6, txtSector.getText());
                ps.setString(7, txtSegmento.getText());
                ps.setString(8, txtManzana.getText());
                ps.setString(9, txtCiudadCom.getText());
                ps.setString(10, txtLocalidad.getText());
                ps.setString(11, txtBarrio.getText());
                ps.setString(12, txtCalle.getText());
                ps.setString(13, txtNumPuerta.getText());
                ps.setString(14, txtPiso.getText());
                ps.setString(15, txtNumDep.getText());
                ps.setString(16, txtNombreEd.getText());
                ps.setString(17, txtNumOrdenV.getText());
                ps.setString(18, txtNumBoleta.getText());
                ps.setString(19, txtTotalPers.getText());
                ps.setString(20, txtNumHom.getText());
                ps.setString(21, txtNumMuj.getText());

                int n = ps.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    // PASAR A CAPB
                    this.setVisible(false);
                    new CapB().setVisible(true);
                }
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }
    }
    
    private void txtNumHomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumHomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumHomActionPerformed

    private void jTxtCodVidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodVidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodVidActionPerformed

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
            java.util.logging.Logger.getLogger(CapA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapA().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTxtCodVid;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCiudadCom;
    private javax.swing.JTextField txtCodMun;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtManzana;
    private javax.swing.JTextField txtNombreEd;
    private javax.swing.JTextField txtNumBoleta;
    private javax.swing.JTextField txtNumDep;
    private javax.swing.JTextField txtNumHom;
    private javax.swing.JTextField txtNumMuj;
    private javax.swing.JTextField txtNumOrdenV;
    private javax.swing.JTextField txtNumPuerta;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtSegmento;
    private javax.swing.JTextField txtTotalPers;
    private javax.swing.JTextField txtZonaCensal;
    // End of variables declaration//GEN-END:variables
    
    class fondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondoFrame.jpg")).getImage();
            g.drawImage(imagen, 0, 0,getWidth() , getHeight(),this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
            
}
