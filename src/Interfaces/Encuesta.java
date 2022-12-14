/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import dba.Mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class Encuesta extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel model;
    Statement sent;
    
    public Encuesta() {
        initComponents();    
        conn=Mysql.getConnection();
        
        txtCodVivienda.setText(JefeFamilia.codVivienda);
        txtCodVivienda.setEditable(false);
        llenarDatosEncuesta();
        llenarTablas();
    }
    
    @SuppressWarnings("unchecked")
    
    private void llenarDatosEncuesta(){
        llenarCapA();
        llenarCapB();
        llenarCapC();
        llenarCapD();
        llenarCapE();
    }
    private void llenarTablas(){
        llenarTablaC();
        llenarTablaD();
        llenarTablaE();
        llenarTablaF();
    }
    
    private void llenarCapA(){
        try {
            conn = Mysql.getConnection();
            String sql = "select * from cap_a where codVivienda = " + JefeFamilia.codVivienda;
            
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); //  resultados
            rs.next(); // SI O SI PONER PARA LO RESULTADOS
            txtCodMun.setText(rs.getString("codMunicipal"));
            txtDistrito.setText(rs.getString("distrito"));
            txtCiudad.setText(rs.getString("ciudad"));
            txtZonaCensal.setText(rs.getString("zonaCensal"));
            txtSector.setText(rs.getString("sector"));
            txtSegmento.setText(rs.getString("segmento"));
            txtManzana.setText(rs.getString("manzana"));
            txtCiudadCom.setText(rs.getString("comunidad"));
            txtLocalidad.setText(rs.getString("localidad"));
            txtBarrio.setText(rs.getString("barrio"));
            txtCalle.setText(rs.getString("calle"));
            txtNumPuerta.setText(rs.getString("numPuerta"));
            txtPiso.setText(rs.getString("piso"));
            txtNumDep.setText(rs.getString("numDepartamento"));
            txtNombreEd.setText(rs.getString("nomEdificio"));
            txtNumOrdenV.setText(rs.getString("numOrdVivienda"));
            txtNumBoleta.setText(rs.getString("numBoleta"));
            txtTotalPers.setText(rs.getString("totalPersonas"));
            txtNumHom.setText(rs.getString("hombres"));
            txtNumMuj.setText(rs.getString("mujeres"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarCapB(){
        try {
            conn = Mysql.getConnection();
            String sql = "select * from cap_b where codVivienda = " + JefeFamilia.codVivienda;
            
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); //  resultados
            rs.next(); // SI O SI PONER PARA LO RESULTADOS
            txtB1.setText(rs.getString("tipo"));
            txtB2.setText(rs.getString("estado"));
            txtB3.setText(rs.getString("materialPared"));
            txtB4.setText(rs.getString("interiorRevoque"));
            txtB5.setText(rs.getString("materialTecho"));
            txtB6.setText(rs.getString("materialPiso"));
            txtB7.setText(rs.getString("agua"));
            txtB8.setText(rs.getString("aguaDistribuye"));
            txtB9.setText(rs.getString("sanitario"));
            txtB10.setText(rs.getString("sanitarioDesague"));
            txtB11.setText(rs.getString("energiaElectrica"));
            txtB12.setText(rs.getString("energiaCocina"));
            txtB13.setText(rs.getString("cuartoCocina"));
            txtB14.setText(rs.getString("cuartoOcupado"));
            txtB15.setText(rs.getString("cuartoDormir"));
            txtB16.setText(rs.getString("basuraelimina"));
            txtB17.setText(rs.getString("tieneRadio"));
            txtB18.setText(rs.getString("tieneTelevisor"));
            txtB19.setText(rs.getString("tieneComputadora"));
            // aniadir mas jtxf y arregalr disenio
            txtB20.setText(rs.getString("tieneServicioDeInternet"));
            txtB21.setText(rs.getString("tieneServicioDeTelefonia"));
            txtB22.setText(rs.getString("tieneVehiculoAutomotor"));
            txtB23.setText(rs.getString("tieneBicicleta"));
            txtB24.setText(rs.getString("tieneMotocicletaOCuadratac"));
            txtB25.setText(rs.getString("tieneCarretaOCarreton"));
            txtB26.setText(rs.getString("tieneBote"));
            txtB27.setText(rs.getString("vivienda"));
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarCapC(){
        try {
            conn = Mysql.getConnection();
            String sql = "select * from cap_c where codVivienda = " + JefeFamilia.codVivienda;
            
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); //  resultados
            rs.next(); // SI O SI PONER PARA LO RESULTADOS
            txtC1.setText(rs.getString("personaOtroPais"));
            txtC2.setText(rs.getString("cantPersonas"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarCapD(){
        try {
            conn = Mysql.getConnection();
            String sql = "select * from cap_d where codVivienda = " + JefeFamilia.codVivienda;
            
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); //  resultados
            rs.next(); // SI O SI PONER PARA LO RESULTADOS
            txtD1.setText(rs.getString("personaMuerta"));
            txtD2.setText(rs.getString("cantMuertos"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarCapE(){
        try {
            conn = Mysql.getConnection();
            String sql = "select * from cap_e where codVivienda = " + JefeFamilia.codVivienda;
            
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); //  resultados
            rs.next(); // SI O SI PONER PARA LO RESULTADOS
            txtE1.setText(rs.getString("dificultad"));
            txtE2.setText(rs.getString("cantPersonas"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarCapF(){
        try {
            conn = Mysql.getConnection();
            String sql = "select * from cap_f where codVivienda = " + JefeFamilia.codVivienda;
            
            sent = conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs = sent.executeQuery(sql); //  resultados
            rs.next(); // SI O SI PONER PARA LO RESULTADOS
            
            txtF1.setText(rs.getString("numPersona"));
            txtF2.setText(rs.getString("nomPersona"));
            
            txtF23.setText(rs.getString("parentesco"));
            txtF24.setText(rs.getString("sexo"));
            txtF25.setText(rs.getString("edad"));
            txtF26.setText(rs.getString("nacInscrito"));
            txtF27.setText(rs.getString("carnet"));
            txtF28.setText(rs.getString("problemaSaludAcude"));
            txtF29.setText(rs.getString("indigenaOriginario"));
            txtF30.setText(rs.getString("primerIdioma"));
            txtF31.setText(rs.getString("hablaIdiomas"));
            txtF32.setText(rs.getString("dondeNacio"));
            txtF33.setText(rs.getString("dondeVive"));
            txtF34.setText(rs.getString("viviaHace"));
            txtF35.setText(rs.getString("leerEscribir"));
            txtF36.setText(rs.getString("acudeColegio"));
            txtF37.setText(rs.getString("nivelEstudio"));
            txtF38.setText(rs.getString("nivelAprobado"));
            txtF39.setText(rs.getString("trabajo"));
            txtF40.setText(rs.getString("trabajoSemana"));
            txtF41.setText(rs.getString("duranteSemana"));
            txtF42.setText(rs.getString("ocupacion"));
            txtF43.setText(rs.getString("ocupacionTrabajo"));
            txtF44.setText(rs.getString("produceVende"));
            txtF45.setText(rs.getString("estadoCivil"));
            txtF46.setText(rs.getString("hijos"));
            txtF47.setText(rs.getString("hijoViven"));
            txtF48.setText(rs.getString("ultHijoNacio"));
            txtF49.setText(rs.getString("vive"));
            txtF50.setText(rs.getString("lugarParto"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarTablaC(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codVivienda", "numPersona", "nomPersona", "sexo", "añoSalida","edadSalida","paisActual"}; // colocar mismos nombres de la tabla
            String sql = "select * from cap_cpersfuera Where codVivienda = " + JefeFamilia.codVivienda;
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs=sent.executeQuery(sql); // 
            
            String[]fila = new String[7];
            while(rs.next()){
                fila[0]=rs.getString("codVivienda"); //No colocar repetidos
                fila[1]=rs.getString("numPersona");
                fila[2]=rs.getString("nomPersona");
                fila[3]=rs.getString("sexo");
                fila[4]=rs.getString("añoSalida");
                fila[5]=rs.getString("edadSalida");
                fila[6]=rs.getString("paisActual");
                model.addRow(fila);
            }
            TablaC.setModel(model); // para agregar datos a la tabla
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    private void llenarTablaD(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codVivienda", "numPersona", "nomPersona", "edadPersona", "sexoPersona","causaMuerte"}; // colocar mismos nombres de la tabla
            String sql = "select * from cap_dmuertos Where codVivienda = " + JefeFamilia.codVivienda;
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs=sent.executeQuery(sql); // 
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("codVivienda"); //No colocar repetidos
                fila[1]=rs.getString("numPersona");
                fila[2]=rs.getString("nomPersona");
                fila[3]=rs.getString("edadPersona");
                fila[4]=rs.getString("sexoPersona");
                fila[5]=rs.getString("causaMuerte");
                model.addRow(fila);
            }
            TablaD.setModel(model); // para agregar datos a la tabla
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    private void llenarTablaE(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codVivienda", "nroDePersona", "nombre", "edad", "genero","dificultad"}; // colocar mismos nombres de la tabla
            String sql = "select * from datos_persona_dif Where codVivienda = " + JefeFamilia.codVivienda;
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs=sent.executeQuery(sql); // 
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("codVivienda"); //No colocar repetidos
                fila[1]=rs.getString("nroDePersona");
                fila[2]=rs.getString("nombre");
                fila[3]=rs.getString("edad");
                fila[4]=rs.getString("genero");
                fila[5]=rs.getString("dificultad");
                model.addRow(fila);
            }
            TablaE.setModel(model); // para agregar datos a la tabla
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void llenarTablaF(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codVivienda", "numPersona", "nomPersona", "parentesco", "sexo","edad"}; // colocar mismos nombres de la tabla
            
            String sql = "select * from cap_f Where codVivienda = " + JefeFamilia.codVivienda;
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement(); //sent = estado para ejecutar sql
            ResultSet rs=sent.executeQuery(sql); // 
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("codVivienda"); //No colocar repetidos
                fila[1]=rs.getString("numPersona");
                fila[2]=rs.getString("nomPersona");
                fila[3]=rs.getString("parentesco");
                fila[4]=rs.getString("sexo");
                fila[5]=rs.getString("edad");
                model.addRow(fila);
            }
            TablaF.setModel(model); // para agregar datos a la tabla
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelCapA = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
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
        jPanel9 = new javax.swing.JPanel();
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
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtNumOrdenV = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNumBoleta = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTotalPers = new javax.swing.JTextField();
        txtNumHom = new javax.swing.JTextField();
        txtNumMuj = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        PanelCapB = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        txtB4 = new javax.swing.JTextField();
        txtB2 = new javax.swing.JTextField();
        txtB3 = new javax.swing.JTextField();
        txtB6 = new javax.swing.JTextField();
        txtB7 = new javax.swing.JTextField();
        txtB5 = new javax.swing.JTextField();
        txtB10 = new javax.swing.JTextField();
        txtB8 = new javax.swing.JTextField();
        txtB11 = new javax.swing.JTextField();
        txtB12 = new javax.swing.JTextField();
        txtB14 = new javax.swing.JTextField();
        txtB15 = new javax.swing.JTextField();
        txtB16 = new javax.swing.JTextField();
        txtB13 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtB9 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        txtB17 = new javax.swing.JTextField();
        txtB20 = new javax.swing.JTextField();
        txtB21 = new javax.swing.JTextField();
        txtB18 = new javax.swing.JTextField();
        txtB19 = new javax.swing.JTextField();
        txtB22 = new javax.swing.JTextField();
        txtB25 = new javax.swing.JTextField();
        txtB26 = new javax.swing.JTextField();
        txtB23 = new javax.swing.JTextField();
        txtB24 = new javax.swing.JTextField();
        txtB27 = new javax.swing.JTextField();
        PanelCapC = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtC2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtC1 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaC = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        PanelCapD = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaD = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtD1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtD2 = new javax.swing.JTextField();
        PanelCapE = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtE2 = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaE = new javax.swing.JTable();
        PanelCapF = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PanelBDPersonas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaF = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        PanelF1 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        txtF23 = new javax.swing.JTextField();
        txtF24 = new javax.swing.JTextField();
        txtF25 = new javax.swing.JTextField();
        txtF26 = new javax.swing.JTextField();
        txtF27 = new javax.swing.JTextField();
        txtF29 = new javax.swing.JTextField();
        txtF28 = new javax.swing.JTextField();
        txtF31 = new javax.swing.JTextField();
        txtF34 = new javax.swing.JTextField();
        txtF30 = new javax.swing.JTextField();
        txtF32 = new javax.swing.JTextField();
        txtF33 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        txtF1 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtF2 = new javax.swing.JTextField();
        PanelF2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtF36 = new javax.swing.JTextField();
        txtF37 = new javax.swing.JTextField();
        txtF38 = new javax.swing.JTextField();
        txtF35 = new javax.swing.JTextField();
        PanelF3 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtF39 = new javax.swing.JTextField();
        txtF41 = new javax.swing.JTextField();
        txtF42 = new javax.swing.JTextField();
        txtF44 = new javax.swing.JTextField();
        txtF40 = new javax.swing.JTextField();
        txtF43 = new javax.swing.JTextField();
        PanelF4F5 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        txtF45 = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtF46 = new javax.swing.JTextField();
        txtF49 = new javax.swing.JTextField();
        txtF48 = new javax.swing.JTextField();
        txtF47 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtF50 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtCodVivienda = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 22, 47));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CENSO NACIONAL DE POBLACIÓN Y VIVIENDA 2022");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 640, 30));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        PanelCapA.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("1.1 Copie los datos de la ubicación geográfica que figura en la carátula ");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 14, -1, -1));

        jLabel11.setText("Código municipal");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 41, -1, -1));

        jLabel12.setText("Distrito");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 41, -1, -1));

        jLabel13.setText("Ciudad / Comunidad");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 41, -1, -1));

        jLabel14.setText("Zona Censal");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 41, 97, -1));

        jLabel15.setText("Sector");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 41, -1, -1));

        jLabel16.setText("Segmento");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 41, -1, -1));

        jLabel17.setText("Manzana");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 41, -1, -1));
        jPanel8.add(txtCodMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 74, 118, -1));
        jPanel8.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 74, 81, -1));
        jPanel8.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 74, 138, -1));

        txtZonaCensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZonaCensalActionPerformed(evt);
            }
        });
        jPanel8.add(txtZonaCensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 74, 72, -1));
        jPanel8.add(txtSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 100, -1));
        jPanel8.add(txtSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 74, 76, -1));

        txtManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManzanaActionPerformed(evt);
            }
        });
        jPanel8.add(txtManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 74, 76, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ciudad / Comunidad");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 39, -1, -1));

        jLabel3.setText("Localidad / Centro poblado ");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, -1, -1));

        jLabel4.setText("Barrio/Zona/Unidad vecinal ");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 119, -1, -1));

        jLabel5.setText("Calle, avenida, camino o carretera ");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 150, -1, -1));

        jLabel6.setText("Número de puerta");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 150, -1, -1));

        jLabel7.setText("Piso");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 191, -1, -1));

        jLabel8.setText("Número de departamento");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 187, -1, 16));

        jLabel9.setText("Nombre del edificio");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 191, -1, -1));
        jPanel9.add(txtCiudadCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 35, 720, -1));
        jPanel9.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 76, 714, -1));
        jPanel9.add(txtBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 111, 714, -1));
        jPanel9.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 146, 252, -1));

        txtNumPuerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPuertaActionPerformed(evt);
            }
        });
        jPanel9.add(txtNumPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 146, 220, -1));
        jPanel9.add(txtPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 187, 107, -1));
        jPanel9.add(txtNumDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 187, 96, -1));
        jPanel9.add(txtNombreEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 187, 310, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel26.setText("1.2 Dirección de la vivienda");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setText("<html>2.1 Número de orden<p> de la vivienda<html>");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));
        jPanel10.add(txtNumOrdenV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setText("<html>2.2 Número de boleta<p> en la vivienda");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, 50));
        jPanel10.add(txtNumBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 150, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel20.setText("(No olvide incluir a niñas, niños, recién nacidos, ancianas y ancianos)");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel21.setText("Total personas");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel22.setText("Hombres");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel23.setText("Mujeres");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));
        jPanel11.add(txtTotalPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 58, -1));

        txtNumHom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumHomActionPerformed(evt);
            }
        });
        jPanel11.add(txtNumHom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 58, -1));
        jPanel11.add(txtNumMuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 66, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel25.setText("<html>3. En esta vivienda, ¿cuántas personas pasaron la noche anterior<p> al día del Censo?");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 255));
        jLabel46.setText("CAPÍTULO A. UBICACIÓN GEOGRÁFICA DE LA VIVIENDA");
        jLabel46.setToolTipText("");

        javax.swing.GroupLayout PanelCapALayout = new javax.swing.GroupLayout(PanelCapA);
        PanelCapA.setLayout(PanelCapALayout);
        PanelCapALayout.setHorizontalGroup(
            PanelCapALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapALayout.createSequentialGroup()
                .addGroup(PanelCapALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCapALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(PanelCapALayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PanelCapALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCapALayout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PanelCapALayout.setVerticalGroup(
            PanelCapALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCapALayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCapALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CapÍtulo A", PanelCapA);

        PanelCapB.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("1-Tipo vivienda ");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("2. La vivienda esta ...");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("<html>3. ¿Cuál es el material de construcción más utilizado<p> en las paredes exteriores de esta vivienda?");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("4. ¿Las paredes interiores de esta vivienda tienen revoque?");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("<html>5. ¿Cuál es el material más utilizado en los<p> techos de esta vivienda?");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("6. ¿Cuál es el material más utilizado en los pisos de esta vivienda?");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("7. Principalmente, ¿el agua que usan en la vivienda ");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("8. ¿El agua que usan en la vivienda se distribuye…");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("9. ¿Tiene servicio sanitario, baño o letrina?");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("10. ¿El servicio sanitario, baño o letrina tiene desagüe...");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("11. ¿Tienen energía eléctrica que proviene de…");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("<html>12. ¿Cuál es el principal combustible o<p> energía que \nutilizan para cocinar?");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("13. ¿Tiene un cuarto sólo para cocinar?");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("<html>14. ¿Cuántos cuartos o habitaciones<p> ocupa su hogar, sin contar cuartos de baño y de cocina? ");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("<html>15. Del total de cuartos o habitaciones<p> ¿cuántos se utilizan sólo para dormir?");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("16. ¿Cómo eliminan principalmente la basura?");

        txtB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB5ActionPerformed(evt);
            }
        });

        txtB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB10ActionPerformed(evt);
            }
        });

        txtB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB11ActionPerformed(evt);
            }
        });

        txtB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB12ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("17. ¿Este hogar tiene…");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 51, 153));
        jLabel47.setText("CAPITULO B. PRINCIPALES CARACTERISTICAS DE LA VIVIENDA ");
        jLabel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel94.setText("servicio de telefonía fija o celular?");

        jLabel95.setText("servicio de internet?");

        jLabel96.setText("Computadora?");

        jLabel97.setText("Televisor?");

        jLabel42.setText("Radio?");

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel103.setText("18. ¿Este hogar tiene…");

        jLabel104.setText("deslizador, balsa, canoa o bote?");

        jLabel105.setText("carreta o carretón?");

        jLabel106.setText("motocicleta o cuadratrac?");

        jLabel107.setText("bicicleta?");

        jLabel108.setText("vehículo automotor?");

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel109.setText("19. ¿La vivienda que ocupa este hogar es…");

        javax.swing.GroupLayout PanelCapBLayout = new javax.swing.GroupLayout(PanelCapB);
        PanelCapB.setLayout(PanelCapBLayout);
        PanelCapBLayout.setHorizontalGroup(
            PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel35)
                    .addComponent(txtB6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtB5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtB10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addGap(21, 21, 21)
                .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtB11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtB14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCapBLayout.createSequentialGroup()
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtB17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB20, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB21, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB19, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtB16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addComponent(txtB15, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCapBLayout.createSequentialGroup()
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtB22, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB23, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB25, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB26, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB24, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtB27)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(297, 297, 297))
            .addGroup(PanelCapBLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCapBLayout.setVerticalGroup(
            PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapBLayout.createSequentialGroup()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCapBLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(0, 0, 0)
                        .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel24)
                        .addGap(0, 0, 0)
                        .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28)
                        .addGap(0, 0, 0)
                        .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel31)
                        .addGap(0, 0, 0)
                        .addComponent(txtB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel32)
                        .addGap(0, 0, 0)
                        .addComponent(txtB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel33)
                        .addGap(0, 0, 0)
                        .addComponent(txtB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel34)
                        .addGap(0, 0, 0)
                        .addComponent(txtB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCapBLayout.createSequentialGroup()
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCapBLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(0, 0, 0)
                                .addComponent(txtB11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel38)
                                .addGap(0, 0, 0)
                                .addComponent(txtB13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtB14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCapBLayout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(18, 18, 18)
                                .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCapBLayout.createSequentialGroup()
                                        .addComponent(jLabel108)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel107)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel106)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel105)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel104))
                                    .addGroup(PanelCapBLayout.createSequentialGroup()
                                        .addComponent(txtB22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(txtB23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtB24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtB25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtB26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCapBLayout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtB15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel41)
                                .addGap(0, 0, 0)
                                .addComponent(txtB16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCapBLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel109)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel43)
                        .addGap(15, 15, 15)
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txtB17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(txtB18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCapBLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel96)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCapBLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(txtB20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(PanelCapBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(txtB21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("CapÍtulo B", PanelCapB);

        PanelCapC.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setText("Numero de personas:");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));
        jPanel3.add(txtC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 160, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel49.setText("20. Desde 2001 a la fecha, alguna persona que vivía con ustedes en este hogar, ¿actualmente vive en otro país?");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        txtC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, -1));

        jLabel58.setText("Existe personas fuera:");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Persona fuera del pais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaC);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1090, 350));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 255));
        jLabel66.setText("CAPÍTULO C. EMIGRACIÓN INTERNACIONAL ");
        jLabel66.setToolTipText("");

        javax.swing.GroupLayout PanelCapCLayout = new javax.swing.GroupLayout(PanelCapC);
        PanelCapC.setLayout(PanelCapCLayout);
        PanelCapCLayout.setHorizontalGroup(
            PanelCapCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelCapCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCapCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(337, 337, 337))
        );
        PanelCapCLayout.setVerticalGroup(
            PanelCapCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapCLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CapÍtulo C", PanelCapC);

        PanelCapD.setBackground(new java.awt.Color(255, 255, 255));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 51, 255));
        jLabel63.setText("CAPÍTULO D. MORTALIDAD");
        jLabel63.setToolTipText("");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Persona fallecidas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaD.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaD);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1080, 320));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel50.setText("21. De enero a diciembre del año pasado,¿murio alguna persona que vivia con usted en este hogar?");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 811, -1));
        jPanel5.add(txtD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, -1));

        jLabel64.setText("Existe mortalidad:");
        jPanel5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel65.setText("Numero de personas:");
        jPanel5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));
        jPanel5.add(txtD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 160, -1));

        javax.swing.GroupLayout PanelCapDLayout = new javax.swing.GroupLayout(PanelCapD);
        PanelCapD.setLayout(PanelCapDLayout);
        PanelCapDLayout.setHorizontalGroup(
            PanelCapDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapDLayout.createSequentialGroup()
                .addGroup(PanelCapDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCapDLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(PanelCapDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCapDLayout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel63)))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        PanelCapDLayout.setVerticalGroup(
            PanelCapDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapDLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CapÍtulo D", PanelCapD);

        PanelCapE.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel51.setText("22. ¿Hay en este hogar alguna persona con dificultad permanente para...");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 21, 540, -1));

        jLabel52.setText("ver, aun si usa anteojos o lentes?");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 54, -1, -1));

        jLabel53.setText("oír, aun si usa audífono?");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 81, -1, -1));

        jLabel54.setText("hablar, comunicarse o conversar?");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 112, -1, -1));

        jLabel55.setText("caminar o subir escalones?");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 143, -1, -1));

        jLabel56.setText("recordar o concentrarse?");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 174, -1, -1));

        jLabel67.setText("Numero de personas:");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));
        jPanel2.add(txtE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 160, -1));
        jPanel2.add(txtE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 150, -1));

        jLabel69.setText("Existe dificultad:");
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 255));
        jLabel68.setText("CAPÍTULO E. PERSONAS CON ALGUNA DIFICULTAD PERMANENTE");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Persona con dificultad permanente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TablaE);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1120, 250));

        javax.swing.GroupLayout PanelCapELayout = new javax.swing.GroupLayout(PanelCapE);
        PanelCapE.setLayout(PanelCapELayout);
        PanelCapELayout.setHorizontalGroup(
            PanelCapELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapELayout.createSequentialGroup()
                .addGroup(PanelCapELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCapELayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PanelCapELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCapELayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel68)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelCapELayout.setVerticalGroup(
            PanelCapELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapELayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CapÍtulo E", PanelCapE);

        PanelCapF.setBackground(new java.awt.Color(255, 255, 255));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 255));
        jLabel70.setText("CAPÍTULO F. PRINCIPALES CARACTERÍSTICAS DE LA PERSONA");

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        PanelBDPersonas.setBackground(new java.awt.Color(255, 255, 255));

        TablaF.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaF);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel44.setText("NOTA: SELECCIONE EL NUMERO DE PERSONA PARA PODER VER LOS DATOS");

        javax.swing.GroupLayout PanelBDPersonasLayout = new javax.swing.GroupLayout(PanelBDPersonas);
        PanelBDPersonas.setLayout(PanelBDPersonasLayout);
        PanelBDPersonasLayout.setHorizontalGroup(
            PanelBDPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBDPersonasLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelBDPersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBDPersonasLayout.setVerticalGroup(
            PanelBDPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBDPersonasLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel44)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Personas", PanelBDPersonas);

        PanelF1.setBackground(new java.awt.Color(255, 255, 255));
        PanelF1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "F 1. PARA TODAS LAS PERSONAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel126.setText("23.¿Qué relación o parentesco tiene con la jefa o jefe del hogar? ");

        jLabel127.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel127.setText("24. ¿Es mujer u hombre?");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel128.setText("25. ¿Cuántos años cumplidos tiene?");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel129.setText("26. ¿Su nacimiento está inscrito en el registro civil o cívico?");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel130.setText("27. ¿Tiene carnet o cédula de identidad?");

        jLabel131.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel131.setText("28. Cuando tiene problemas de salud, ¿acude a...");

        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel132.setText("<html>29. Como boliviana o boliviano ¿Pertenece a alguna nacion o pueblo indigena originario campesino o afroboliviano?");

        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel133.setText("30. ¿Habla, cual es el primer idioma que aprendió a hablar en su niñez?");

        jLabel134.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel134.setText("31. ¿Qué idiomas habla?");

        jLabel135.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel135.setText("32. ¿Dónde nació?");

        jLabel136.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel136.setText("33. ¿Dónde vive habitualmente?");

        jLabel137.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel137.setText("34. ¿Dónde vivía hace 5 años?");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel76.setText("Número de persona:");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel79.setText("Nombre de la persona:");

        txtF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76)
                .addGap(18, 18, 18)
                .addComponent(txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79)
                .addGap(32, 32, 32)
                .addComponent(txtF2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)
                    .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelF1Layout = new javax.swing.GroupLayout(PanelF1);
        PanelF1.setLayout(PanelF1Layout);
        PanelF1Layout.setHorizontalGroup(
            PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelF1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelF1Layout.createSequentialGroup()
                        .addGroup(PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel126)
                            .addComponent(jLabel130)
                            .addComponent(jLabel128)
                            .addComponent(txtF23, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF24, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF26, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF27, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF25, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF28, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127)
                            .addComponent(jLabel129)
                            .addComponent(jLabel131))
                        .addGap(38, 38, 38)
                        .addGroup(PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel134)
                            .addComponent(jLabel135)
                            .addComponent(jLabel136)
                            .addComponent(jLabel137)
                            .addGroup(PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(txtF29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtF34, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtF33, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtF32, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtF31, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtF30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel133))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        PanelF1Layout.setVerticalGroup(
            PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelF1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(PanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelF1Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addGap(5, 5, 5)
                        .addComponent(txtF23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel127)
                        .addGap(5, 5, 5)
                        .addComponent(txtF24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel128)
                        .addGap(5, 5, 5)
                        .addComponent(txtF25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel129)
                        .addGap(5, 5, 5)
                        .addComponent(txtF26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtF27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtF28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelF1Layout.createSequentialGroup()
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtF29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel133)
                        .addGap(5, 5, 5)
                        .addComponent(txtF30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel134)
                        .addGap(5, 5, 5)
                        .addComponent(txtF31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtF32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtF33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel137)
                        .addGap(5, 5, 5)
                        .addComponent(txtF34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("F1", PanelF1);

        PanelF2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "F 2. SÓLO PARA PERSONAS DE 4 AÑOS O MÁS DE EDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel57.setText("35. ¿Sabe leer y escribir?");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel59.setText("36. Actualmente, ¿asiste a una escuela o colegio?");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel60.setText("37. ¿Cuál fue el nivel y curso más alto de instrucción que aprobó?");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel61.setText("38. Para ingresar a ese nivel, ¿cuál fue el nivel y curso de educación escolar que aprobó?");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtF35, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF36, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel57)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF37, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF38)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(txtF35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addComponent(txtF36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(txtF37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtF38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelF2Layout = new javax.swing.GroupLayout(PanelF2);
        PanelF2.setLayout(PanelF2Layout);
        PanelF2Layout.setHorizontalGroup(
            PanelF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelF2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PanelF2Layout.setVerticalGroup(
            PanelF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelF2Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("F2", PanelF2);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "F 3. SÓLO PARA PERSONAS DE 7 AÑOS O MÁS DE EDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel62.setText("39. Durante la semana pasada ¿trabajó?");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel71.setText("40. Durante la semana pasada,...");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel72.setText("41. Durante la semana pasada, ...");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel73.setText("42. ¿Cuál fue su ocupación, trabajo u oficio principal durante la semana pasada?");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel74.setText("43. En esa ocupación, ¿usted trabajo como...");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel75.setText("<html>44. ¿Qué produce, vende o a que actividad económica se dedica principalmente <p>el lugar o establecimiento donde trabaja?");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtF43, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtF44, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF40, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(txtF39, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel72)
                    .addComponent(txtF41, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF42, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtF39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel71)
                .addGap(5, 5, 5)
                .addComponent(txtF40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtF41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel73)
                .addGap(5, 5, 5)
                .addComponent(txtF42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel74)
                .addGap(5, 5, 5)
                .addComponent(txtF43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtF44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelF3Layout = new javax.swing.GroupLayout(PanelF3);
        PanelF3.setLayout(PanelF3Layout);
        PanelF3Layout.setHorizontalGroup(
            PanelF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelF3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PanelF3Layout.setVerticalGroup(
            PanelF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelF3Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("F3", PanelF3);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "F 4. SÓLO PARA PERSONAS DE 15 AÑOS O MÁS DE EDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel77.setText("45. ¿Cuál es su estado civil o conyugal?");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(txtF45, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtF45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "F 5. SÓLO PARA MUJERES DE 15 AÑOS O MÁS DE EDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22))); // NOI18N

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel81.setText("<html>46. En total, ¿cuántas hijas e hijos nacidos vivos ha tenido usted, incluyendo fallecidos <p>fallecidos o ausentes?");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel89.setText("47. De sus hijas e hijos nacidos vivos, ¿cuántos viven actualmente?");

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel90.setText("48. ¿En qué mes y año nació su última hija o hijo nacido vivo?");

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel91.setText("49. a) Ésta última hija o hijo ¿vive actualmente?");

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel92.setText("b) Ésta última hija o hijo ¿vive actualmente?");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtF47, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF48, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF46, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel91)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtF50, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92)
                            .addComponent(txtF49, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel90))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtF46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel89)
                .addGap(0, 0, 0)
                .addComponent(txtF47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel90)
                .addGap(0, 0, 0)
                .addComponent(txtF48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel91)
                .addGap(0, 0, 0)
                .addComponent(txtF49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel92)
                .addGap(0, 0, 0)
                .addComponent(txtF50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelF4F5Layout = new javax.swing.GroupLayout(PanelF4F5);
        PanelF4F5.setLayout(PanelF4F5Layout);
        PanelF4F5Layout.setHorizontalGroup(
            PanelF4F5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelF4F5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelF4F5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelF4F5Layout.setVerticalGroup(
            PanelF4F5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelF4F5Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("F4     F5", PanelF4F5);

        javax.swing.GroupLayout PanelCapFLayout = new javax.swing.GroupLayout(PanelCapF);
        PanelCapF.setLayout(PanelCapFLayout);
        PanelCapFLayout.setHorizontalGroup(
            PanelCapFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCapFLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PanelCapFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCapFLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCapFLayout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        PanelCapFLayout.setVerticalGroup(
            PanelCapFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCapFLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addGap(70, 70, 70))
        );

        jTabbedPane1.addTab("CapÍtulo F", PanelCapF);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1200, 620));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(4, 22, 47));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("ESTADO PLURINACIONAL DE BOLIVIA ");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 470, 30));

        txtCodVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodViviendaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 86, 30));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel78.setText("Codigo Vivienda:");
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jButton2.setText("CERRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 710, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtZonaCensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZonaCensalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZonaCensalActionPerformed

    private void txtManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManzanaActionPerformed

    private void txtNumPuertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPuertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPuertaActionPerformed

    private void txtNumHomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumHomActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNumHomActionPerformed

    private void txtB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB5ActionPerformed

    private void txtB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB12ActionPerformed

    private void txtC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1ActionPerformed

    private void txtCodViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodViviendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodViviendaActionPerformed

    private void txtF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON CERRAR
        int r =JOptionPane.showOptionDialog(this, "¿Está seguro de cerrar la sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "No");
        if (r == 0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB10ActionPerformed

    private void txtB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB11ActionPerformed

    private void TablaFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFMouseClicked
        // MOUSE CLICKED DE TABLA JEFE DE FAMILIA
        if (evt.getButton()==1){
            int fila = TablaF.getSelectedRow();
            try {
                //HabilitarTablaJefeZona(false);
                String sql = "SELECT * from cap_f WHERE numPersona = " + TablaF.getValueAt(fila,1);
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                
                txtF1.setText(rs.getString("numPersona"));
                txtF2.setText(rs.getString("nomPersona"));

                txtF23.setText(rs.getString("parentesco"));
                txtF24.setText(rs.getString("sexo"));
                txtF25.setText(rs.getString("edad"));
                txtF26.setText(rs.getString("nacInscrito"));
                txtF27.setText(rs.getString("carnet"));
                txtF28.setText(rs.getString("problemaSaludAcude"));
                txtF29.setText(rs.getString("indigenaOriginario"));
                txtF30.setText(rs.getString("primerIdioma"));
                txtF31.setText(rs.getString("hablaIdiomas"));
                txtF32.setText(rs.getString("dondeNacio"));
                txtF33.setText(rs.getString("dondeVive"));
                txtF34.setText(rs.getString("viviaHace"));
                txtF35.setText(rs.getString("leerEscribir"));
                txtF36.setText(rs.getString("acudeColegio"));
                txtF37.setText(rs.getString("nivelEstudio"));
                txtF38.setText(rs.getString("nivelAprobado"));
                txtF39.setText(rs.getString("trabajo"));
                txtF40.setText(rs.getString("trabajoSemana"));
                txtF41.setText(rs.getString("duranteSemana"));
                txtF42.setText(rs.getString("ocupacion"));
                txtF43.setText(rs.getString("ocupacionTrabajo"));
                txtF44.setText(rs.getString("produceVende"));
                txtF45.setText(rs.getString("estadoCivil"));
                txtF46.setText(rs.getString("hijos"));
                txtF47.setText(rs.getString("hijoViven"));
                txtF48.setText(rs.getString("ultHijoNacio"));
                txtF49.setText(rs.getString("vive"));
                txtF50.setText(rs.getString("lugarParto"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_TablaFMouseClicked

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBDPersonas;
    private javax.swing.JPanel PanelCapA;
    private javax.swing.JPanel PanelCapB;
    private javax.swing.JPanel PanelCapC;
    private javax.swing.JPanel PanelCapD;
    private javax.swing.JPanel PanelCapE;
    private javax.swing.JPanel PanelCapF;
    private javax.swing.JPanel PanelF1;
    private javax.swing.JPanel PanelF2;
    private javax.swing.JPanel PanelF3;
    private javax.swing.JPanel PanelF4F5;
    private javax.swing.JTable TablaC;
    private javax.swing.JTable TablaD;
    private javax.swing.JTable TablaE;
    private javax.swing.JTable TablaF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB10;
    private javax.swing.JTextField txtB11;
    private javax.swing.JTextField txtB12;
    private javax.swing.JTextField txtB13;
    private javax.swing.JTextField txtB14;
    private javax.swing.JTextField txtB15;
    private javax.swing.JTextField txtB16;
    private javax.swing.JTextField txtB17;
    private javax.swing.JTextField txtB18;
    private javax.swing.JTextField txtB19;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB20;
    private javax.swing.JTextField txtB21;
    private javax.swing.JTextField txtB22;
    private javax.swing.JTextField txtB23;
    private javax.swing.JTextField txtB24;
    private javax.swing.JTextField txtB25;
    private javax.swing.JTextField txtB26;
    private javax.swing.JTextField txtB27;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtB6;
    private javax.swing.JTextField txtB7;
    private javax.swing.JTextField txtB8;
    private javax.swing.JTextField txtB9;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCiudadCom;
    private javax.swing.JTextField txtCodMun;
    private javax.swing.JTextField txtCodVivienda;
    private javax.swing.JTextField txtD1;
    private javax.swing.JTextField txtD2;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextField txtE2;
    private javax.swing.JTextField txtF1;
    private javax.swing.JTextField txtF2;
    private javax.swing.JTextField txtF23;
    private javax.swing.JTextField txtF24;
    private javax.swing.JTextField txtF25;
    private javax.swing.JTextField txtF26;
    private javax.swing.JTextField txtF27;
    private javax.swing.JTextField txtF28;
    private javax.swing.JTextField txtF29;
    private javax.swing.JTextField txtF30;
    private javax.swing.JTextField txtF31;
    private javax.swing.JTextField txtF32;
    private javax.swing.JTextField txtF33;
    private javax.swing.JTextField txtF34;
    private javax.swing.JTextField txtF35;
    private javax.swing.JTextField txtF36;
    private javax.swing.JTextField txtF37;
    private javax.swing.JTextField txtF38;
    private javax.swing.JTextField txtF39;
    private javax.swing.JTextField txtF40;
    private javax.swing.JTextField txtF41;
    private javax.swing.JTextField txtF42;
    private javax.swing.JTextField txtF43;
    private javax.swing.JTextField txtF44;
    private javax.swing.JTextField txtF45;
    private javax.swing.JTextField txtF46;
    private javax.swing.JTextField txtF47;
    private javax.swing.JTextField txtF48;
    private javax.swing.JTextField txtF49;
    private javax.swing.JTextField txtF50;
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
}
