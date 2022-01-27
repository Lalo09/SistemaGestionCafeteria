/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Modelos.Empleado;
import static Configuraciones.Config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FuncionesEmpleados {
    
    public FuncionesEmpleados(){
        LoadDriver();
    }
    
    public boolean GuardarEmpleado(Empleado empleado){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO empleado (codigo_empleado, nombres, apellidos) "
                   +"VALUES(?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,empleado.getCodigo_empleado());
            st.setString(2,empleado.getNombres());
            st.setString(3,empleado.getApellidos());
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
    
    public boolean ActualizarEmpleado(Empleado empleado){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE empleado SET codigo_empleado=?, nombres=?, apellidos=? "
                   +"WHERE id_empleado=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,empleado.getCodigo_empleado());
            st.setString(2,empleado.getNombres());
            st.setString(3,empleado.getApellidos());
            st.setInt(4,empleado.getId_empleado());
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
    
    public boolean EliminarEmpleado(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM empleado "
                   +"WHERE id_empleado=?";
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
    
    public ArrayList<Empleado> MostrarEmpleado(){
       ArrayList<Empleado> lista = new ArrayList<Empleado>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_empleado, codigo_empleado, nombres, apellidos FROM empleado order by id_empleado");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_empleado=rs.getInt("id_empleado");
               String codigo=rs.getString("codigo_empleado");
               String nombres=rs.getString("nombres");
               String apellidos=rs.getString("apellidos");
               
               Empleado empleado = new Empleado(id_empleado, codigo, nombres, apellidos);
               lista.add(empleado);
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
    
    public ArrayList<Empleado> BuscarEmpleado(String buscar){
       ArrayList<Empleado> lista = new ArrayList<Empleado>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_empleado, codigo_empleado, nombres, apellidos FROM empleado WHERE nombres like '%"+buscar+"%' or apellidos like '%"+buscar+"%' or codigo_empleado LIKE '%"+buscar+"%'");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_empleado=rs.getInt("id_empleado");
               String codigo=rs.getString("codigo_empleado");
               String nombres=rs.getString("nombres");
               String apellidos=rs.getString("apellidos");
               
               Empleado empleado = new Empleado(id_empleado, codigo, nombres, apellidos);
               lista.add(empleado);
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
    
    public ArrayList<Empleado> BuscarEmpleadoPorCodigo(String buscar){
       ArrayList<Empleado> lista = new ArrayList<Empleado>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_empleado, codigo_empleado, nombres, apellidos FROM empleado WHERE codigo_empleado LIKE '%"+buscar+"%'");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_empleado=rs.getInt("id_empleado");
               String codigo=rs.getString("codigo_empleado");
               String nombres=rs.getString("nombres");
               String apellidos=rs.getString("apellidos");
               
               Empleado empleado = new Empleado(id_empleado, codigo, nombres, apellidos);
               lista.add(empleado);
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
