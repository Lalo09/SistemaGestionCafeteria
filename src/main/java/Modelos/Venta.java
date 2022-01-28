/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class Venta {
    
    private int id_venta;
    private String fecha;
    private String hora;
    private int id_empleado;
    private double total;
    private int id_tipo_precio;
    private int id_forma_de_pago;
    private int id_usuario;

    public Venta(int id_venta, String fecha, String hora, double total, int id_tipo_precio, int id_forma_de_pago, int id_usuario) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.id_tipo_precio = id_tipo_precio;
        this.id_forma_de_pago = id_forma_de_pago;
        this.id_usuario = id_usuario;
    }

    public Venta(int id_venta, String fecha, String hora, int id_empleado, double total, int id_tipo_precio, int id_forma_de_pago, int id_usuario) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.hora = hora;
        this.id_empleado = id_empleado;
        this.total = total;
        this.id_tipo_precio = id_tipo_precio;
        this.id_forma_de_pago = id_forma_de_pago;
        this.id_usuario = id_usuario;
    }
    
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_tipo_precio() {
        return id_tipo_precio;
    }

    public void setId_tipo_precio(int id_tipo_precio) {
        this.id_tipo_precio = id_tipo_precio;
    }

    public int getId_forma_de_pago() {
        return id_forma_de_pago;
    }

    public void setId_forma_de_pago(int id_forma_de_pago) {
        this.id_forma_de_pago = id_forma_de_pago;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fecha=" + fecha + ", hora=" + hora + ", id_empleado=" + id_empleado + ", total=" + total + ", id_tipo_precio=" + id_tipo_precio + ", id_forma_de_pago=" + id_forma_de_pago + ", id_usuario=" + id_usuario + '}';
    }    
}
