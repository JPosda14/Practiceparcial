package co.edu.cue.jugueteria.model;

public class Proveedor {
    private String name;

    private String codeProveedor;

    private String Qos;

    private String material;

    private Juguete juguetes[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeProveedor() {
        return codeProveedor;
    }

    public void setCodeProveedor(String codeProveedor) {
        this.codeProveedor = codeProveedor;
    }

    public String getQos() {
        return Qos;
    }

    public void setQos(String qos) {
        Qos = qos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Juguete[] getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(Juguete[] juguetes) {
        this.juguetes = juguetes;
    }


    public Proveedor(String name,String codeProveedor,String Qos,String material,Juguete juguetes[]){
        this.name=name;
        this.codeProveedor=codeProveedor;
        this.Qos=Qos;
        this.material=material;
        this.juguetes=juguetes;
    }
}
