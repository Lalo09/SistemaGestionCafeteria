/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Modelos.Empleado;
import Modelos.Usuario;
import static Configuraciones.Config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FuncionesUsuario {
    
    public FuncionesUsuario(){
        LoadDriver();
    }
    
    public boolean GuardarUsuario(Usuario user){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO usuario (nombres, apellidos, email, password, tipo_usuario) "
                   +"VALUES(?,?,?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,user.getNombres());
            st.setString(2,user.getApellidos());
            st.setString(3,user.getClave());
            st.setString(4,user.getPassword());
            st.setString(5,user.getTipo_usuario());
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error");
            return false;
       }
        finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    } 
    
    public boolean ActualizarUsuario(Usuario user){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE usuario SET nombres=?, apellidos=?, email=?, tipo_usuario=? "
                   +"WHERE id_usuario=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,user.getNombres());
            st.setString(2,user.getApellidos());
            st.setString(3,user.getClave());
            st.setString(4,user.getTipo_usuario());
            st.setInt(5,user.getId_usuario());
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error:"+e);
            return false;
       }
        finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    } 
    
    public boolean EliminarUsuario(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM usuario "
                   +"WHERE id_usuario=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setInt(1,id);
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error");
            return false;
       }
        finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    }    
    
    public ArrayList<Usuario> MostrarUsuario(){
       ArrayList<Usuario> lista = new ArrayList<Usuario>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_usuario, nombres, apellidos, email, password, tipo_usuario FROM usuario order by id_usuario DESC");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_usuario=rs.getInt("id_usuario");
               String nombres=rs.getString("nombres");
               String apellidos=rs.getString("apellidos");
               String email=rs.getString("email");
               String tipo_usuario=rs.getString("tipo_usuario");
               
               Usuario user = new Usuario(id_usuario, nombres, apellidos, email, "", tipo_usuario);
               lista.add(user);
           }
           conn.close();
       } catch (Exception e) {
           System.out.println(e.toString());
       }
       finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
       return lista;
   }
    
}