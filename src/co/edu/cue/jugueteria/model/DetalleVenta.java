package co.edu.cue.jugueteria.model;

public class DetalleVenta {
    private Juguete juguete;
    private int cantidadJuguetes;

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }
    public DetalleVenta(Juguete juguete,int cantidadJuguetes){
        this.juguete=juguete;
        this.cantidadJuguetes=cantidadJuguetes;
    }
}
