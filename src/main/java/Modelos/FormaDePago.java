/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class FormaDePago {
    
    private int id_forma_de_pago;
    private String tipo;

    public FormaDePago(int id_forma_de_pago, String tipo) {
        this.id_forma_de_pago = id_forma_de_pago;
        this.tipo = tipo;
    }

    public int getId_forma_de_pago() {
        return id_forma_de_pago;
    }

    public void setId_forma_de_pago(int id_forma_de_pago) {
        this.id_forma_de_pago = id_forma_de_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
