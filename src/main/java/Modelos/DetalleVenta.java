/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class DetalleVenta {
    
    private int id_detalle_venta;
    private int id_venta;
    private int id_producto;
    private int cantidad;
    private double precio;

    public DetalleVenta(int id_detalle_venta, int id_venta, int id_producto, int cantidad, double precio) {
        this.id_detalle_venta = id_detalle_venta;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "id_detalle_venta=" + id_detalle_venta + ", id_venta=" + id_venta + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
}
