/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuraciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class Config {
    
    public static final String NOMBRE = "Cafeteria";
    
    //Variables para el manejo de consulta de base de datos
    public static Connection conn = null;
    public static PreparedStatement st = null;
    public static Statement sentencia;
    public static ResultSet rs;
    
    //variables para acceder al servidor de base de datos
    public static final String ruta = "jdbc:mysql://localhost:3306/cafeteria";
    public static final String usuario = "root";
    public static final String pass = "";
    
    public static void LoadDriver(){
        try { 
           Class.forName("com.mysql.jdbc.Driver");
           //conn = (Connection) DriverManager.getConnection(ruta,usuario,pass);
           
       } catch (ClassNotFoundException ex) {
          ex.printStackTrace();
       }
    }
    
    public Connection getConexion(){
        try { 
           Class.forName("com.mysql.jdbc.Driver");
           conn = (Connection) DriverManager.getConnection(ruta,usuario,pass);
           
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
       } catch (SQLException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
}
