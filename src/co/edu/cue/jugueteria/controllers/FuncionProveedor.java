package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Proveedor;
import co.edu.cue.jugueteria.services.ProveedorService;

import java.util.Random;

public class FuncionProveedor {
    ProveedorService proveedorService=new ProveedorService();
    public void prepararProveedores(){
        for (int x=0;x<5;x++){
            String name="Proveedor "+(x+1);
            String palabra = "";
            int caracteres = (int)(Math.random()*5)+2;
            for (int i=0; i<caracteres; i++){
                int codigoAscii = (int)Math.floor(Math.random()*(122 -
                        97)+97);
                palabra = palabra + (char)codigoAscii;
            }
            String codeProveedor=palabra;
            String Qos="La entrega del producto se realizara en "+(x+(int)(Math.random()*((5-2)+1))+2+" dias");
            int material=(int)((Math.random()*((2-0)+1))+0);
            proveedorService.crearProveedor(name,codeProveedor,Qos,material);
        }
    }

    public void prepararInformarProveedores(){
        proveedorService.informarProveedores();
    }
}
