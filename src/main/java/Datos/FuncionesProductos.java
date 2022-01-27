/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Modelos.Usuario;
import Modelos.Producto;
import static Configuraciones.Config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FuncionesProductos {
    
    public FuncionesProductos(){
        LoadDriver();
    }
    
    public boolean GuardarProducto(Producto producto){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO producto (descripcion, clave, precio, control_inventario, id_tipo_comida, cantidad) "
                   +"VALUES(?,?,?,?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,producto.getDescripcion());
            st.setString(2,producto.getClave());
            st.setDouble(3,producto.getPrecio());
            st.setInt(4,producto.getControl_inventario());
            st.setInt(5,producto.getId_tipo_comida());
            st.setInt(6,producto.getCantidad());
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
    
    public boolean ActualizarProducto(Producto producto){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE producto SET descripcion=?, clave=?, precio=?, control_inventario=?, id_tipo_comida=?, cantidad=? "
                   +"WHERE id_producto=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,producto.getDescripcion());
            st.setString(2,producto.getClave());
            st.setDouble(3,producto.getPrecio());
            st.setInt(4,producto.getControl_inventario());
            st.setInt(5,producto.getId_tipo_comida());
            st.setInt(6,producto.getCantidad());
            st.setInt(7,producto.getId_producto());
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
    
    public boolean EliminarProducto(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM producto "
                   +"WHERE id_producto=?";
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
    
    public ArrayList<Producto> MostrarProducto(){
       ArrayList<Producto> lista = new ArrayList<Producto>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_producto, descripcion, clave, precio, control_inventario, id_tipo_comida, cantidad FROM producto order by id_producto");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_producto=rs.getInt("id_producto");
               String descripcion=rs.getString("descripcion");
               String clave=rs.getString("clave");
               double precio=rs.getDouble("precio");
               int control_inventario=rs.getInt("control_inventario");
               int id_tipo_comida=rs.getInt("id_tipo_comida");
               int cantidad=rs.getInt("cantidad");
               
               Producto producto = new Producto(id_producto, descripcion, clave, precio, control_inventario, id_tipo_comida, cantidad);
               lista.add(producto);
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
    
    public ArrayList<Producto> BuscarProducto(String busqueda){
       ArrayList<Producto> lista = new ArrayList<Producto>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_producto, descripcion, clave, precio, control_inventario, id_tipo_comida, cantidad FROM producto where descripcion LIKE '%"+busqueda+"%'");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_producto=rs.getInt("id_producto");
               String descripcion=rs.getString("descripcion");
               String clave=rs.getString("clave");
               double precio=rs.getDouble("precio");
               int control_inventario=rs.getInt("control_inventario");
               int id_tipo_comida=rs.getInt("id_tipo_comida");
               int cantidad=rs.getInt("cantidad");
               
               Producto producto = new Producto(id_producto, descripcion, clave, precio, control_inventario, id_tipo_comida, cantidad);
               lista.add(producto);
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