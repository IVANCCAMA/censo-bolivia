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
    
    Statement sent;
    
    public EstadisticasCapB() {
        initComponents();
        conn=Mysql.getConnection();
        
        generarTipoViviendas();
        
        // preg7 de capB OK
        generarServicioAgua();
        // preg10 de capB OK
        generarServicioAlcantarillado();
        // preg11 de capB
        generarServicioEnergiaElec();
        // preg12 de capB
        generarServicioCocina();
        // preg19 de capB
        generarServicioViviendaEs();
        
    }
    private void generarServicioAlcantarillado(){
        //SERVICIO ALACANTARILLADO
        int total, fila1, fila2 , fila3, fila4, fila5, fila6;
        // recuperamos de bd valores
        total = Integer.parseInt(getParticulares());
        
        fila1 = getDatos("sanitarioDesague","al alcantarillado?")*100/total;
        fila2 = getDatos("sanitarioDesague","a una camara septica?")*100/total;
        fila3 = getDatos("sanitarioDesague","a un pozo ciego?")*100/total;
        fila4 = getDatos("sanitarioDesague","a la calle?")*100/total;
        fila5 = getDatos("sanitarioDesague","a la quebrada, rio?")*100/total;
        fila6 = getDatos("sanitarioDesague","a un lago ,laguna ,curichi")*100/total;
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(fila1, "a)alcantarillado", "a) " + fila1 + "%");
        datos.setValue(fila2, "b)camara septica", "b) " + fila2 + "%");
        datos.setValue(fila3, "c)pozo ciego", "c) " + fila3 + "%");
        datos.setValue(fila4, "d)calle", "d) " + fila4 + "%");
        datos.setValue(fila5, "e)quebrada", "e) " +  fila5 + "%");
        datos.setValue(fila6, "f)lago ,laguna ,curichi", "f) " +  fila6 + "%");
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Servicio de Desague",    
                "Personas de Bolivia", 
                "% Porcentaje",   
                datos,               
                PlotOrientation.VERTICAL, 
                true,   
                true,  
                false);   
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(560, 292));
        
        Panel2.setLayout(new BorderLayout());
        Panel2.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    private void generarServicioEnergiaElec(){
        //SERVICIO ENERGIA ELECTRICA
        int total, fila1, fila2 , fila3, fila4, fila5;
        // recuperamos de bd valores
        total = Integer.parseInt(getParticulares());
        
        fila1 = getDatos("energiaElectrica","red de empresa eléctrica (servicio público)?")*100/total;
        fila2 = getDatos("energiaElectrica","motor propio?")*100/total;
        fila3 = getDatos("energiaElectrica","panel solar?")*100/total;
        fila4 = getDatos("energiaElectrica","otra?")*100/total;
        fila5 = getDatos("energiaElectrica","no tiene?")*100/total;
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(fila1, "a)red de empresa electrica", "a) " + fila1 + "%");
        datos.setValue(fila2, "b)motor propio", "b) " + fila2 + "%");
        datos.setValue(fila3, "c)panel solar", "c) " + fila3 + "%");
        datos.setValue(fila4, "d)otra", "d) " + fila4 + "%");
        datos.setValue(fila5, "e)no tiene", "e) " +  fila5 + "%");
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Servio Energia Electrica",    
                "Personas de Bolivia", 
                "% Porcentaje",   
                datos,               
                PlotOrientation.VERTICAL, 
                true,   
                true,  
                false);   
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(560, 292));
        
        Panel3.setLayout(new BorderLayout());
        Panel3.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    
    private void generarServicioCocina(){
        //SERVICIO 
        int total, fila1, fila2 , fila3, fila4, fila5, fila6,fila7, fila8;
        // recuperamos de bd valores
        total = Integer.parseInt(getParticulares());
        
        fila1 = getDatos("energiaCocina","Gas domiciliario (por cañeria)")*100/total;
        fila2 = getDatos("energiaCocina","Gas en garrafa")*100/total;
        fila3 = getDatos("energiaCocina","Electricidad")*100/total;
        fila4 = getDatos("energiaCocina","Energia solar")*100/total;
        fila5 = getDatos("energiaCocina","Leña")*100/total;
        fila6 = getDatos("energiaCocina","Guano,bostia o taquia")*100/total;
        fila7 = getDatos("energiaCocina","Otro")*100/total;
        fila8 = getDatos("energiaCocina","No cocina")*100/total;
        
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(fila1, "a)Gas domiciliario", "a) " + fila1 + "%");
        datos.setValue(fila2, "b)Gas en garrafa", "b) " + fila2 + "%");
        datos.setValue(fila3, "c)Electricidad", "c) " + fila3 + "%");
        datos.setValue(fila4, "d)Energia solar", "d) " + fila4 + "%");
        datos.setValue(fila5, "e)Leña", "e) " +  fila5 + "%");
        datos.setValue(fila6, "f)Guano,bostia o taquia", "f) " +  fila6 + "%");
        datos.setValue(fila7, "g)Otro", "g) " +  fila7 + "%");
        datos.setValue(fila8, "h)No cocina", "h) " +  fila8 + "%");
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Servicio Cocina",    
                "Servicio de Cocina", 
                "% Porcentaje",   
                datos,               
                PlotOrientation.VERTICAL, 
                true,   
                true,  
                false);   
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(560, 292));
        
        Panel4.setLayout(new BorderLayout());
        Panel4.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    private void generarServicioViviendaEs(){
        //SERVICIO 
        int total, fila1, fila2 , fila3, fila4, fila5, fila6, fila7;
        // recuperamos de bd valores
        total = Integer.parseInt(getParticulares());
        
        fila1 = getDatos("vivienda","propia?")*100/total;
        fila2 = getDatos("vivienda","alquilada")*100/total;
        fila3 = getDatos("vivienda","en contrato anticrético?")*100/total;
        fila4 = getDatos("vivienda","en contrato anticrético y alquiler?")*100/total;
        fila5 = getDatos("vivienda","cedida por servicios?")*100/total;
        fila6 = getDatos("vivienda","prestada por parientes o amigos?")*100/total;
        fila7 = getDatos("vivienda","otra?")*100/total;
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(fila1, "a)propia", "a) " + fila1 + "%");
        datos.setValue(fila2, "b)alquilada", "b) " + fila2 + "%");
        datos.setValue(fila3, "c)anticrético", "c) " + fila3 + "%");
        datos.setValue(fila4, "d)alquiler", "d) " + fila4 + "%");
        datos.setValue(fila5, "e)cedida", "e) " +  fila5 + "%");
        datos.setValue(fila6, "f)prestada", "f) " +  fila6 + "%");
        datos.setValue(fila7, "f)otra", "f) " +  fila6 + "%");
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Tipo de Vivienda",    
                "Personas de Bolivia", 
                "% Porcentaje",   
                datos,               
                PlotOrientation.VERTICAL, 
                true,   
                true,  
                false);   
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1164, 588));
        
        Panel5.setLayout(new BorderLayout());
        Panel5.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    
    private void generarTipoViviendas(){
        int total, particular ,colectiva, sinVivienda;
        // recuperamos de bd valores
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
    
    private void generarServicioAgua(){
        //SERVICIOS DE AGUA
        int total, canieria, pileta , aguatero, conBomba, sinBomba, lluvia, lago;
        // repcuperamos de bd valores
        total = Integer.parseInt(getParticulares());
        
        canieria = getDatos("agua","cañería de red?")*100/total;
        pileta = getDatos("agua","pileta pública?")*100/total;
        aguatero = getDatos("agua","carro repartidor (aguatero)?)")*100/total;
        conBomba = getDatos("agua","pozo o noria con bomba?")*100/total;
        sinBomba = getDatos("agua","pozo o noria sin bomba?")*100/total;
        lluvia = getDatos("agua","lluvia, río, vertiente, acequia?")*100/total;
        lago = getDatos("agua","lago, laguna, curichi?")*100/total;
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        // valor, fila o variables, columna o actores
        datos.setValue(canieria, "a)cañería de red", "a) " + canieria + "%");
        datos.setValue(pileta, "b)pileta pública", "b) " + pileta + "%");
        datos.setValue(aguatero, "c)carro repartidor (aguatero)", "c) " + aguatero + "%");
        datos.setValue(conBomba, "d)pozo o noria sin bomba", "d) " + conBomba + "%");
        datos.setValue(sinBomba, "e)pozo o noria sin bomba", "e) " +  sinBomba + "%");
        datos.setValue(lluvia, "f)lluvia, río, vertiente, acequia", "f) " + lluvia + "%");
        datos.setValue(lago, "g)lago, laguna, curichi", "g) " + lago + "%");
        
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Servicio de Agua",    
                "Personas de Bolivia", 
                "% Porcentaje",   
                datos,               
                PlotOrientation.VERTICAL, 
                true,   
                true,  
                false);   
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(560, 292));
        
        Panel1.setLayout(new BorderLayout());
        Panel1.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }
    
    private int getDatos(String variable ,String valor){
        String cantidad = "";
         try {
                String sql = "SELECT COUNT("+variable+") AS cantidad\n" +
                            "FROM cap_b \n" +
                            "WHERE "+variable+" = '"+valor+"'";
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                cantidad = rs.getString("cantidad");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.parseInt(cantidad); 
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
        PanelCaract1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        PanelCaract2 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

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

        PanelCaract1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCaract1Layout = new javax.swing.GroupLayout(PanelCaract1);
        PanelCaract1.setLayout(PanelCaract1Layout);
        PanelCaract1Layout.setHorizontalGroup(
            PanelCaract1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaract1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCaract1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(PanelCaract1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelCaract1Layout.setVerticalGroup(
            PanelCaract1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaract1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCaract1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCaract1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Caracteristicas 1", PanelCaract1);

        PanelCaract2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1164, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCaract2Layout = new javax.swing.GroupLayout(PanelCaract2);
        PanelCaract2.setLayout(PanelCaract2Layout);
        PanelCaract2Layout.setHorizontalGroup(
            PanelCaract2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelCaract2Layout.setVerticalGroup(
            PanelCaract2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaract2Layout.createSequentialGroup()
                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Caracteristicas 2", PanelCaract2);

        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int r =JOptionPane.showOptionDialog(this, "¿Está seguro de cerrar la sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "No");
        if (r == 0){
            this.setVisible(false);
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
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel PanelCaract1;
    private javax.swing.JPanel PanelCaract2;
    private javax.swing.JPanel PanelTiposViv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
