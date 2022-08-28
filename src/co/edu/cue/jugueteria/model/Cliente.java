package co.edu.cue.jugueteria.model;

public class Cliente extends Usuario{
    private String diaCumple;
    private String correo;

    private int cantidadJuguetes;

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public String getDiaCumple() {
        return diaCumple;
    }

    public void setDiaCumple(String diaCumple) {
        this.diaCumple = diaCumple;
    }

    public String getCorreo() {
        return correo;
    }

    public Cliente(String nombre,String cedula,String telefono, String direccion, String diaCumple, String correo){
        setNombre(nombre);
        setCedula(cedula);
        setTelefono(telefono);
        setDireccion(direccion);
        this.diaCumple=diaCumple;
        this.correo = correo;
        this.cantidadJuguetes=0;

    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
