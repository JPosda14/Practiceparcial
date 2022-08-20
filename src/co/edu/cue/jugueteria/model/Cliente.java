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

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
