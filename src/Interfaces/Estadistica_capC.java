/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import dba.Mysql;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author MAQ
 */
public class Estadistica_capC extends javax.swing.JFrame {

    Connection conn;
    DefaultTableModel model;
    Statement sent;
    
    public Estadistica_capC() {
        initComponents();
        conn=Mysql.getConnection();
        
        generarMortalidad();
        generarPersonasConDificultad();
    }
    private void generarMortalidad(){
        int total,CantidadDePersonas,Embarazo,Parto,SobreParto,OtraCausa;
                
        // repcuperamos de bd valores
        total = Integer.parseInt(getTotalMorta());
        CantidadDePersonas = Integer.parseInt(getCantiPersM());
        Embarazo = Integer.parseInt(getEmbarazo());
        Parto = Integer.parseInt(getParto());
        SobreParto = Integer.parseInt(getsobreParto());
        OtraCausa = Integer.parseInt(getOtraCausa());

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        // valor, fila o variables, columna o actores
        datos.setValue(CantidadDePersonas*100/total, "Cantidad de Personas", "Cantidad de Personas: " + CantidadDePersonas*100/total + "%");
        datos.setValue(Embarazo*100/total, "Embarazo", "Embarazo: " +Embarazo*100/total + "%");
        datos.setValue(Parto*100/total, "Parto", "Parto: " + Parto*100/total + "%");
       datos.setValue(SobreParto*100/total, "SobreParto", "SobreParto: " + SobreParto*100/total + "%");
       datos.setValue(OtraCausa*100/total, "Otra Causa", "Otra Causa: " + OtraCausa*100/total + "%");
       
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Mortalidad",    // nombre del grafico 
                "Personas muertas", // nombre de las barras columnas
                "% Porcentaje",    // nombre de la numeracion
                datos,               // datos del grafico
                PlotOrientation.VERTICAL, // orientacion del grafico
                true,   // legendas de barras individuales por color
                true,  // herramientas
                false);   // url del grafico
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1068, 492));
        
        jPanel7.setLayout(new BorderLayout());
        jPanel7.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    private String getCantiPersM(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(personaMuerta) AS CantiPers \n" +
                            "FROM cap_d \n" +
                            "WHERE personaMuerta = 'Si '\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("CantiPers");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }private String getEmbarazo(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(causaMuerte) AS Embarazo \n" +
                            "FROM cap_dmuertos \n" +
                            "WHERE causaMuerte = 'el embarazo'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("Embarazo");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }private String getParto(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(causaMuerte) AS Parto \n" +
                            "FROM cap_dmuertos \n" +
                            "WHERE causaMuerte = 'el parto'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("Parto");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }private String getsobreParto(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(causaMuerte) AS sobreParto \n" +
                            "FROM cap_dmuertos \n" +
                            "WHERE causaMuerte = 'el sobreparto'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("sobreParto");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }private String getOtraCausa(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(causaMuerte) AS Cantidad \n" +
                            "FROM cap_dmuertos \n" +
                            "WHERE causaMuerte = 'otra causa'" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("Cantidad");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;  
        }
        private String getTotalMorta(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(codVivienda) AS total\n" +
                            "FROM cap_d ";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("total");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    
    }
    private void generarPersonasConDificultad(){
        int total,PersonasConDificultad,ver,oir,hablar,caminar,recordar;
                
        // repcuperamos de bd valores
        total = Integer.parseInt(getTotalPersonasConDifi());
         PersonasConDificultad= Integer.parseInt(getPersonasConDifi());
        ver = Integer.parseInt(getver());
        oir = Integer.parseInt(getoir());
        hablar = Integer.parseInt(gethablar());
        caminar = Integer.parseInt(getcaminar());
        recordar = Integer.parseInt(getrecordar());


        DefaultCategoryDataset datos = new DefaultCategoryDataset();
       
        // valor, fila o variables, columna o actores
        datos.setValue(PersonasConDificultad*100/total, "Personas con Dificultad", "Personas con Dificultad: " + PersonasConDificultad*100/total + "%");
        datos.setValue(ver*100/total, "ver", "ver: " +ver*100/total + "%");
        datos.setValue(oir*100/total, "oir", "oir: " + oir*100/total + "%");
       datos.setValue(hablar*100/total, "hablar", "hablar: " + hablar*100/total + "%");
       datos.setValue(caminar*100/total, "caminar ", "caminar: " + caminar*100/total + "%");
       datos.setValue(recordar*100/total, "recordar ", "recordar: " + recordar*100/total + "%");
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Personas con Dificultad",    // nombre del grafico 
                "Personas con Dificultades", // nombre de las barras columnas
                "% Porcentaje",    // nombre de la numeracion
                datos,               // datos del grafico
                PlotOrientation.VERTICAL, // orientacion del grafico
                true,   // legendas de barras individuales por color
                true,  // herramientas
                false);   // url del grafico
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1068, 492));
        
        jPanel8.setLayout(new BorderLayout());
        jPanel8.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
        }private String getPersonasConDifi(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(codVivienda) AS cantidad \n" +
                            "FROM datos_persona_dif  \n" ;
                           
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("cantidad");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }private String getver(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(dificultad) AS ver \n" +
                            "FROM datos_persona_dif \n" +
                            "WHERE dificultad = 'ver, aun si usa anteojos o lentes'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("ver");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }private String getoir(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(dificultad) AS oir \n" +
                            "FROM datos_persona_dif \n" +
                            "WHERE dificultad = 'oír, aun si usa audífono'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("oir");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }private String gethablar(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(dificultad) AS hablar \n" +
                            "FROM datos_persona_dif \n" +
                            "WHERE dificultad = 'hablar, comunicarse o conversar'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("hablar");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }private String getcaminar(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(dificultad) AS caminar \n" +
                            "FROM datos_persona_dif \n" +
                            "WHERE dificultad = 'caminar o subir escalones'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("caminar");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }private String getrecordar(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(dificultad) AS recordar \n" +
                            "FROM datos_persona_dif \n" +
                            "WHERE dificultad = 'recordar o concentrarse'\n" ;
                            
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("recordar");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }
        private String getTotalPersonasConDifi(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(codVivienda) AS total\n" +
                            "FROM datos_persona_dif ";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("total");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
        }
    /**
     * Creates new form Frame_esta
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1163, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PERSONAS CON DIFICULTAD", jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1163, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MORTALIDAD", jPanel7);

        jLabel1.setText("PERSONAS FUERA");

        jButton2.setText("GRAFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(194, 194, 194)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PERSONAS FUERA", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jButton5.setText("CERRAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
 private String setPobFuera(){
        String total = "" ;
        try {
                String sql = "SELECT COUNT(*) AS pobTotal FROM cap_cpersfuera ";       
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                total = rs.getString("pobTotal");

            } catch (Exception e) {
                e.printStackTrace();
            }
        jTextField2.setText(total);
        return total;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int n2= Integer.parseInt(setPobFuera());

        DefaultCategoryDataset datos= new DefaultCategoryDataset();
        
        datos.setValue(n2,"Personas Fuera","");

        JFreeChart grafico_barras = ChartFactory.createBarChart3D(

            "Porcentaje de Encuesta" ,
            "Personas de la Encuesta",
            "% Porcentaje",
            datos,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        ) ;

        ChartPanel panel= new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(800,600));

        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(panel,BorderLayout.NORTH);

        pack();
        repaint();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int r =JOptionPane.showOptionDialog(this, "¿Está seguro de cerrar?", "Cerrar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "No");
        if (r == 0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Estadistica_capC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadistica_capC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadistica_capC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadistica_capC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadistica_capC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
