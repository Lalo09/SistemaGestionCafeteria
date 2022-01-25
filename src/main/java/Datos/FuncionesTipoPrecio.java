/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Modelos.TipoDePrecio;
import static Configuraciones.Config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FuncionesTipoPrecio {
    
    public FuncionesTipoPrecio(){
        LoadDriver();
    }
    
    public boolean GuardarTipoPrecio(TipoDePrecio tipoDePrecio){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO cafeteria.tipo_precio (tipo, paga) "
                   +"values (?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,tipoDePrecio.getTipo());
            st.setInt(2,tipoDePrecio.getPaga());
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
    
    public boolean ActualizarTipoPrecio(TipoDePrecio tipoDePrecio){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE tipo_precio SET tipo=?, paga=? "
                   +"WHERE id_tipo_precio=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,tipoDePrecio.getTipo());
            st.setInt(2,tipoDePrecio.getPaga());
            st.setInt(3,tipoDePrecio.getId_tipo_de_precio());
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
    
    public boolean EliminarTipoPrecio(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM tipo_precio "
                   +"WHERE id_tipo_precio=?";
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
    
    public ArrayList<TipoDePrecio> MostrarTipoPrecio(){
       ArrayList<TipoDePrecio> lista = new ArrayList<TipoDePrecio>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_tipo_precio, tipo, paga FROM cafeteria.tipo_precio order by id_tipo_precio desc");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_tipo_precio=rs.getInt("id_tipo_precio");
               String tipo=rs.getString("tipo");
               int paga=rs.getInt("paga");
               
               TipoDePrecio tipoPrecio = new TipoDePrecio(id_tipo_precio,tipo,paga);
               lista.add(tipoPrecio);
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
