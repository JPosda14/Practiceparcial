package co.edu.cue.jugueteria.model;

import javax.swing.*;

public class Juguete {
    private String nombre;
    private double precio;
    private int inventario;

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Juguete(String nombre, double precio, int inventario){
        this.nombre=nombre;
        this.precio=precio;
        this.inventario=inventario;
        int opcion=JOptionPane.showOptionDialog(
                null,"Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[] { "Plastico","Tela", "Electronico","Salir" },"null");
        switch (opcion){
            case 0:
                this.material=Material.PLASTICO;
                break;
            case 1:
                this.material=Material.TELA;
                break;
            case 2:
                this.material=Material.ELECTRONIC;
                break;
        }
    }

    public Juguete(String nombre, double precio, int inventario,double material){
        this.nombre=nombre;
        this.precio=precio;
        this.inventario=inventario;
        switch ((int) material){
            case 0:
                this.material=Material.PLASTICO;
                break;
            case 1:
                this.material=Material.TELA;
                break;
            case 2:
                this.material=Material.ELECTRONIC;
                break;
        }
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
