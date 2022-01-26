/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Modelos.TipoProducto;
import Modelos.FormaDePago;
import static Configuraciones.Config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FuncionesFormaDePago {
    
    public FuncionesFormaDePago(){
        LoadDriver();
    }
    
    public boolean GuardarFormaDePago(FormaDePago formaDePago){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO forma_pago (tipo) "
                   +"VALUES(?)"; 
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,formaDePago.getTipo());
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
    
    public boolean ActualizarFormaDePago(FormaDePago formaDePago){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE forma_pago SET tipo=? "
                   +"WHERE id_forma_pago=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,formaDePago.getTipo());
            st.setInt(2,formaDePago.getId_forma_de_pago());
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
    
    public boolean EliminarFormaDePago(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM forma_pago "
                   +"WHERE id_forma_pago=?";
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
    
    public ArrayList<FormaDePago> MostrarFormaDePago(){
       ArrayList<FormaDePago> lista = new ArrayList<FormaDePago>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("SELECT id_forma_pago, tipo FROM forma_pago order by id_forma_pago DESC ;");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id=rs.getInt("id_forma_pago");
               String descripcion=rs.getString("tipo");
               
               FormaDePago formaDePago = new FormaDePago(id , descripcion);
               lista.add(formaDePago);
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
