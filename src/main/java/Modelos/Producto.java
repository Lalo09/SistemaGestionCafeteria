/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class Producto {
    private int id_producto;
    private String descripcion;
    private String clave;
    private double precio;
    private int control_inventario;
    private int id_tipo_comida;
    private int cantidad;

    public Producto(int id_producto, String descripcion, String clave, double precio, int control_inventario, int id_tipo_comida, int cantidad) {
        this.id_producto = id_producto;
        this.descripcion = descripcion;
        this.clave = clave;
        this.precio = precio;
        this.control_inventario = control_inventario;
        this.id_tipo_comida = id_tipo_comida;
        this.cantidad = cantidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getControl_inventario() {
        return control_inventario;
    }

    public void setControl_inventario(char control_inventario) {
        this.control_inventario = control_inventario;
    }

    public int getId_tipo_comida() {
        return id_tipo_comida;
    }

    public void setId_tipo_comida(int id_tipo_comida) {
        this.id_tipo_comida = id_tipo_comida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", descripcion=" + descripcion + ", clave=" + clave + ", precio=" + precio + ", control_inventario=" + control_inventario + ", id_tipo_comida=" + id_tipo_comida + ", cantidad=" + cantidad + '}';
    }
}
