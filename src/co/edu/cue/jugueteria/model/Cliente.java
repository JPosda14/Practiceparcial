package co.edu.cue.jugueteria.model;

public class Cliente extends Usuario{
    private String diaCumple;
    private String correo;

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
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
