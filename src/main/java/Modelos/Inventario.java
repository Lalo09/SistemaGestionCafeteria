/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class Inventario {
    private int id_inventario;
    private int id_producto;
    private int cantidad;
    private int minimo;
    private String unidad;

    public Inventario(int id_inventario, int id_producto, int cantidad, int minimo, String unidad) {
        this.id_inventario = id_inventario;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.minimo = minimo;
        this.unidad = unidad;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
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

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id_inventario=" + id_inventario + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", minimo=" + minimo + ", unidad=" + unidad + '}';
    }
}
