/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.table.DefaultTableModel;
import dba.Mysql;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class CapD extends javax.swing.JFrame {
  
    FondoPanel fondo = new FondoPanel();
    
    private int cantidad;
    private int i;
    private boolean codViv;
    
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    /**
     * Creates new form CapD
     */
    public CapD() {
        this.setContentPane(fondo);
        initComponents();
        
        conn = Mysql.getConnection();
        i = 1;
        cantidad = 0;
        
        txtCodVivienda.setText(Encuestador.codVivienda);
        txtCodVivienda.setEditable(false);
    }
    
    private void LlenarPersonasMuertas(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codVivienda","numPersona","nomPersona","edadPersona"
                              ,"sexoPersona","causaMuerte"}; 
            String sql = "select * from cap_dmuertos";
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("codVivienda");
                fila[1]=rs.getString("numPersona");
                fila[2]=rs.getString("nomPersona");
                fila[3]=rs.getString("edadPersona");
                fila[4]=rs.getString("sexoPersona");
                fila[5]=rs.getString("causaMuerte");
                
                model.addRow(fila);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodVivienda = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JrbSi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        JtxfCantP = new javax.swing.JTextField();
        JrbNo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JtxfEdadMuerte = new javax.swing.JTextField();
        JrbHombre = new javax.swing.JRadioButton();
        JrbEmbarazo = new javax.swing.JRadioButton();
        JrbParto = new javax.swing.JRadioButton();
        JrbSobreparto = new javax.swing.JRadioButton();
        JrbOtraCausa = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JtxfNomP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtxfNumero = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        JrbMujer = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1154, 750));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("CAPÍTULO D. MORTALIDAD");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Codigo Vivienda");

        txtCodVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodViviendaActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(966, 585));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("21. De enero a diciembre del año pasado,¿murio alguna persona que vivia con usted en este hogar?");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 811, -1));

        buttonGroup1.add(JrbSi);
        JrbSi.setText("Si");
        JrbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbSiActionPerformed(evt);
            }
        });
        jPanel3.add(JrbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, 22));

        jLabel4.setText("¿cuantas personas?");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        JtxfCantP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxfCantPActionPerformed(evt);
            }
        });
        jPanel3.add(JtxfCantP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 52, -1));

        buttonGroup1.add(JrbNo);
        JrbNo.setText("No");
        jPanel3.add(JrbNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 60, -1));

        jButton1.setText("Pase a la pregunta 22");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(JtxfEdadMuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 120, -1));

        buttonGroup3.add(JrbHombre);
        JrbHombre.setText("Hombre");
        jPanel4.add(JrbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 98, -1));

        buttonGroup2.add(JrbEmbarazo);
        JrbEmbarazo.setText("el embarazo");
        jPanel4.add(JrbEmbarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 104, -1));

        buttonGroup2.add(JrbParto);
        JrbParto.setText("el parto");
        JrbParto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbPartoActionPerformed(evt);
            }
        });
        jPanel4.add(JrbParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 104, -1));

        buttonGroup2.add(JrbSobreparto);
        JrbSobreparto.setText("el sobreparto(hasta dos meses despues del parto)");
        JrbSobreparto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbSobrepartoActionPerformed(evt);
            }
        });
        jPanel4.add(JrbSobreparto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        buttonGroup2.add(JrbOtraCausa);
        JrbOtraCausa.setText("otra causa");
        JrbOtraCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbOtraCausaActionPerformed(evt);
            }
        });
        jPanel4.add(JrbOtraCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 104, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Nombre de la persona");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("¿Que edad tenia al morir?");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("(Anote 0 para menores de 1 año)");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("La persona era:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Si era mujer de 15 años o mas de edad, murio por");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("alguna causa relacionada con...");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 211, -1));
        jPanel4.add(JtxfNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 165, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("N°");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 37, -1));

        JtxfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxfNumeroActionPerformed(evt);
            }
        });
        jPanel4.add(JtxfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 37, -1));

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, -1, -1));

        buttonGroup3.add(JrbMujer);
        JrbMujer.setText("Mujer");
        jPanel4.add(JrbMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 98, -1));

        jLabel6.setText("(Anote en el siguiente cuadro, los datos de cada una de las personas que fallecieron. ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 811, -1));

        jLabel7.setText("No olvide a niñas, niños, recién nacidos, ancianas y ancianos)");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 811, -1));

        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(991, 991, 991)
                        .addComponent(jButton3))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Capítulo D", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(txtCodVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodViviendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodViviendaActionPerformed

    private void JrbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbSiActionPerformed

    private void JtxfCantPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxfCantPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxfCantPActionPerformed

    private void JrbSobrepartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbSobrepartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbSobrepartoActionPerformed

    private void JrbOtraCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbOtraCausaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbOtraCausaActionPerformed

    private void JtxfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxfNumeroActionPerformed
 private String seleccionado(){
        String sel;
        if(JrbSi.isSelected()){
            sel = "Si";
        }else if(JrbNo.isSelected()){
            sel = "No";
        }else{
            sel = "";
        }
        return sel;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              
        // BOTON PASAR A LA PREGUNTA 22
        codViv = txtCodVivienda.getText().isEmpty(); // Poner codVivienda
        
        if(JrbNo.isSelected() && (codViv != true)){
            this.setVisible(false);
            new CapE().setVisible(true);
            // Guardar datos en bd
            try {
            String sql = "insert into cap_d values(?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, txtCodVivienda.getText());
            ps.setString(2, seleccionado());
            ps.setString(3, "0");
 
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }else{
            String mensaje = "No puede pasar a la pregunta 22, Ingrese codVivienda";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        // BOTON GUARDAR datos en tabla Personas Muertas en bd
        
        codViv = txtCodVivienda.getText().isEmpty();
        boolean hayCantidadP = JtxfCantP.getText().isEmpty();  // verifica si esta vacio en campo de cantidad de personas
        
        if(JrbSi.isSelected() && (hayCantidadP != true) && (codViv != true)){
            cantidad = Integer.parseInt(JtxfCantP.getText()); // cantidad de personas fuera del pais
            if(i <= cantidad){
                // Guardar datos en bd
                    try {
                        String sql = "insert into cap_dmuertos values(?,?,?,?,?,?)";
                        PreparedStatement ps = conn.prepareCall(sql);
                        ps.setString(1, txtCodVivienda.getText());       
                        ps.setString(2, JtxfNumero.getText()); 
                        ps.setString(3, JtxfNomP.getText());                   
                        ps.setString(4, JtxfEdadMuerte.getText());
                        ps.setString(5, getSexo());
                       // ps.setString(6, getCausaMuerte());
                       
                        if(getSexo().equals("Mujer")){
                        ps.setString(6, getCausaMuerte());
                        }else{
                        ps.setString(6, "");
                        }

                        int n = ps.executeUpdate();
                        if(n>0){
                            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
                    }
                    LlenarPersonasMuertas();
                    limpiar();  // limpiar datos 
                    i++;
            }else{
                JOptionPane.showMessageDialog(null, "ya no puede llenar mas");
            }
            
        }else{
            if(codViv){
                JOptionPane.showMessageDialog(null, "Por favor ingrese Codigo de vivienda");
            }else{
                JOptionPane.showMessageDialog(null, "Por favor seleccione la opcion (si) y ingrese la cantidad");
            }
            
        }                                    
    
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    private void limpiar(){
        
        JtxfNumero.setText("");
        JtxfNomP.setText("");
        JtxfEdadMuerte.setText("");
        
    }
    
    private String getSexo(){
        String  sexo;
        if(JrbHombre.isSelected()){
            sexo = "Hombre";
        }else if(JrbMujer.isSelected()){
            sexo = "Mujer";
        }else{
            sexo = " ";
        }
        return sexo;
    }
    
    private String getCausaMuerte(){
        String causaMuerte;
        if(JrbEmbarazo.isSelected()){
            causaMuerte = "el embarazo";
        }else if(JrbParto.isSelected()){
            causaMuerte = "el parto";
        }else if(JrbSobreparto.isSelected()){
            causaMuerte = "el sobreparto ";
        }else if(JrbOtraCausa.isSelected()){
            causaMuerte = "otra causa";
        }else{
            causaMuerte = " ";
        }
    return causaMuerte;
    }
    
    private void JrbPartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbPartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbPartoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtCodVivienda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese Codigo de Vivienda porfavor");
        }else{
            this.setVisible(false);
            new CapE().setVisible(true);
            // Guardar datos en bd
            try {
            String sql = "insert into cap_d values(?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, txtCodVivienda.getText());
            ps.setString(2, seleccionado());
            ps.setString(3, JtxfCantP.getText());
 
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }

            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null,"Error ");
                JOptionPane.showMessageDialog(null,"Error "+ e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CapD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JrbEmbarazo;
    private javax.swing.JRadioButton JrbHombre;
    private javax.swing.JRadioButton JrbMujer;
    private javax.swing.JRadioButton JrbNo;
    private javax.swing.JRadioButton JrbOtraCausa;
    private javax.swing.JRadioButton JrbParto;
    private javax.swing.JRadioButton JrbSi;
    private javax.swing.JRadioButton JrbSobreparto;
    private javax.swing.JTextField JtxfCantP;
    private javax.swing.JTextField JtxfEdadMuerte;
    private javax.swing.JTextField JtxfNomP;
    private javax.swing.JTextField JtxfNumero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTabbedPane jTabbedPane1;
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