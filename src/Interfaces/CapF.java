/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import dba.Mysql;
import java.sql.Array.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CapF extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    /**
     * Creates new form CapF
     */
    FondoPanel fondo = new FondoPanel();
    
    
    public CapF() {
        this.setContentPane(fondo);
        
        initComponents();
        
        conn=Mysql.getConnection();
    }
  
    
    private String preg23(){
        /*
        jRadioButton1.setActionCommand("Jefa o jefe del hogar");
        jRadioButton2.setActionCommand("Esposo/a, conviviente o concubino/a");
        jRadioButton3.setActionCommand("Hija o hijo");
        jRadioButton4.setActionCommand("Nuera o Yerno");
        jRadioButton5.setActionCommand("Nieta o nieto");
        jRadioButton6.setActionCommand("Hermana/o o cuñada/o");
        jRadioButton7.setActionCommand("Padre, madre, suegra/o");
        jRadioButton8.setActionCommand("Otro pariente");
        jRadioButton9.setActionCommand("Trabajador/a del hogar");
        jRadioButton10.setActionCommand("Otro no pariente");
        jRadioButton11.setActionCommand("Persona en vivienda colectiva");*/
        
        String resp;
        if(jRadioButton1.isSelected()){resp = "Jefa o jefe del hogar";}
        else if(jRadioButton2.isSelected()){resp = "Esposo/a, conviviente o concubino/a";}
        else if(jRadioButton3.isSelected()){resp = "Hija o hijo";}
        else if(jRadioButton4.isSelected()){resp = "Nuera o Yerno";}
        else if(jRadioButton5.isSelected()){resp = "Nieta o nieto";}
        else if(jRadioButton6.isSelected()){resp = "Hermana/o o cuñada/o";}
        else if(jRadioButton7.isSelected()){resp = "Padre, madre, suegra/o";}
        else if(jRadioButton8.isSelected()){resp = "Otro pariente";}
        else if(jRadioButton9.isSelected()){resp = "Trabajador/a del hogar";}
        else if(jRadioButton10.isSelected()){resp = "Otro no pariente";}
        else if(jRadioButton11.isSelected()){resp = "Persona en vivienda colectiva";}
        else{
            resp = "";
        }
        return resp;     
    }
    
    private String preg24(){
        /*jRadioButton12.setActionCommand("Mujer");
        jRadioButton12.setActionCommand("Hombre");*/
        
        String resp;
        if(jRadioButton12.isSelected()){resp = "Mujer";}
        else if(jRadioButton13.isSelected()){resp = "Hombre";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg26(){
        /*jRadioButton17.setActionCommand("Si");
        jRadioButton16.setActionCommand("No");*/
        
        String resp;
        if(jRadioButton17.isSelected()){resp = "Si";}
        else if(jRadioButton16.isSelected()){resp = "No";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg27(){
        
        /*jRadioButton18.setActionCommand("Si");
        jRadioButton19.setActionCommand("No");*/
        
        String resp;
        if(jRadioButton18.isSelected()){resp = "Si";}
        else if(jRadioButton19.isSelected()){resp = "No";}
        else{
            resp = "";
        }
        return resp;
    }
    private String preg28(){
      /*jRadioButton20.setActionCommand("caja de salud (CNS, COSSMIL, u otras)");
        jRadioButton21.setActionCommand("seguro desalud privado");
        jRadioButton22.setActionCommand("establecimiento de salud privado");
        jRadioButton23.setActionCommand("establecimiento de salud publico");
        jRadioButton24.setActionCommand("medico tradicional");
        jRadioButton25.setActionCommand("soluciones caceras");
        jRadioButton26.setActionCommand("la farmacia o se automedica");*/
        
        String resp;
        if(jRadioButton20.isSelected()){resp = "caja de salud (CNS, COSSMIL, u otras)";}
        else if(jRadioButton21.isSelected()){resp = "seguro de salud privado";}
        else if(jRadioButton22.isSelected()){resp = "establecimiento de salud privado";}
        else if(jRadioButton23.isSelected()){resp = "establecimiento de salud publico";}
        else if(jRadioButton24.isSelected()){resp = "medico tradicional";}
        else if(jRadioButton25.isSelected()){resp = "soluciones caceras";}
        else if(jRadioButton26.isSelected()){resp = "la farmacia o se automedica";}
        else{
            resp = "";
        }
        return resp;
    }

    
    private String preg29(){
      /*jRadioButton33.setActionCommand("Si");
        jRadioButton34.setActionCommand("No pertenece");
        jRadioButton35.setActionCommand("No soy boliviana o boliviano");*/
        String resp;
        if(jRadioButton33.isSelected()){
            resp = "Si, "+jTextField4.getText();
            jTextField4.setEditable(true);}
        else if(jRadioButton34.isSelected()){
            resp = "No pertenece";
            jTextField4.setEditable(false);
        }else if(jRadioButton35.isSelected()){
            resp = "No soy boliviana o boliviano";
            jTextField4.setEditable(false);
        }else{
            resp = "";
        }
        return resp;
    }
    
    private String preg30(){
        String resp;
        if(jRadioButton15.isSelected()){resp = "Si, "+jTextField5.getText();}
        else if(jRadioButton14.isSelected()){resp = "No habla";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg31a(){
        String result;
        if(jTextField6.getText()!= ""){
            result = jTextField6.getText();
        }else if(jTextField7.getText()!= ""){
            result = ", "+jTextField7.getText();
        }else if(jTextField8.getText()!= ""){
            result = ", "+jTextField8.getText();
        }else if(jTextField9.getText()!= ""){
            result = ", "+jTextField9.getText();
        }else{
            result = "";
        }
        return result;
    }
    
    /*private String preg32(){
        jRadioButton38.setActionCommand("Aqui");
        jRadioButton39.setActionCommand("En otro lugar del pais");
        jRadioButton40.setActionCommand("En el exterior");
        
        String result = "";
       
           
           if(buttonGroup7.getSelection().getActionCommand()=="Aqui"){
               result = "Aqui";
           }else if(buttonGroup7.getSelection().getActionCommand()=="En otro lugar del pais"){
               result = "En otro lugar del pais, "+jTextField13+", "+jTextField12+", "+jTextField11;
           }else if(buttonGroup7.getSelection().getActionCommand()=="En el exterior"){
               result = "En el exterior, "+  jTextField14;
           }
           
           return result;
    }*/
    private String preg32(){
            
        String resp;
        if(jRadioButton38.isSelected()){
            resp = "Aqui";
            //jTextField4.setEditable(true);}
        }else if(jRadioButton39.isSelected()){
            resp = "En otro lugar del pais "+jTextField13.getText() +", "+jTextField12.getText() +", "+jTextField11.getText();
            //jTextField4.setEditable(false);
        }else if(jRadioButton34.isSelected()){
            resp = "En el exterior, "+  jTextField14.getText()+" Año:"+jTextField28.getText();
            //jTextField4.setEditable(false);
        }else{
            resp = "";
        }
        return resp;

    }
    
    private String preg33(){
            
        String resp;
        if(jRadioButton41.isSelected()){
            resp = "Aqui";          
        }else if(jRadioButton42.isSelected()){
            resp = "En otro lugar del pais, "+jTextField17.getText() +", "+jTextField16.getText() +", "+jTextField15.getText();          
        }else if(jRadioButton43.isSelected()){
            resp = "En el exterior, "+  jTextField18.getText();          
        }else{
            resp = "";
        }
        return resp;

    }
    /*private String preg33b(){
        //33
        jRadioButton41.setActionCommand("Aqui");
        jRadioButton42.setActionCommand("En otro lugar del pais");
        jRadioButton43.setActionCommand("En el exterior");
        
        String result = "";
      
           
           if(buttonGroup8.getSelection().getActionCommand()=="Aqui"){
               result = "Aqui";
           }else if(buttonGroup8.getSelection().getActionCommand()=="En otro lugar del pais"){
               result = "En otro lugar del pais, "+jTextField17+", "+jTextField16+", "+jTextField15;
           }else if(buttonGroup8.getSelection().getActionCommand()=="En el exterior"){
               result = "En el exterior, "+  jTextField18;
           }
           
           return result;
    }*/
    
    private String preg34(){
            
        String resp;
        if(jRadioButton44.isSelected()){
            resp = "Aqui";          
        }else if(jRadioButton45.isSelected()){
            resp = "En otro lugar del pais, "+jTextField21.getText() +", "+jTextField20.getText() +", "+jTextField19.getText();          
        }else if(jRadioButton46.isSelected()){
            resp = "En el exterior, "+  jTextField22.getText(); 
        }else if(jRadioButton27.isSelected()){
            resp = "Aún no había nacido";
        }else{
            resp = "";
        }
        return resp;

    }
    
    /*private String preg34b(){
        
        //34
        jRadioButton44.setActionCommand("Aqui");
        jRadioButton45.setActionCommand("En otro lugar del pais");
        jRadioButton46.setActionCommand("En el exterior");
        jRadioButton46.setActionCommand("Aún no había nacido");
        
        String result = "";
       
           
           if(buttonGroup9.getSelection().getActionCommand()=="Aqui"){
               result = "Aqui";
           }else if(buttonGroup9.getSelection().getActionCommand()=="En otro lugar del pais"){
               result = "En otro lugar del pais, "+jTextField21+", "+jTextField20+", "+jTextField19;
           }else if(buttonGroup9.getSelection().getActionCommand()=="En el exterior"){
               result = "En el exterior, "+  jTextField18;
           }else if(buttonGroup9.getSelection().getActionCommand()=="Aún no había nacido"){
               result = "Aún no había nacido";
           }
           
           return result;
    }*/
    
    private String preg35(){
        //35
        /*jRadioButton32.setActionCommand("Si");
        jRadioButton36.setActionCommand("No");*/
        String resp;
        if(jRadioButton32.isSelected()){resp = "Si";}
        else if(jRadioButton36.isSelected()){resp = "No";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg36(){
        //36
        /*jRadioButton28.setActionCommand("Sí, a una pública");
        jRadioButton29.setActionCommand("Sí, a una privada");
        jRadioButton30.setActionCommand("Sí, a una de convenio");
        jRadioButton31.setActionCommand("No asiste");*/
        String resp;
        if(jRadioButton28.isSelected()){resp = "Sí, a una pública";}
        else if(jRadioButton29.isSelected()){resp = "Sí, a una privada";}
        else if(jRadioButton30.isSelected()){resp = "Sí, a una de convenio";}
        else if(jRadioButton31.isSelected()){resp = "No asiste";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg37(){
        //37
        /*jRadioButton47.setActionCommand("Ninguno");
        jRadioButton48.setActionCommand("Curso de alfabetización");
        jRadioButton49.setActionCommand("Inicial (Pre kínder, kínder)");
        jRadioButton50.setActionCommand("Básico (1 a 5 años)");
        jRadioButton51.setActionCommand("Intermedio (1 a 3 años)");
        jRadioButton52.setActionCommand("Medio (1 a 4 años)");
        jRadioButton53.setActionCommand("Primaria (1 a 8 años)");
        jRadioButton54.setActionCommand("Secundaria (1 a 4 años)");
        jRadioButton55.setActionCommand("Primaria (1 a 6 años)");
        jRadioButton56.setActionCommand("Secundaria (1 a 6 años)");
        jRadioButton57.setActionCommand("Técnico universitario");
        jRadioButton58.setActionCommand("Licenciatura");
        jRadioButton59.setActionCommand("Maestría");
        jRadioButton60.setActionCommand("Doctorado");
        jRadioButton61.setActionCommand("Normal Superior");
        jRadioButton62.setActionCommand("Militar o Policial");
        jRadioButton63.setActionCommand("Técnico de Instituto");
        jRadioButton64.setActionCommand("Otro");*/
        String resp;
        if(jRadioButton47.isSelected()){resp = "Ninguno";}
        else if(jRadioButton48.isSelected()){resp = "Curso de alfabetización";}
        else if(jRadioButton49.isSelected()){resp = "Inicial (Pre kínder, kínder)";}
        else if(jRadioButton50.isSelected()){resp = "Básico (1 a 5 años)";}
        else if(jRadioButton51.isSelected()){resp = "Intermedio (1 a 3 años)";}
        else if(jRadioButton52.isSelected()){resp = "Medio (1 a 4 años)";}
        else if(jRadioButton53.isSelected()){resp = "Primaria (1 a 8 años)";}
        else if(jRadioButton54.isSelected()){resp = "Secundaria (1 a 4 años)";}
        else if(jRadioButton55.isSelected()){resp = "Primaria (1 a 6 años)";}
        else if(jRadioButton56.isSelected()){resp = "Secundaria (1 a 6 años)";}
        else if(jRadioButton57.isSelected()){resp = "Técnico universitario";}
        else if(jRadioButton58.isSelected()){resp = "Licenciatura";}
        else if(jRadioButton59.isSelected()){resp = "Maestría";}
        else if(jRadioButton60.isSelected()){resp = "Doctorado";}
        else if(jRadioButton61.isSelected()){resp = "Normal Superior";}
        else if(jRadioButton62.isSelected()){resp = "Militar o Policial";}
        else if(jRadioButton63.isSelected()){resp = "Técnico de Instituto";}
        else if(jRadioButton64.isSelected()){resp = "Otro";}
        
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg38(){
        //38
        /*jRadioButton65.setActionCommand("Básico (1 a 5 años)");
        jRadioButton66.setActionCommand("Intermedio (1 a 3 años)");
        jRadioButton67.setActionCommand("Medio (1 a 4 años)");
        jRadioButton68.setActionCommand("Primaria (1 a 8 años)");
        jRadioButton69.setActionCommand("Secundaria (1 a 4 años)");
        jRadioButton70.setActionCommand("Primaria (1 a 6 años)");
        jRadioButton71.setActionCommand("Secundaria (1 a 6 años)");*/
        
        String resp;
        if(jRadioButton47.isSelected()){resp = "Ninguno";}
        else if(jRadioButton65.isSelected()){resp = "Básico (1 a 5 años)";}
        else if(jRadioButton66.isSelected()){resp = "Intermedio (1 a 3 años)";}
        else if(jRadioButton67.isSelected()){resp = "Medio (1 a 4 años)";}
        else if(jRadioButton68.isSelected()){resp = "Primaria (1 a 8 años)";}
        else if(jRadioButton69.isSelected()){resp = "Secundaria (1 a 4 años)";}
        else if(jRadioButton70.isSelected()){resp = "Primaria (1 a 6 años)";}
        else if(jRadioButton71.isSelected()){resp = "Secundaria (1 a 6 años)";}
        else{
            resp = "";
        }
        return resp;
    }
    
    
    
    private String preg39(){
        //39
        /*jRadioButton72.setActionCommand("Si");
        jRadioButton73.setActionCommand("No");*/
        
        
        String resp;
        if(jRadioButton72.isSelected()){resp = "Si";}
        else if(jRadioButton73.isSelected()){resp = "No";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg40(){
        //40
        /*jRadioButton37.setActionCommand("Tenia trabajo, pero no trabajó por que estuvo de vacacion, enfermo o por falta de materiales");
        jRadioButton74.setActionCommand("Atendió o ayudó en los cultivos agrícolas o en la crianza de animales");
        jRadioButton75.setActionCommand("Atendió o ayudó en algún negocio propio o familiar");
        jRadioButton102.setActionCommand("Realizó alguna actividad por ingreso");
        jRadioButton103.setActionCommand("No trabajó");*/
        
        String resp;
        if(jRadioButton37.isSelected()){resp = "Tenia trabajo, pero no trabajó por que estuvo de vacacion, enfermo o por falta de materiales";}
        else if(jRadioButton74.isSelected()){resp = "Atendió o ayudó en los cultivos agrícolas o en la crianza de animales";}
        else if(jRadioButton75.isSelected()){resp = "Atendió o ayudó en algún negocio propio o familiar";}
        else if(jRadioButton102.isSelected()){resp = "Realizó alguna actividad por ingreso";}
        else if(jRadioButton103.isSelected()){resp = "No trabajó";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg41(){
        //41
        /*jRadioButton79.setActionCommand("Buscó trabajo habiendo trabajado antes");
        jRadioButton80.setActionCommand("Buscó trabajo por primera vez");
        jRadioButton81.setActionCommand("Estuvo estudiando");
        jRadioButton82.setActionCommand("Realizó labores de casa");
        jRadioButton83.setActionCommand("Es jubilado, pensionista o rentista");
        jRadioButton84.setActionCommand("Otra");*/
        
        
        String resp;
        if(jRadioButton79.isSelected()){resp = "Buscó trabajo habiendo trabajado antes";}
        else if(jRadioButton80.isSelected()){resp = "Buscó trabajo por primera vez";}
        else if(jRadioButton81.isSelected()){resp = "Estuvo estudiando";}
        else if(jRadioButton82.isSelected()){resp = "Realizó labores de casa";}
        else if(jRadioButton83.isSelected()){resp = "Es jubilado, pensionista o rentista";}
        else if(jRadioButton84.isSelected()){resp = "Otra";}
        else{
            resp = "";
        }
        return resp;
    }
    private void deshabilitar41(){
       jRadioButton79.setEnabled(false);
       jRadioButton80.setEnabled(false);
       jRadioButton81.setEnabled(false);
       jRadioButton82.setEnabled(false);
       jRadioButton83.setEnabled(false);
       jRadioButton84.setEnabled(false);
    }
    private void habilitar41(){
       jRadioButton79.setEnabled(true);
       jRadioButton80.setEnabled(true);
       jRadioButton81.setEnabled(true);
       jRadioButton82.setEnabled(true);
       jRadioButton83.setEnabled(true);
       jRadioButton84.setEnabled(true);
    }
    private void habilitar42(){
        //43
        jTextField10.setEnabled(true);
        jRadioButton85.setEnabled(true);
        jRadioButton86.setEnabled(true);
        jRadioButton87.setEnabled(true);
        jRadioButton88.setEnabled(true);
        jRadioButton89.setEnabled(true);
        jRadioButton90.setEnabled(true);
        //44
        jTextField23.setEnabled(true);  
    }
    private void deshabilitar42(){
        //43
        jTextField10.setEnabled(false);
        jRadioButton85.setEnabled(false);
        jRadioButton86.setEnabled(false);
        jRadioButton87.setEnabled(false);
        jRadioButton88.setEnabled(false);
        jRadioButton89.setEnabled(false);
        jRadioButton90.setEnabled(false);
        //44
        jTextField23.setEnabled(false);  
    }
    
    private String preg43(){
        //43
        /*jRadioButton85.setActionCommand("obrera/o o empleada/o");
        jRadioButton86.setActionCommand("trabajadora/or por cuenta propia");
        jRadioButton87.setActionCommand("empleada/or o socia/o");
        jRadioButton88.setActionCommand("trabajador familiar o aprendiz sin remuneración");
        jRadioButton89.setActionCommand("trabajador del hogar");
        jRadioButton90.setActionCommand("cooperativista de produccion/servicios");*/
        
        
        String resp;
        if(jRadioButton85.isSelected()){resp = "obrera/o o empleada/o";}
        else if(jRadioButton86.isSelected()){resp = "trabajadora/or por cuenta propia";}
        else if(jRadioButton87.isSelected()){resp = "empleada/or o socia/o";}
        else if(jRadioButton88.isSelected()){resp = "trabajador familiar o aprendiz sin remuneración";}
        else if(jRadioButton89.isSelected()){resp = "trabajador del hogar";}
        else if(jRadioButton90.isSelected()){resp = "cooperativista de produccion/servicios";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg45(){
       
        /*
        //45
        jRadioButton91.setActionCommand("Soltera/o");
        jRadioButton92.setActionCommand("Casada/o");
        jRadioButton93.setActionCommand("Conviviente o concubina/o");
        jRadioButton94.setActionCommand("Separada/o");
        jRadioButton95.setActionCommand("Divorciada/o");
        jRadioButton96.setActionCommand("Viuda/o");*/
        
        
        
        String resp;
        if(jRadioButton91.isSelected()){resp = "Soltera/o";}
        else if(jRadioButton92.isSelected()){resp = "Casada/o";}
        else if(jRadioButton93.isSelected()){resp = "Conviviente o concubina/o";}
        else if(jRadioButton94.isSelected()){resp = "Separada/o";}
        else if(jRadioButton95.isSelected()){resp = "Divorciada/o";}
        else if(jRadioButton96.isSelected()){resp = "Viuda/o";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg49a(){
        //49
        jRadioButton97.setActionCommand("Si");
        jRadioButton98.setActionCommand("No");
        
        
        String resp;
        if(jRadioButton97.isSelected()){resp = "Si";}
        else if(jRadioButton98.isSelected()){resp = "No";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private String preg49b(){
       /* jRadioButton99.setActionCommand("En un establecimiento de salud");
        jRadioButton100.setActionCommand("En un domicilio");
        jRadioButton101.setActionCommand("En otro lugar");*/
        
        String resp;
        if(jRadioButton99.isSelected()){resp = "En un establecimiento de salud";}
        else if(jRadioButton100.isSelected()){resp = "En un domicilio";}
        else if(jRadioButton101.isSelected()){resp = "En otro lugar";}
        else{
            resp = "";
        }
        return resp;
    }
    
    private void llenarDatos(){
            try {
            String sql = "insert into cap_f (codVivienda, numPersona, nomPersona, parentesco,"
                    + " sexo , edad, nacInscrito , carnet , problemaSaludAcude , indigenaOriginario, primerIdioma, hablaIdiomas,"
                    + " dondeNacio, dondeVive, viviaHace, leerEscribir, acudeColegio, nivelEstudio, nivelAprobado, "
                    + " trabajo, trabajoSemana, duranteSemana, ocupacion, ocupacionTrabajo, produceVende, estadoCivil," 
                    + " hijos, hijoViven, ultHijoNacio, vive, lugarParto )"
                    +" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jTextField27.getText());
            ps.setString(2, jTextField1.getText());
            ps.setString(3, jTextField2.getText());
            ps.setString(4, preg23());
            ps.setString(5, preg24());
            ps.setString(6, jTextField3.getText());
            ps.setString(7, preg26());
            ps.setString(8, preg27());
            ps.setString(9, preg28());
            ps.setString(10, preg29());
            ps.setString(11, preg30());
            ps.setString(12, preg31a());
            ps.setString(13, preg32());
            ps.setString(14, preg33());
            ps.setString(15, preg34());
            ps.setString(16, preg35());
            ps.setString(17, preg36());
            ps.setString(18, preg37());
            ps.setString(19, preg38());
            ps.setString(20, preg39());
            ps.setString(21, preg40());
            ps.setString(22, preg41());
            ps.setString(23, jTextField10.getText());
            ps.setString(24, preg43());
            ps.setString(25, jTextField23.getText());
            ps.setString(26, preg45());
            ps.setString(27, jTextField24.getText());
            ps.setString(28, jTextField25.getText());
            ps.setString(29, jTextField26.getText());
            ps.setString(30, preg49a());
            ps.setString(31, preg49b());
          
          
            
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
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
        buttonGroup4 = new javax.swing.ButtonGroup();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton33 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jLabel73 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jRadioButton40 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jRadioButton43 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jTextField19 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jRadioButton46 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jRadioButton27 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        jRadioButton103 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel29 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jPanel36 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jTextField25 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jLabel72 = new javax.swing.JLabel();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("23.¿Qué relación o parentesco tiene con la jefa o jefe del hogar? ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton1.setText("Jefa o jefe del hogar");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton2.setText("Esposo/a, conviviente o concubino/a");
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton3.setText("Hija o hijo");
        jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton4.setText("Nuera o Yerno");
        jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton5.setText("Nieta o nieto");
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton6.setText("Hermana/o o cuñada/o");
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton7.setText("Padre, madre, suegra/o");
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton8.setText("Otro pariente");
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton9.setText("Trabajador/a del hogar");
        jRadioButton9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton10.setText("Otro no pariente");
        jRadioButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton11.setText("Persona en vivienda colectiva");
        jRadioButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(133, 133, 133))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton11)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("24. ¿Es mujer u hombre?");

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton12.setText("Mujer");
        jRadioButton12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton13.setText("Hombre");
        jRadioButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButton13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton13)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel18))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(jRadioButton12))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("25. ¿Cuántos años cumplidos tiene?");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Para menores de 1 año, anote 0");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)))
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Número de persona:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Nombre de la persona:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("26. ¿Su nacimiento está inscrito en el registro civil o cívico?");

        buttonGroup3.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton16.setText("No");
        jRadioButton16.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup3.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton17.setText("Si");
        jRadioButton17.setFocusCycleRoot(true);
        jRadioButton17.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jLabel9))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton16)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("27. ¿Tiene carnet o cédula de identidad?");

        buttonGroup4.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton18.setText("Si");
        jRadioButton18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup4.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton19.setText("No");
        jRadioButton19.setFocusCycleRoot(true);
        jRadioButton19.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton19)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton18)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButton18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton19)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("28. Cuando tiene problemas de salud, ¿acude a...");

        buttonGroup5.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton20.setText("caja de salud (CNS, COSSMIL, u otras)");
        jRadioButton20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton20.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton21.setText("seguro de salud privado");
        jRadioButton21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton21.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup5.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton22.setText("establecimiento de salud privado");
        jRadioButton22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton22.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup5.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton23.setText("establecimiento de salud publico");
        jRadioButton23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton23.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup5.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton24.setText("medico tradicional");
        jRadioButton24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton24.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup5.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton25.setText("soluciones caceras");
        jRadioButton25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton25.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup5.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton26.setText("la farmacia o se automedica");
        jRadioButton26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton26.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("F 1. PARA TODAS LAS PERSONAS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capítulo F1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup6.add(jRadioButton33);
        jRadioButton33.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton33.setText("Si");
        jRadioButton33.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton33ActionPerformed(evt);
            }
        });

        jLabel22.setText("A cual?");

        buttonGroup6.add(jRadioButton34);
        jRadioButton34.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton34.setText("No pertenece");
        jRadioButton34.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton35);
        jRadioButton35.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton35.setText("No soy boliviana o boliviano");
        jRadioButton35.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setText("<html>29. Como boliviana o boliviano ¿Pertenece a alguna nacion o pueblo indigena<p> originario campesino o afroboliviano?");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton33))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton35)
                                    .addComponent(jRadioButton34))))
                        .addGap(110, 110, 110))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jRadioButton33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton35)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("32. ¿Dónde nació?");

        buttonGroup7.add(jRadioButton38);
        jRadioButton38.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton38.setText("Aqui");
        jRadioButton38.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton38ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioButton39);
        jRadioButton39.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton39.setText("En otro lugar del pais");
        jRadioButton39.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel29.setText("Ciudad o Comunidad");

        jLabel30.setText("Municipio");

        jLabel31.setText("Departamento");

        buttonGroup7.add(jRadioButton40);
        jRadioButton40.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton40.setText("En el exterior");
        jRadioButton40.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });

        jLabel32.setText("Nombre país");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel53.setText("Año de llegada a Bolivia");

        jLabel54.setText("Pase a pregunta 33");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField11))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jRadioButton40)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel32))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel53)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField14)
                                    .addComponent(jTextField28)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField12)
                                    .addComponent(jTextField13)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRadioButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel54)
                        .addGap(32, 32, 32)))
                .addGap(59, 59, 59))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jRadioButton38)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton40)
                    .addComponent(jLabel32)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("30. ¿Habla, cual es el primer idioma que aprendió a hablar en su niñez?");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        buttonGroup21.add(jRadioButton14);
        jRadioButton14.setText("No habla");
        jRadioButton14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jLabel19.setText("Pase a pregunta 32");

        buttonGroup21.add(jRadioButton15);
        jRadioButton15.setText("Si");
        jRadioButton15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton15)
                            .addComponent(jRadioButton14))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14)
                    .addComponent(jLabel19))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("31. ¿Qué idiomas habla?");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("33. ¿Dónde vive habitualmente?");

        buttonGroup8.add(jRadioButton41);
        jRadioButton41.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton41.setText("Aqui");
        jRadioButton41.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioButton42);
        jRadioButton42.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton42.setText("En otro lugar del pais");
        jRadioButton42.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel34.setText("Ciudad o Comunidad");

        jLabel35.setText("Municipio");

        jLabel36.setText("Departamento");

        buttonGroup8.add(jRadioButton43);
        jRadioButton43.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton43.setText("En el exterior");
        jRadioButton43.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });

        jLabel37.setText("Nombre país");

        jLabel55.setText("Pase a pregunta 34");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField16)
                                    .addComponent(jTextField17)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jRadioButton43)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField18))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(59, 59, 59))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jRadioButton41)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton43)
                    .addComponent(jLabel37)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capítulo F2", jPanel2);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("34. ¿Dónde vivía hace 5 años?");

        buttonGroup9.add(jRadioButton44);
        jRadioButton44.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton44.setText("Aqui");
        jRadioButton44.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioButton45);
        jRadioButton45.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton45.setText("En otro lugar del pais");
        jRadioButton45.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jLabel39.setText("Ciudad o Comunidad");

        jLabel40.setText("Municipio");

        jLabel41.setText("Departamento");

        buttonGroup9.add(jRadioButton46);
        jRadioButton46.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton46.setText("En el exterior");
        jRadioButton46.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });

        jLabel42.setText("Nombre país");

        buttonGroup9.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton27.setText("Aún no había nacido");
        jRadioButton27.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jRadioButton27)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField19))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField20)
                                    .addComponent(jTextField21)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jRadioButton46)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton45)
                        .addGap(106, 106, 106)))
                .addGap(59, 59, 59))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jRadioButton44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton46)
                    .addComponent(jLabel42)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("F 2. SÓLO PARA PERSONAS DE 4 AÑOS O MÁS DE EDAD");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("36. Actualmente, ¿asiste a una escuela o colegio?");

        buttonGroup11.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton28.setText("Sí, a una pública");
        jRadioButton28.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });

        buttonGroup11.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton29.setText("Sí, a una privada");
        jRadioButton29.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup11.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton30.setText("Sí, a una de convenio");
        jRadioButton30.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup11.add(jRadioButton31);
        jRadioButton31.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton31.setText("No asiste");
        jRadioButton31.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton29)
                            .addComponent(jRadioButton28)
                            .addComponent(jRadioButton30)
                            .addComponent(jRadioButton31)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("35. ¿Sabe leer y escribir?");

        buttonGroup10.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton32.setText("Si");
        jRadioButton32.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup10.add(jRadioButton36);
        jRadioButton36.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton36.setText("No");
        jRadioButton36.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton36)
                            .addComponent(jRadioButton32))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("37. ¿Cuál fue el nivel y curso más alto de instrucción que aprobó?");

        buttonGroup12.add(jRadioButton47);
        jRadioButton47.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton47.setText("Ninguno");
        jRadioButton47.setFocusCycleRoot(true);
        jRadioButton47.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton48);
        jRadioButton48.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton48.setText("Curso de alfabetización");
        jRadioButton48.setFocusCycleRoot(true);
        jRadioButton48.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton49);
        jRadioButton49.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton49.setText("Inicial (Pre kínder, kínder)");
        jRadioButton49.setFocusCycleRoot(true);
        jRadioButton49.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton50);
        jRadioButton50.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton50.setText("Básico (1 a 5 años)");
        jRadioButton50.setFocusCycleRoot(true);
        jRadioButton50.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton51);
        jRadioButton51.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton51.setText("Intermedio (1 a 3 años)");
        jRadioButton51.setFocusCycleRoot(true);
        jRadioButton51.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton51ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton52);
        jRadioButton52.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton52.setText("Medio (1 a 4 años)");
        jRadioButton52.setFocusCycleRoot(true);
        jRadioButton52.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton52ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton53);
        jRadioButton53.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton53.setText("Primaria (1 a 8 años)");
        jRadioButton53.setFocusCycleRoot(true);
        jRadioButton53.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton54);
        jRadioButton54.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton54.setText("Secundaria (1 a 4 años)");
        jRadioButton54.setFocusCycleRoot(true);
        jRadioButton54.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton54ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton55);
        jRadioButton55.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton55.setText("Primaria (1 a 6 años)");
        jRadioButton55.setFocusCycleRoot(true);
        jRadioButton55.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton55ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton56);
        jRadioButton56.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton56.setText("Secundaria (1 a 6 años)");
        jRadioButton56.setFocusCycleRoot(true);
        jRadioButton56.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton56ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton57);
        jRadioButton57.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton57.setText("Técnico universitario");
        jRadioButton57.setFocusCycleRoot(true);
        jRadioButton57.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton57ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton58);
        jRadioButton58.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton58.setText("Licenciatura");
        jRadioButton58.setFocusCycleRoot(true);
        jRadioButton58.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton58ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton59);
        jRadioButton59.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton59.setText("Maestría");
        jRadioButton59.setFocusCycleRoot(true);
        jRadioButton59.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton59ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton60);
        jRadioButton60.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton60.setText("Doctorado");
        jRadioButton60.setFocusCycleRoot(true);
        jRadioButton60.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton60ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton61);
        jRadioButton61.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton61.setText("Normal Superior");
        jRadioButton61.setFocusCycleRoot(true);
        jRadioButton61.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton61ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton62);
        jRadioButton62.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton62.setText("Militar o Policial");
        jRadioButton62.setFocusCycleRoot(true);
        jRadioButton62.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton62ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton63);
        jRadioButton63.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton63.setText("Técnico de Instituto");
        jRadioButton63.setFocusCycleRoot(true);
        jRadioButton63.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton63ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton64);
        jRadioButton64.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton64.setText("Otro");
        jRadioButton64.setFocusCycleRoot(true);
        jRadioButton64.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton64ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Sistema Antiguo");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Sistema Anterior");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Sistema Actual");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Universitario");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("No universitario");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addComponent(jLabel17)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton50, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton61, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton62, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton63, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton64, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton53, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton54, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton51, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton52, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton49, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton57, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton59, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton60, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(155, 155, 155))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jRadioButton47)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton49)
                        .addGap(17, 17, 17)
                        .addComponent(jRadioButton50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton51))
                    .addComponent(jLabel15))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton52)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton54))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(39, 39, 39)))
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jRadioButton55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton56)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel24))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton60)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel25))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton64)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capítulo F3", jPanel17);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setText("38. Para ingresar a ese nivel, ¿cuál fue el nivel y curso de educación escolar que aprobó?");

        buttonGroup13.add(jRadioButton65);
        jRadioButton65.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton65.setText("Básico (1 a 5 años)");
        jRadioButton65.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton65ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton66);
        jRadioButton66.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton66.setText("Intermedio (1 a 3 años)");
        jRadioButton66.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton66ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton67);
        jRadioButton67.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton67.setText("Medio (1 a 4 años)");
        jRadioButton67.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup13.add(jRadioButton68);
        jRadioButton68.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton68.setText("Primaria (1 a 8 años)");
        jRadioButton68.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton68ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton69);
        jRadioButton69.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton69.setText("Secundaria (1 a 4 años)");
        jRadioButton69.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton69ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton70);
        jRadioButton70.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton70.setText("Primaria (1 a 6 años)");
        jRadioButton70.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup13.add(jRadioButton71);
        jRadioButton71.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton71.setText("Secundaria (1 a 6 años)");
        jRadioButton71.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton71ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel45.setText("Sistema Antiguo");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel46.setText("Sistema Anterior");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel47.setText("Sistema Actual");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton71)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButton66, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton69)
                                .addGroup(jPanel24Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton70)
                                        .addComponent(jRadioButton68)))
                                .addComponent(jRadioButton67, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton65)))
                .addGap(164, 164, 164))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(24, 24, 24)
                .addComponent(jRadioButton65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton66)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton68)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton70)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setText("41. Durante la semana pasada, ...");

        buttonGroup16.add(jRadioButton79);
        jRadioButton79.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton79.setText("Buscó trabajo habiendo trabajado antes");
        jRadioButton79.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton79ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton80);
        jRadioButton80.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton80.setText("Buscó trabajo por primera vez");
        jRadioButton80.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton80ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton81);
        jRadioButton81.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton81.setText("Estuvo estudiando");
        jRadioButton81.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton81ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton82);
        jRadioButton82.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton82.setText("Realizó labores de casa");
        jRadioButton82.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton82ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton83);
        jRadioButton83.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton83.setText("Es jubilado, pensionista o rentista");
        jRadioButton83.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton83ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton84);
        jRadioButton84.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton84.setText("otra");
        jRadioButton84.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton84ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel58.setText("Pase a la pregunra 45");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton80)
                    .addComponent(jRadioButton79)
                    .addComponent(jRadioButton81)
                    .addComponent(jRadioButton82)
                    .addComponent(jRadioButton83)
                    .addComponent(jRadioButton84))
                .addGap(24, 24, 24)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton81)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton84)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("F 3. SÓLO PARA PERSONAS DE 7 AÑOS O MÁS DE EDAD");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("39. Durante la semana pasada ¿trabajó?");

        buttonGroup14.add(jRadioButton72);
        jRadioButton72.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton72.setText("Si");
        jRadioButton72.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton72ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton73);
        jRadioButton73.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton73.setText("No");
        jRadioButton73.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton73ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel49.setText("Pase a la pregunta 42");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton73)
                            .addComponent(jRadioButton72))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel49)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton72)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton73)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setText("40. Durante la semana pasada,...");

        buttonGroup15.add(jRadioButton37);
        jRadioButton37.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton37.setText("Tenia trabajo, pero no trabajó por que estuvo de vacacion, enfermo o por falta de materiales");
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton74);
        jRadioButton74.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton74.setText("Atendió o ayudó en los cultivos agrícolas o en la crianza de animales");
        jRadioButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton74ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton75);
        jRadioButton75.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton75.setText("Atendió o ayudó en algún negocio propio o familiar");
        jRadioButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton75ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton102);
        jRadioButton102.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton102.setText("Realizó alguna actividad por ingreso");
        jRadioButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton102ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton103);
        jRadioButton103.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton103.setText("No trabajó");
        jRadioButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton103ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton74)
                            .addComponent(jRadioButton75)
                            .addComponent(jRadioButton102)
                            .addComponent(jSeparator1))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton103)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton103)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setText("42. ¿Cuál fue su ocupación, trabajo u oficio principal durante la semana pasada?");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("43. En esa ocupación, ¿usted trabajo como...");

        buttonGroup17.add(jRadioButton85);
        jRadioButton85.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton85.setText("obrera/o o empleada/o");
        jRadioButton85.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton85ActionPerformed(evt);
            }
        });

        buttonGroup17.add(jRadioButton86);
        jRadioButton86.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton86.setText("trabajadora/or por cuenta propia");
        jRadioButton86.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup17.add(jRadioButton87);
        jRadioButton87.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton87.setText("empleada/or o socia/o");
        jRadioButton87.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup17.add(jRadioButton88);
        jRadioButton88.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton88.setText("trabajador familiar o aprendiz sin remuneración");
        jRadioButton88.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup17.add(jRadioButton89);
        jRadioButton89.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton89.setText("trabajador del hogar");
        jRadioButton89.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup17.add(jRadioButton90);
        jRadioButton90.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton90.setText("cooperativista de produccion/servicios");
        jRadioButton90.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton90)
                            .addComponent(jRadioButton89)
                            .addComponent(jRadioButton88)
                            .addComponent(jRadioButton87)
                            .addComponent(jRadioButton86)
                            .addComponent(jRadioButton85))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton90)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setText("<html>44. ¿Qué produce, vende o a que actividad económica se dedica principalmente <p>el lugar o establecimiento donde trabaja?");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capítulo F4", jPanel23);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setText("F 4. SÓLO PARA PERSONAS DE 15 AÑOS O MÁS DE EDAD");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel62.setText("F 5. SÓLO PARA MUJERES DE 15 AÑOS O MÁS DE EDAD");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setText("45. ¿Cuál es su estado civil o conyugal?");

        buttonGroup18.add(jRadioButton91);
        jRadioButton91.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton91.setText("Soltera/o");
        jRadioButton91.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup18.add(jRadioButton92);
        jRadioButton92.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton92.setText("Casada/o");
        jRadioButton92.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton92ActionPerformed(evt);
            }
        });

        buttonGroup18.add(jRadioButton93);
        jRadioButton93.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton93.setText("Conviviente o concubina/o");
        jRadioButton93.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup18.add(jRadioButton94);
        jRadioButton94.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton94.setText("Separada/o");
        jRadioButton94.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup18.add(jRadioButton95);
        jRadioButton95.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton95.setText("Divorciada/o");
        jRadioButton95.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup18.add(jRadioButton96);
        jRadioButton96.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton96.setText("Viuda/o");
        jRadioButton96.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel63))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton91)
                            .addComponent(jRadioButton92)
                            .addComponent(jRadioButton93)
                            .addComponent(jRadioButton94)
                            .addComponent(jRadioButton95)
                            .addComponent(jRadioButton96))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton96)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setText("<html>46. En total, ¿cuántas hijas e hijos nacidos vivos ha tenido usted, incluyendo fallecidos <p> fallecidos o ausentes?");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel65.setText("Si no tuvo, anote 0 y pase a la siguiente persona");

        jLabel67.setText("número");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel65)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel67)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65)
                        .addComponent(jLabel67))
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel66.setText("número");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setText("47. De sus hijas e hijos nacidos vivos, ¿cuántos viven actualmente?");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel68))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel66)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setText("48. ¿En qué mes y año nació su última hija o hijo nacido vivo?");

        jLabel71.setText("Mes/Año");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69)
                .addGap(27, 27, 27)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setText("49. a) Ésta última hija o hijo ¿vive actualmente?");

        buttonGroup19.add(jRadioButton97);
        jRadioButton97.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton97.setText("Si");
        jRadioButton97.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup19.add(jRadioButton98);
        jRadioButton98.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton98.setText("No");
        jRadioButton98.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setText("b) ¿Dónde tuvo lugar su último parto?");

        buttonGroup20.add(jRadioButton99);
        jRadioButton99.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton99.setText("En un establecimiento de salud");
        jRadioButton99.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jRadioButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton99ActionPerformed(evt);
            }
        });

        buttonGroup20.add(jRadioButton100);
        jRadioButton100.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton100.setText("En un domicilio");
        jRadioButton100.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        buttonGroup20.add(jRadioButton101);
        jRadioButton101.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButton101.setText("En otro lugar");
        jRadioButton101.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton98)
                        .addComponent(jRadioButton97)
                        .addComponent(jLabel70))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton100)
                            .addComponent(jRadioButton99)
                            .addComponent(jRadioButton101)))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel72)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton98)
                .addGap(18, 18, 18)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton101)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39))))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(28, 28, 28)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capítulo F5", jPanel32);

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 153));
        jLabel74.setText("CAPÍTULO F. PRINCIPALES CARACTERÍSTICAS DE LA PERSONA");

        jLabel51.setText("Código Vivienda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel51)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        jTextField4.setEnabled(false);
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        jTextField4.setEnabled(false);
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jRadioButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton38ActionPerformed
        jTextField11.setEnabled(false);
        jTextField12.setEnabled(false);
        jTextField13.setEnabled(false);
        jTextField14.setEnabled(false);
        jTextField28.setEnabled(false);
        //33
       /* jTextField15.setEnabled(true);
        jTextField16.setEnabled(true);
        jTextField17.setEnabled(true);
        jTextField18.setEnabled(true);
        jRadioButton41.setEnabled(true);
        jRadioButton42.setEnabled(true);
        jRadioButton43.setEnabled(true);*/
        
    }//GEN-LAST:event_jRadioButton38ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        jTextField11.setEnabled(true);
        jTextField12.setEnabled(true);
        jTextField13.setEnabled(true);
        jTextField14.setEnabled(false);
        jTextField28.setEnabled(false);
        
       //33
        /*jTextField15.setEnabled(false);
        jTextField16.setEnabled(false);
        jTextField17.setEnabled(false);
        jTextField18.setEnabled(false);
        
        jRadioButton41.setEnabled(false);
        jRadioButton42.setEnabled(false);
        jRadioButton43.setEnabled(false);*/

    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        jTextField11.setEnabled(false);
        jTextField12.setEnabled(false);
        jTextField13.setEnabled(false);
        jTextField14.setEnabled(true);
        jTextField28.setEnabled(true);
        
        //33
       /* jTextField15.setEnabled(false);
        jTextField16.setEnabled(false);
        jTextField17.setEnabled(false);
        jTextField18.setEnabled(false);
        
        jRadioButton41.setEnabled(false);
        jRadioButton42.setEnabled(false);
        jRadioButton43.setEnabled(false);*/
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
         jTextField15.setEnabled(false);
        jTextField16.setEnabled(false);
        jTextField17.setEnabled(false);
        jTextField18.setEnabled(false);
        
        //34
        jTextField19.setEnabled(true);
        jTextField20.setEnabled(true);
        jTextField21.setEnabled(true);
        jTextField22.setEnabled(true);
        jRadioButton44.setEnabled(true);
        jRadioButton45.setEnabled(true);
        jRadioButton46.setEnabled(true);
        jRadioButton27.setEnabled(true);
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        jTextField15.setEnabled(true);
        jTextField16.setEnabled(true);
        jTextField17.setEnabled(true);
        jTextField18.setEnabled(false);
        
        //34
       /* jTextField19.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
        jRadioButton44.setEnabled(false);
        jRadioButton45.setEnabled(false);
        jRadioButton46.setEnabled(false);
        jRadioButton27.setEnabled(false);*/
    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        jTextField15.setEnabled(false);
        jTextField16.setEnabled(false);
        jTextField17.setEnabled(false);
        jTextField18.setEnabled(true);
        
        //34
        /*jTextField19.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
        jRadioButton44.setEnabled(false);
        jRadioButton45.setEnabled(false);
        jRadioButton46.setEnabled(false);
        jRadioButton27.setEnabled(false);*/
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        jTextField19.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        jTextField19.setEnabled(true);
        jTextField20.setEnabled(true);
        jTextField21.setEnabled(true);
        jTextField22.setEnabled(false);
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        jTextField19.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(true);
    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton48ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton51ActionPerformed

    private void jRadioButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton52ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jRadioButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton54ActionPerformed

    private void jRadioButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton55ActionPerformed

    private void jRadioButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton56ActionPerformed

    private void jRadioButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton57ActionPerformed

    private void jRadioButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton58ActionPerformed

    private void jRadioButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton59ActionPerformed

    private void jRadioButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton60ActionPerformed

    private void jRadioButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton61ActionPerformed

    private void jRadioButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton62ActionPerformed

    private void jRadioButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton63ActionPerformed

    private void jRadioButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton64ActionPerformed

    private void jRadioButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton68ActionPerformed

    private void jRadioButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton69ActionPerformed

    private void jRadioButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton71ActionPerformed

    private void jRadioButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton79ActionPerformed
        deshabilitar42();
    }//GEN-LAST:event_jRadioButton79ActionPerformed

    private void jRadioButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton85ActionPerformed

    private void jRadioButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton92ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
       int r = JOptionPane.showOptionDialog(this, "Los datos que guardara estan correctos?", "GUARDAR DATOS",JOptionPane.YES_NO_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(r==0){
            llenarDatos();
            this.setVisible(false);
            new CapF().setVisible(true);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton74ActionPerformed
        deshabilitar41();
        habilitar42();
    }//GEN-LAST:event_jRadioButton74ActionPerformed

    private void jRadioButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton75ActionPerformed
        deshabilitar41();
        habilitar42();
    }//GEN-LAST:event_jRadioButton75ActionPerformed

    private void jRadioButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton102ActionPerformed
        deshabilitar41();
        habilitar42();
    }//GEN-LAST:event_jRadioButton102ActionPerformed

    private void jRadioButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton103ActionPerformed
       habilitar41();
    }//GEN-LAST:event_jRadioButton103ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.dispose();
        new CapF().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        deshabilitar41();
        habilitar42();
    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
            jTextField5.setEnabled(true);
        jTextField6.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextField9.setEnabled(true);
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
            jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
            jTextField9.setEnabled(false);
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
        jTextField4.setEnabled(true);
    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        jTextField19.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton72ActionPerformed
       jRadioButton37.setEnabled(false);
       jRadioButton74.setEnabled(false);
       jRadioButton75.setEnabled(false);
       jRadioButton102.setEnabled(false);
       jRadioButton103.setEnabled(false);
       deshabilitar41();
       
       habilitar42();
       
    }//GEN-LAST:event_jRadioButton72ActionPerformed

    private void jRadioButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton84ActionPerformed
        deshabilitar42();
    }//GEN-LAST:event_jRadioButton84ActionPerformed

    private void jRadioButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton73ActionPerformed
        jRadioButton37.setEnabled(true);
       jRadioButton74.setEnabled(true);
       jRadioButton75.setEnabled(true);
       jRadioButton102.setEnabled(true);
       jRadioButton103.setEnabled(true);
       habilitar41();
    }//GEN-LAST:event_jRadioButton73ActionPerformed

    private void jRadioButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton80ActionPerformed
        deshabilitar42();
    }//GEN-LAST:event_jRadioButton80ActionPerformed

    private void jRadioButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton81ActionPerformed
        deshabilitar42();
    }//GEN-LAST:event_jRadioButton81ActionPerformed

    private void jRadioButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton82ActionPerformed
        deshabilitar42();
    }//GEN-LAST:event_jRadioButton82ActionPerformed

    private void jRadioButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton83ActionPerformed
        deshabilitar42();
    }//GEN-LAST:event_jRadioButton83ActionPerformed

    private void jRadioButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton99ActionPerformed

    private void jRadioButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton65ActionPerformed

    private void jRadioButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton66ActionPerformed

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
            java.util.logging.Logger.getLogger(CapF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapF().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton11;
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
    private javax.swing.JRadioButton jRadioButton49;
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
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

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


}
