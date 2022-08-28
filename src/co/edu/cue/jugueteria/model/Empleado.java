package co.edu.cue.jugueteria.model;

public class Empleado extends Usuario {
    private double salario;
    private String fechaIngreso;

    public int getJuguetesVendidos() {
        return JuguetesVendidos;
    }

    public void setJuguetesVendidos(int juguetesVendidos) {
        JuguetesVendidos = juguetesVendidos;
    }

    private int JuguetesVendidos;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado(String nombre,String cedula,String telefono, String direccion,double salario, String fechaIngreso){
        setNombre(nombre);
        setCedula(cedula);
        setTelefono(telefono);
        setDireccion(direccion);
        this.salario=salario;
        this.fechaIngreso=fechaIngreso;
        this.JuguetesVendidos=0;

    }
}
