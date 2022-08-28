package co.edu.cue.jugueteria.model;

import javax.swing.*;

public class Juguete {
    private String nombre;
    private double precio;
    private int inventario;

    private String codeProveedor;

    public String getCodeProveedor() {
        return codeProveedor;
    }

    public void setCodeProveedor(String codeProveedor) {
        this.codeProveedor = codeProveedor;
    }

    public Juguete(String nombre, double precio, int inventario, String codeProveedor){
        this.nombre=nombre;
        this.precio=precio;
        this.inventario=inventario;
        this.codeProveedor=codeProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
}
