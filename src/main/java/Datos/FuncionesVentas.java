/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import static Configuraciones.Config.conn;
import static Configuraciones.Config.pass;
import static Configuraciones.Config.rs;
import static Configuraciones.Config.ruta;
import static Configuraciones.Config.st;
import static Configuraciones.Config.usuario;
import java.sql.DriverManager;
import Modelos.Venta;
import Modelos.DetalleVenta;
import java.sql.SQLException;

/**
 *
 * @author eduardo
 */
public class FuncionesVentas {
     public boolean GuardarVenta(Venta venta){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO venta (fecha, hora, id_empleado, total, id_tipo_precio, id_forma_pago, id_usuario) "
                   +"VALUES(?,?,?,?,?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,venta.getFecha());
            st.setString(2,venta.getHora());
            st.setInt(3,venta.getId_empleado());
            st.setDouble(4,venta.getTotal());
            st.setInt(5,venta.getId_tipo_precio());
            st.setInt(6,venta.getId_forma_de_pago());
            st.setInt(7,venta.getId_usuario());
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error"+e);
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
     
     public boolean GuardarVentaExterna(Venta venta){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO venta (fecha, hora, total, id_tipo_precio, id_forma_pago, id_usuario) "
                   +"VALUES(?,?,?,?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,venta.getFecha());
            st.setString(2,venta.getHora());
            st.setDouble(3,venta.getTotal());
            st.setInt(4,venta.getId_tipo_precio());
            st.setInt(5,venta.getId_forma_de_pago());
            st.setInt(6,venta.getId_usuario());
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error"+e);
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
     
     public boolean EliminarVenta(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM venta "
                   +"WHERE id_venta=?";
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

     public boolean GuardarDetalleVenta(DetalleVenta detalleVenta){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO detalle_venta (id_venta, id_producto, cantidad, precio) "
                   +"VALUES(?,?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setInt(1,detalleVenta.getId_venta());
            st.setInt(2,detalleVenta.getId_producto());
            st.setInt(3,detalleVenta.getCantidad());
            st.setDouble(4,detalleVenta.getPrecio());
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
     
     public boolean EliminarDetalleVenta(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM detalle_venta "
                   +"WHERE id_venta=?";
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
     
     public int GetIdVenta(){
       int id_venta= 0;
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select id_venta from venta order by id_venta DESC limit 1");
           rs = st.executeQuery();
           while (rs.next()) {               
               id_venta=rs.getInt("id_venta");
               
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
       return id_venta;
   }
}
