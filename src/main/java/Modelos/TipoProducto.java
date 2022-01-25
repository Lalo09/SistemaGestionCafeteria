/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class TipoProducto {
    
    private int id;
    private String descripcion;
    private String Horario;
    
    public TipoProducto(int id, String descripcion, String Horario) {
        this.id = id;
        this.descripcion = descripcion;
        this.Horario = Horario;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    @Override
    public String toString() {
        return "TipoProducto{" + "descripcion=" + descripcion + '}';
    }
    
}
