/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Modelos.TipoDePrecio;
import Modelos.TipoProducto;
import static Configuraciones.Config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FuncionesTipoProducto {
    
    public FuncionesTipoProducto(){
        LoadDriver();
    }
    
    public boolean GuardarTipoProducto(TipoProducto tipoProducto){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO tipo_producto (descripcion, horario) "
                   +"VALUES(?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,tipoProducto.getDescripcion());
            st.setString(2,tipoProducto.getHorario());
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
    
    public boolean ActualizarTipoProducto(TipoProducto tipoProducto){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE tipo_producto SET descripcion=?, horario=? "
                   +"WHERE id_tipo_comida=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,tipoProducto.getDescripcion());
            st.setString(2,tipoProducto.getHorario());
            st.setInt(3,tipoProducto.getId());
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
    
    public boolean EliminarTipoProducto(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM tipo_producto "
                   +"WHERE id_tipo_comida=?";
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
    
    public ArrayList<TipoProducto> MostrarTipoProducto(){
       ArrayList<TipoProducto> lista = new ArrayList<TipoProducto>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_tipo_comida, descripcion, horario FROM tipo_producto order by id_tipo_comida DESC ");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_tipo_comida=rs.getInt("id_tipo_comida");
               String descripcion=rs.getString("descripcion");
               String horario=rs.getString("horario");
               
               TipoProducto tipoProducto = new TipoProducto(id_tipo_comida, descripcion, horario);
               lista.add(tipoProducto);
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
    
    public TipoProducto ObtenerObjetoProducto(int id){
       TipoProducto tipoProducto= new TipoProducto(0,"","");
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_tipo_comida, descripcion, horario FROM tipo_producto where id_tipo_comida ="+id);
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_tipo_comida=rs.getInt("id_tipo_comida");
               String descripcion=rs.getString("descripcion");
               String horario=rs.getString("horario");
               
               tipoProducto.setId(id_tipo_comida);
               tipoProducto.setDescripcion(descripcion);
               tipoProducto.setHorario(horario);
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
       return tipoProducto;
   }
}
