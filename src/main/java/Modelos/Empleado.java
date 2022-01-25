/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class Empleado {

    public Empleado(int id_empleado, String codigo_empleado, String nombres, String apellidos) {
        this.id_empleado = id_empleado;
        this.codigo_empleado = codigo_empleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    private int id_empleado;
    private String codigo_empleado;
    private String nombres;
    private String apellidos;

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", codigo_empleado=" + codigo_empleado + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
   
}
