package co.edu.cue.jugueteria.model;

import javax.swing.*;

public class VentaJuguete {
    private String fechaVenta;
    private Cliente cliente;
    private Empleado empleado;
    private double descuento;
    private DetalleVenta detalleVenta[];
    private double valorTotal;

    public VentaJuguete(String fechaVenta,Cliente cliente,Empleado empleado,double descuento,DetalleVenta detalleVenta[]){
        this.fechaVenta=fechaVenta;
        this.cliente=cliente;
        this.empleado=empleado;
        this.descuento=descuento;
        this.detalleVenta=detalleVenta;
        this.valorTotal=0;
    }
    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public DetalleVenta[] getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta[] detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


}
