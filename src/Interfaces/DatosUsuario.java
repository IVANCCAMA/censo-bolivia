/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import dba.Mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DatosUsuario {
    
    Connection conn;
    Statement sent;
    
    public static String usuario;
    public static String nombre;
    public static String zona;
    public static String codVivienda;
    
    public DatosUsuario(String usr){
        conn = Mysql.getConnection();
        usuario = usr;
        llenarDatos();
    }
    
    private void llenarDatos(){
        setNombre();
        setZona();
        setCodV();
    }
    
    public void setNombre(){
        try {
                String sql = "select nombreUsr from censo.usuario where codUsr = " +  usuario;
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                nombre = rs.getString("nombreUsr");

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public void setZona(){
        try {
                String sql = "select ZonaCensal from censo.usuario where codUsr = " +  usuario;
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                zona = rs.getString("ZonaCensal");

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    public String getUsuario(){
        return usuario;
    }
    public String getNombre(){
        return nombre;
    }
    public String getZona(){
        return zona;
    }
    
    public void setCodV(){
        try {
                String sql = "select codVivienda from censo.usuario where codUsr = " +  usuario;
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next(); // SI O SI PONER PARA LO RESULTADOS
                codVivienda = rs.getString("codVivienda");

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
