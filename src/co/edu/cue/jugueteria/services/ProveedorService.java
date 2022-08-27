package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.model.Proveedor;

import javax.swing.*;

public class ProveedorService {
    public Proveedor proveedores[]=new Proveedor[5];

    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
    }

    public void crearProveedor(String name, String codeProveedor, String Qos, int numberMaterial){
        Juguete juguetes[]=new Juguete[10];
        String material="";
        switch (numberMaterial) {
            case 0:
                material = Material.PLASTICO;
                break;
            case 1:
                material = Material.TELA;
                break;
            case 2:
                material = Material.ELECTRONIC;
                break;
        }
        for (int x=0;x<10;x++){
            String nameJuguete=name+" "+(x+1);
            double precioJuguete=((Math.random()*((50000-2)+1))+2000);
            int inventario=100;
            Juguete juguete=new Juguete(nameJuguete,precioJuguete,inventario,codeProveedor);
            juguetes[x]=juguete;
        }
        Proveedor proveedor=new Proveedor(name,codeProveedor,Qos,material,juguetes);
        for(int x=0;x<proveedores.length;x++){
            if(String.valueOf(proveedores[x])=="null"){
                proveedores[x]=proveedor;
                break;
            }
        }

    }


    public void informarProveedores(){
        System.out.println(proveedores[4].getJuguetes()[0]);
        String cadenaProveedores="Los proveedores son de la jugueteria son: \n\n";
        for (int x=0;x<5;x++){
            cadenaProveedores+=(x+1)+"   "+proveedores[x].getName()+"      "+proveedores[x].getCodeProveedor()+"      "+proveedores[x].getMaterial()+"      "+proveedores[x].getQos()+"\n";
        }
        System.out.println(proveedores[0].getJuguetes()[0].getNombre());
        JOptionPane.showMessageDialog(null,cadenaProveedores);
        JOptionPane.showMessageDialog(null,proveedores[0].getJuguetes()[0].getNombre());
    }//finishsh


}
