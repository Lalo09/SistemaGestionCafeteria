/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduardo
 */
public class TipoDePrecio {
    
    private int id_tipo_de_precio;
    private String tipo;
    private int paga;

    public TipoDePrecio(int id_tipo_de_precio, String tipo, int paga) {
        this.id_tipo_de_precio = id_tipo_de_precio;
        this.tipo = tipo;
        this.paga = paga;
    }

    public int getId_tipo_de_precio() {
        return id_tipo_de_precio;
    }

    public void setId_tipo_de_precio(int id_tipo_de_precio) {
        this.id_tipo_de_precio = id_tipo_de_precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPaga() {
        return paga;
    }

    public void setPaga(int paga) {
        this.paga = paga;
    }
    
    @Override
    public String toString() {
        return tipo;
    }
}
