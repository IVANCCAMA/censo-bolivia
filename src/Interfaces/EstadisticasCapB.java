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
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Ivan
 */
public class EstadisticasCapB extends javax.swing.JFrame {

    Connection conn;
    DefaultTableModel model;
    Statement sent;
    
    public EstadisticasCapB() {
        initComponents();
        conn=Mysql.getConnection();
        
        generarTipoViviendas();
        generarCacteristicasVivPart();
    }
    
    private void generarTipoViviendas(){
        int total, particular ,colectiva, sinVivienda;
        // repcuperamos de bd valores
        total = Integer.parseInt(getTotalViv());
        particular = Integer.parseInt(getParticulares());
        colectiva = Integer.parseInt(getColectivas());
        sinVivienda = Integer.parseInt(getSinVivienda());
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(particular*100/total, "Particular", "Particular: " + particular*100/total + "%");
        datos.setValue(colectiva*100/total, "Colectiva", "Colectiva: " +colectiva*100/total + "%");
        datos.setValue(sinVivienda*100/total, "Sin vivienda", "Sin vivienda: " + sinVivienda*100/total + "%");
        
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Tipos de viviendas",    // nombre del grafico 
                "Personas de Bolivia", // nombre de las barras columnas
                "% Porcentaje",    // nombre de la numeracion
                datos,               // datos del grafico
                PlotOrientation.VERTICAL, // orientacion del grafico
                true,   // legendas de barras individuales por color
                true,  // herramientas
                false);   // url del grafico
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1068, 492));
        
        PanelTiposViv.setLayout(new BorderLayout());
        PanelTiposViv.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    
    private void generarCacteristicasVivPart(){
        int total, particular ,colectiva, sinVivienda;
        // repcuperamos de bd valores
        total = Integer.parseInt(getTotalViv());
        particular = Integer.parseInt(getParticulares());
        colectiva = Integer.parseInt(getColectivas());
        sinVivienda = Integer.parseInt(getSinVivienda());
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(particular*100/total, "Particular", "Particular: " + particular*100/total + "%");
        datos.setValue(colectiva*100/total, "Colectiva", "Colectiva: " +colectiva*100/total + "%");
        datos.setValue(sinVivienda*100/total, "Sin vivienda", "Sin vivienda: " + sinVivienda*100/total + "%");
        
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Tipos de viviendas",    // nombre del grafico 
                "Personas de Bolivia", // nombre de las barras columnas
                "% Porcentaje",    // nombre de la numeracion
                datos,               // datos del grafico
                PlotOrientation.VERTICAL, // orientacion del grafico
                true,   // legendas de barras individuales por color
                true,  // herramientas
                false);   // url del grafico
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1068, 492));
        
        PanelTVivPart.setLayout(new BorderLayout());
        PanelTVivPart.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    
    private String getParticulares(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(tipo) AS Particulares \n" +
                            "FROM cap_b \n" +
                            "WHERE tipo = 'Particular: Casa/Choza/Pahuichi'\n" +
                            "OR tipo = 'Particular: Departamento'\n" +
                            "OR tipo = 'Particular: Cuarto(s)o habitacion(es) suelta(s)'\n" +
                            "OR tipo = 'Particular: Vivienda improvisada'\n" +
                            "OR tipo = 'Particular: Local  no destinado para vivienda'";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("Particulares");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }
    
    private String getColectivas(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(tipo) AS Colectivas\n" +
                            "FROM cap_b \n" +
                            "WHERE tipo = 'Vivienda colectiva'";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("Colectivas");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }
    
    private String getSinVivienda(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(tipo) AS SinVivienda\n" +
                            "FROM cap_b \n" +
                            "WHERE tipo = 'En transito'\n" +
                            "OR tipo = 'Persona que vive en la calle'";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("SinVivienda");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }
    
    private String getTotalViv(){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT(codVivienda) AS total\n" +
                            "FROM cap_b ";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("total");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidad;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelTiposViv = new javax.swing.JPanel();
        PanelTVivPart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("CARACTERISTICAS DE VIVIENDAS");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        PanelTiposViv.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelTiposVivLayout = new javax.swing.GroupLayout(PanelTiposViv);
        PanelTiposViv.setLayout(PanelTiposVivLayout);
        PanelTiposVivLayout.setHorizontalGroup(
            PanelTiposVivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1164, Short.MAX_VALUE)
        );
        PanelTiposVivLayout.setVerticalGroup(
            PanelTiposVivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tipos de Viviendas", PanelTiposViv);

        PanelTVivPart.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelTVivPartLayout = new javax.swing.GroupLayout(PanelTVivPart);
        PanelTVivPart.setLayout(PanelTVivPartLayout);
        PanelTVivPartLayout.setHorizontalGroup(
            PanelTVivPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1164, Short.MAX_VALUE)
        );
        PanelTVivPartLayout.setVerticalGroup(
            PanelTVivPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Viviendas Particulares", PanelTVivPart);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EstadisticasCapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasCapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasCapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasCapB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticasCapB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTVivPart;
    private javax.swing.JPanel PanelTiposViv;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
